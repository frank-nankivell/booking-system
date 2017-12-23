public class CreditCardPayment extends Payment
{
	//private String cardNumber;
	//private String billingName;
	//private String last4;

	public CreditCardPayment(double purchase) 
	{
		super(purchase);
		//this.billingName = billingName;
		//this.cardNumber = cardNumber;
		// TODO Auto-generated constructor stub
	}
	
	// accessor billingName
	//public String getBillingName() {
	//	return billingName;
	//}
	// mutator billingName 
	//public void setBillingName(String billingName) {
	//	this.billingName = billingName;
	//}
	// accessor cardNumber
	//public String getCardNumber() {
//		return cardNumber;
//	}
	// mutator cardNumber
	//public void setCardNumber(String cardNumber) {
	//	this.cardNumber = cardNumber;
	//}
	// method to get last 4 digits of cardNumber
	//public void last4()
	//{	
	//	if (cardNumber == null || cardNumber.length() < 16) 
	//	{
	//	    last4 = cardNumber;
	//	} 
	//	else 
	//	{
	//	    last4 = cardNumber.substring(cardNumber.length() - 4);
	//	}
//	}
		// method to printRecipet. Overriden from Payment class
		@Override
		public void printReciept() 
		{
			System.out.println("Reciept of ticket purchase is for amount of "  );
			System.out.println("Made by Credit Card");
		//	System.out.println("Card Number: XXXXXXXXXXXX"+last4);
			System.out.println("Thank you ");
		}
		
	}
	

