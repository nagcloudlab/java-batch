package com.example.web;

import java.io.IOException;
import java.util.List;

import com.example.entity.Transaction;
import com.example.repository.JdbcTransactionRepository;
import com.example.repository.TransactionRepository;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/statement")
public class StatementServlet extends HttpServlet {

	TransactionRepository transactionRepository = new JdbcTransactionRepository();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Transaction> transactions = transactionRepository.findAll();

		req.setAttribute("allTransactions", transactions);

		req.getRequestDispatcher("statement.jsp").forward(req, resp);

	}

}
