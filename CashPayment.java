package odeon_Cinema;

public class CashPayment extends Payment {

	double purchase;

    double bal;
  
    double amount;
 
    Customer customer;

    Film film;
    
    Date ticketDate;
  
    private boolean paymentSuccess;
    
	// Constructor for Cash Payment
	public CashPayment(Customer customer, Date ticketDate, Film film, double purchase) 
	{
		super(customer,ticketDate, film, purchase);
	}
	
	
	public void makePayment(double amount)
	{	
				 if (paymentSuccess==false)
				
					if(amount > purchase) 
					{
						System.out.println("Payment made succesfully!");
						paymentSuccess = true;
						updateBal();
						updateBalCustomer();
						printReciept();
						film.archiveIncome(purchase);
					}
				else
					{ 
					
					double costRemaining = (purchase-amount);	
					System.err.println("Insufficient funds available, please enter: " + costRemaining);
					paymentSuccess = false;
					}
				}
			
	
	public Double updateBal() 
	{
		bal = amount-purchase;
		return bal;	
	}
	
	@Override
	public void updateBalCustomer() 
	{
		bal = amount-purchase;
		customer.setCash(bal);
		
	}
		
	@Override
	public void printReciept() 
		
	{
			System.out.println("Reciept of ticket purchase is for amount of "  );
			System.out.println("Change given is." + updateBal() );
			System.out.println("Thank you ");
		}
		
	}
	