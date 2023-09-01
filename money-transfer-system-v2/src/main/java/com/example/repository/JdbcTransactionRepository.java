package com.example.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.db.DataSourceConnectionFactory;
import com.example.entity.Account;
import com.example.entity.Transaction;
import com.example.entity.TransactionType;
import com.example.exception.DataAccessException;

public class JdbcTransactionRepository implements TransactionRepository {

	@Override
	public void save(Transaction transaction) {
		try {
			Connection connection = DataSourceConnectionFactory.getConnection();
			String sql = "insert into transactions(amount,txn_type,dateTime,account_number) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, transaction.getAmount());
			preparedStatement.setString(2, transaction.getType().toString());
			preparedStatement.setDate(3, Date.valueOf(transaction.getLocalDateTime().toLocalDate()));
			preparedStatement.setString(4, transaction.getAccount().getNumber());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	@Override
	public List<Transaction> findAll() {

		List<Transaction> transactions = new ArrayList<Transaction>();
		try {
			Connection connection = DataSourceConnectionFactory.getConnection();
			String sql = "select * from transactions";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Transaction transaction = new Transaction();
				transaction.setId(resultSet.getInt(1));
				transaction.setAmount(resultSet.getDouble(2));
				transaction.setType(TransactionType.valueOf(resultSet.getString(3)));
				Account account = new Account();
				account.setNumber(resultSet.getString(4));
				transaction.setAccount(account);
				transactions.add(transaction);
			}
		} catch (SQLException e) {
			throw new DataAccessException(e.getMessage());
		}
		return transactions;

	}

}
