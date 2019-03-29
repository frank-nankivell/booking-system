package odeon_Cinema;
public class CreditCardPayment extends Payment
{

	double purchase;
 
    double bal;
  
    double amount;

    Customer customer;

    Film film;
    
    Date ticketDate;
  
    private boolean paymentSuccess;

	// constructor for credit card payment
	public CreditCardPayment(Customer customer, Date ticketDate, Film film, double purchase) 
	{
		super(customer, ticketDate, film, purchase);
		paymentSuccess = false;
	}
	
	// to update customers credit card balance
	
	public void makePayment(double amount)
	{	
				 if (paymentSuccess==false)
				{
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
		customer.setCreditcard(bal);
		
	}
		// method to printRecipet. Overriden from Payment class
	@Override
	public void printReciept() 
	{
			System.out.println("Reciept for payment of " + purchase);
			System.out.println("No change given");
			System.out.println("Thank you ");
		}
		
	}
	

