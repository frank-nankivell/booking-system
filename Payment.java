public class Payment 
{
    Ticket ticket;
    private double purchase;
	private double amountPaid;
	
	public Payment(double amountPaid, Ticket ticket)
	{
		ticket = this.ticket;
		amountPaid = this.amountPaid;
	}
	
	public void calculateCost() 
	{
		//possibly not correct as only takes 1 ticket cost
		purchase = ticket.getTicketCost();
	}
	
	public void makePayment(double amountPaid)
	{
		boolean paymentSuccess = false;
		
			if (paymentSuccess==false)
			{
				if(amountPaid == purchase) 
				{
				System.out.println("Payment made succesfully!");
				paymentSuccess = true;
				}
		else
		{ 
			double costRemaining = purchase-amountPaid;	
			System.err.println("Insufficient payment made, please enter" + costRemaining);
			//Comment: need some way of looping back round here.
		}
	}
	}
}

		
