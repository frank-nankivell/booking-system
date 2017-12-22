public class Payment 
{
    private boolean paymentSuccess = false;
    private double purchase;
	
    // constructor for standard payment class
	public Payment(double purchase)
	{
		this.purchase = purchase;
	}
	// method to update cost from ticket class
	public void calculateCost() 
	{
	}
	
	/* method to process payment
	 * loops until amount entered is amount of cost
	 */
	public void makePayment(double amount)
	{
			while (paymentSuccess==false)
			{
				if(amount == purchase) 
				{
				System.out.println("Payment made succesfully!");
				paymentSuccess = true;
				printReciept();
				}
			else
				{ 
				double costRemaining = purchase-amount;	
				System.err.println("Insufficient payment made, please enter" + costRemaining);
				paymentSuccess = false;
				}
			}
	}
	// method to print reciept
	public void printReciept()
	{
		System.out.println("Reciept of ticket purchase is for amount of " + purchase);
		System.out.println();
		System.out.println("Thank you ");
	}
	
}



		
