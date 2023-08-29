package com.example.repository;

import com.example.entity.Account;

public interface AccountRepository {
	
	Account loadAccount(String number);
	Account updateAccount(Account account);
	
}
