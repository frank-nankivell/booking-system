package odeon_Cinema;

import java.util.Calendar;

public class Payment 
{

    private boolean paymentSuccess;
    private double amount;
    private double purchase;
    private double bal;

    private Film film; 
    private Date ticketDate;
    private Customer customer;
    
    private Calendar cal = Calendar.getInstance();
	
    // constructor for standard payment class
	public Payment(Customer customer, Date ticketDate, Film film, double purchase)
	{
		this.setCustomer(customer);
		this.film = film;
		this.purchase = purchase;
		this.ticketDate = ticketDate;
		this.paymentSuccess = false;
	}

	
	
	/* method to process payment
	 * loops until amount entered is amount of cost
	 */
	public void makePayment(double amount)
	{	
				 if (paymentSuccess==false)
				{
					if(amount > purchase) 
					{
						System.out.println("Payment made succesfully!");
						paymentSuccess = true;
						updateBalCustomer();
						printReciept();
						archivePayment();
						
					}
				else
					{ 
					
					double costRemaining = (purchase-amount);	
					System.err.println("Insufficient funds available, please enter: " + costRemaining);
					paymentSuccess = false;
					}
				}
			}
	
	
	/* Method to archive date and value 
	 * Only archives date that equal to this month as per courswork
	 */
	
	// method to archive income and date of show 
	public void archivePayment()
	{
		String a = ticketDate.monthYear(); // get a string of the entered month and year
		String b = ticketDate.nowMonthYear(); // gets a string of todays entered month and year
		if(a.equals(b)) // checks if todays month is the month the ticket was made for
		film.archiveIncome(purchase);
	}
	

	// Method to update customers balance.
	// Needs to vary for credit card and cash payment!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void updateBalCustomer() 
	{
		bal = amount-purchase;
		customer.setCash(bal);
		
	}

	// method to print reciept
	public void printReciept()
	{
		System.out.println("Reciept of ticket purchase is for amount of " + purchase);
		System.out.println();
		System.out.println("Thank you ");
	}


	//
	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}



		
