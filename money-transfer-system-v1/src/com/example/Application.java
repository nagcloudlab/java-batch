package com.example;

import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.exception.DataAccessException;
import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.service.TransferService;
import com.example.service.UPITransferService;

public class Application {

	public static void main(String[] args) {

		// -----------------------------------------
		// Init..
		// -----------------------------------------

		AccountRepository accountRepository = new JdbcAccountRepository();
		TransferService transferService = new UPITransferService(accountRepository);

		// -----------------------------------------
		// Use
		// -----------------------------------------
		try {
			boolean b = transferService.transfer(100.00, "1", "2");
			if (b) {
				System.out.println("Transfer success");
			}
		} catch (AccountNotFoundException | AccountBalanceException | DataAccessException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
