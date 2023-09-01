package com.example.repository;

import java.util.List;

import com.example.entity.Transaction;

public interface TransactionRepository {
	
	void save(Transaction transaction);
	List<Transaction> findAll();

}
