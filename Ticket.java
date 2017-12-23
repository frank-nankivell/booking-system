import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {
	
	
	/* Private fields customer
	 * Private field film
	 * Private field showTime to enter time of show
	 * Private field showDate to enter date
	 * Private field seatNo to request number of seats
	 * Private field paymentType to select paymemt Type
	 * Cost to access cost
	 
	 */
	
	
    private Customer customer;
    
    private ArrayList<Film> film = new ArrayList<>();
    private ArrayList<Seat> seat = new ArrayList<>();
    
	// to check ticketBooked
    private boolean ticketBooked = false;
    
    private Date showDate;
   
    // to choose enter number of seats
	private int seatNo;
	
	// to choose payment type
	private int paymentType;
	
	// enter amount of money
	private double money;

	
	
	
	// to be updated from method
	private double price;
	// to be updated from method
	private double showTime;
    Date timenow = new Date();

	private Date date;
	
	// Constructor for Ticket class
    public Ticket (Customer customer, int paymentType, double money, int seatNo) // 
    {
    		this.customer = customer;
    		this.paymentType = paymentType;
    		this.money = money;
    		this.seatNo = seatNo;
    		
    	
    }    
	// method to set film Name. Need to return id to archive
		public void selectFilm()
		{
			this.film = film;

		}
		
		
    		// method to set show date
    		public void selectShowDate(Date date)
		{
    			this.date = date;
    			
		}

		/* method to select film time frame
		 * time then updates the price and time of show
		 */
	
		// method to set number of seats
		public void numberofSeats(int seats)
		{

		}
	
		/* method to select film time.
		 * return price and update to Payment classes
		 */
		public void selectShowTime(String time)
		{	
			System.out.println("Enter time for the show: 'Morning', 'Afternoon', 'Evening Early', 'Evening Late'");
			System.out.println();
			
			Show show = new Show();
			//show.displayTimeAll();
			show.selectTime(time);
			price = show.getPrice();
		}
		
		// method to choose payment type	
		public void selectPayment(int paymentType)
		{
			System.out.println("Enter a 1 for Credit Card Payment or 2 for Cash Payment");
			System.out.println("If 1, provide details");
			boolean check = false;
			
			while( check = false)
			{
				if (paymentType < 0 && paymentType > 2) {
		   	         throw new IllegalArgumentException ("Payment Type must be a 1 or 2");
		   	      } else {
		   	    	  
		   	      }
		   	    	  	check = true;
					switch (paymentType) 
					{
						case 1:
						System.out.println("Credit Card Payment chosen");
						CreditCardPayment credit = new CreditCardPayment(price);
						credit.makePayment(money);
						ticketBooked();
						
						break;
						
						case 2:
						System.out.println("Cash Payment chosen");
						Payment payment = new Payment(price);
						payment.makePayment(money);
						ticketBooked();
						break;
					}
		   	      }
				
			
		}		
		// method to confirm date of Ticketbooking is today. 
		public Date bookingDate()
		{
			return timenow;
		}
	
		// method to check ticket correctly purchased
		public boolean ticketBooked()
		{
			return ticketBooked = true;
		}
		
		// method to print out ticket
		public void printTicket()
		{
			if (ticketBooked = true)
			{
			
				System.out.println("Booking made date: " + timenow.toString()); // stating todays date for booking
				System.out.println(customer.fullName()); // stating customers name
				System.out.println("Film Name: " + film.getfilmName()); // stating film selected
				System.out.println("Total number of seats:" ); // to do total number of seats
				System.out.println("Seat"); // to do seat number and seat type
				System.out.println("Payment type: "); // to do - payment type
				System.out.println(); // reciept info  - to do
				System.out.println();
			}
			
		}
				
	}