package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.db.DataSourceConnectionFactory;
import com.example.entity.Account;
import com.example.exception.DataAccessException;

public class JdbcAccountRepository implements AccountRepository {

	@Override
	public Account loadAccount(String number) {
		Account account = null;
		try {
			Connection connection = DataSourceConnectionFactory.getConnection();
			String sql = "select * from accounts where number=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, number);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				account = new Account();
				account.setNumber(number);
				account.setBalance(resultSet.getDouble(2));
			}
		} catch (SQLException e) {
			throw new DataAccessException(e.getMessage());
		}
		return account;
	}

	@Override
	public Account updateAccount(Account account) {
		try {
			Connection connection = DataSourceConnectionFactory.getConnection();
			String sql = "update accounts set balance=? where number=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, account.getBalance());
			preparedStatement.setString(2, account.getNumber());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new DataAccessException(e.getMessage());
		}
		return account;
	}

}
