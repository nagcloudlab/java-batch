package com.example.service;

import com.example.model.Account;
import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;

public class UPITrainerService implements TransferService {

	private AccountRepository accountRepository;

	public UPITrainerService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		System.out.println("UPITrainerService component created..");
	}

	public void transfer(double amount, String source, String destination) {
		System.out.println("transfer initiated..");
		Account sourceAccount = accountRepository.loadAccount(source);
		Account destinationAccount = accountRepository.loadAccount(destination);

		System.out.println("debit/credit");
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		destinationAccount.setBalance(destinationAccount.getBalance() + amount);

		accountRepository.updateAccount(sourceAccount);
		accountRepository.updateAccount(destinationAccount);
		System.out.println("transfer completed..");
	}

}
