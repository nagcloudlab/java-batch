package com.example;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.TransferService;
import com.example.service.UPITrainerService;

public class Application {

	public static void main(String[] args) {

		// -----------------------------------
		// init / boot phase
		// -----------------------------------
		AccountRepository jdbcAccountRepository=new JdbcAccountRepository();
		AccountRepository jpaAccountRepository=new JpaAccountRepository();
		TransferService trainerService = new UPITrainerService(jpaAccountRepository);
		System.out.println("-".repeat(50));

		// -----------------------------------
		// use phase
		// -----------------------------------

		trainerService.transfer(300.00, "1", "2");
		System.out.println();
		trainerService.transfer(300.00, "2", "1");

		System.out.println("-".repeat(50));
		// -----------------------------------
		// Destroy phase
		// -----------------------------------

	}

}
