package com.example.web;

import java.io.IOException;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
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
	private TransferService transferService = new UPITransferService(accountRepository);

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Input
		double amount = Double.parseDouble(req.getParameter("amount"));
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");

		// Process
		transferService.transfer(amount, source, destination);

		// response
		req.getRequestDispatcher("transfer-status.html").forward(req, resp);

	}

}
