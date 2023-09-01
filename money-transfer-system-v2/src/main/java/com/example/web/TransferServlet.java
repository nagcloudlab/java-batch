package com.example.web;

import java.io.IOException;

import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JdbcTransactionRepository;
import com.example.repository.TransactionRepository;
import com.example.service.TransferService;
import com.example.service.UPITransferService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/transfer" })
public class TransferServlet extends HttpServlet {

	private AccountRepository accountRepository = new JdbcAccountRepository();
	private TransactionRepository transactionRepository = new JdbcTransactionRepository();
	private TransferService transferService = new UPITransferService(accountRepository,transactionRepository);

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Input
		double amount = Double.parseDouble(req.getParameter("amount"));
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");

		try {
			// Process
			transferService.transfer(amount, source, destination);
			// response
			req.setAttribute("message", "Transfer Success");
		} catch (AccountBalanceException | AccountNotFoundException e) {
			req.setAttribute("message", e.getMessage());
		}

		req.getRequestDispatcher("transfer-status.jsp").forward(req, resp);

	}

}
