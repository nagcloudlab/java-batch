package com.example.entity;

import java.util.List;

public class Account {
	
	private String number;
	private double balance;
	
	private List<Transaction> transactions;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", transactions=" + transactions + "]";
	}
	
	
	
	
	
	

}
