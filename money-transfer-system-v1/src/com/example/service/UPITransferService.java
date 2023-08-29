package com.example.service;

import com.example.entity.Account;
import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.repository.AccountRepository;

public class UPITransferService implements TransferService {
	private AccountRepository accountRepository;
	public UPITransferService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	@Override
	public boolean transfer(double amount, String source, String destination) {

		Account sourceAccount = accountRepository.loadAccount(source);
		if (sourceAccount == null)
			throw new AccountNotFoundException(source);

		Account destinationAccount = accountRepository.loadAccount(destination);
		if (destinationAccount == null)
			throw new AccountNotFoundException(destination);

		if (sourceAccount.getBalance() < amount)
			throw new AccountBalanceException(String.valueOf(sourceAccount.getBalance()));

		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		destinationAccount.setBalance(destinationAccount.getBalance() + amount);

		accountRepository.updateAccount(sourceAccount);
		accountRepository.updateAccount(destinationAccount);
		return true;
	}
}
