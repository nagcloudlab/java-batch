package com.example.entity;

import java.time.LocalDateTime;

public class Transaction {
	
	private long id;
	private double amount;
	private TransactionType type;
	private LocalDateTime localDateTime;
	
	private Account account;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", type=" + type + ", localDateTime=" + localDateTime
				+ ", account=" + account + "]";
	}
	
	

}
