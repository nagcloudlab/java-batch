package com.example;

class AccountNotFoundException extends RuntimeException {
	public AccountNotFoundException(String message) {
		super(message);
	}
}

class AccountBalanceException extends RuntimeException {
	public AccountBalanceException(String message) {
		super(message);
	}
}

//-------------------------------------
// Transfer Module  : Foo
//-------------------------------------

class TranferService {
	public boolean transfer(double amount, String source, String destination) {
		
		System.out.println("Loading source / destination accounts");
		if (source.equals("12345")) {
			throw new AccountNotFoundException("account - " + source);
		}
		double sourceAccountbalance = 100.00;
		if (sourceAccountbalance < amount) {
			throw new AccountBalanceException("current-balance - " + sourceAccountbalance);
		}
//		if(1==1) {
//			throw new Exception("Unknown");
//		}
		System.out.println("debit / credit");
		System.out.println("update accounts");
		return true;
	}
}

//-------------------------------------
//Booking Module :  Foo
//-------------------------------------

class BookingService {
	private TranferService tranferService;

	public BookingService(TranferService tranferService) {
		this.tranferService = tranferService;
	}

	public void bookTicket(double amount, String source) {

		try {
			boolean b = tranferService.transfer(amount, source, "1234567890");
			if (b) {
				System.out.println("Ticket booking confirmed");
			}
		} catch (AccountNotFoundException | AccountBalanceException e) {
			System.out.println("Ex-" + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Application {

	public static void main(String[] args) {

		TranferService tranferService = new TranferService();
		BookingService bookingService = new BookingService(tranferService);

		bookingService.bookTicket(100.00, "123456");

	}

}
