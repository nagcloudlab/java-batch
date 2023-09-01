package com.example.service;

import java.time.LocalDateTime;

import com.example.entity.Account;
import com.example.entity.Transaction;
import com.example.entity.TransactionType;
import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.repository.AccountRepository;
import com.example.repository.TransactionRepository;

public class UPITransferService implements TransferService {

	private AccountRepository accountRepository;
	private TransactionRepository transactionRepository;

	public UPITransferService(AccountRepository accountRepository, TransactionRepository transactionRepository) {
		this.accountRepository = accountRepository;
		this.transactionRepository = transactionRepository;
	}

	@Override
	public boolean transfer(double amount, String source, String destination) {

		Account sourceAccount = accountRepository.loadAccount(source);
		if (sourceAccount == null)
			throw new AccountNotFoundException("account not found, number=" + source);

		Account destinationAccount = accountRepository.loadAccount(destination);
		if (destinationAccount == null)
			throw new AccountNotFoundException("account not found, number=" + destination);

		if (sourceAccount.getBalance() < amount)
			throw new AccountBalanceException(
					"No enough balance , balance=" + String.valueOf(sourceAccount.getBalance()));

		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		destinationAccount.setBalance(destinationAccount.getBalance() + amount);

		accountRepository.updateAccount(sourceAccount);
		accountRepository.updateAccount(destinationAccount);

		Transaction debitTransaction = new Transaction();
		debitTransaction.setType(TransactionType.DEBIT);
		debitTransaction.setAmount(amount);
		debitTransaction.setLocalDateTime(LocalDateTime.now());
		debitTransaction.setAccount(sourceAccount);

		Transaction creditTransaction = new Transaction();
		creditTransaction.setType(TransactionType.CREDIT);
		creditTransaction.setAmount(amount);
		creditTransaction.setLocalDateTime(LocalDateTime.now());
		creditTransaction.setAccount(destinationAccount);

		transactionRepository.save(debitTransaction);
		transactionRepository.save(creditTransaction);

		return true;
	}
}
