
public class CreditCardPayment extends Payment {
	

	public CreditCardPayment(double amountPaid, Ticket ticket ) {
		super(amountPaid, ticket);
		
	}
	private String creditCardNumber;
	private String cardHolderName;
	private String postCode;
	
	public CreditCardPayment(String creditCardNumber, String cardHolderName, String postCode) {
		
	}
	

}
