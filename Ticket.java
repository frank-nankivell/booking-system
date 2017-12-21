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
    private Film film;
	private double showTime;
	private Date showDate;
	private int seatNo;
	private int paymentType;
	
	
    private boolean ticketBooked = false;
	Date timenow = new Date();
	
	// Constructor for Ticket class
    public Ticket(Customer customer, Film film, double ShowTime, Date showDate, int seatNo, int PaymentType, int paymentType, double showTime)
    {
    		this.customer = customer;
    		this.film = film;
    		this.showTime = showTime;
    		this.showDate = showDate;
    		this.seatNo = seatNo;
    		this.paymentType = paymentType;
    }
    
	// method to set film Name. Need to return id to archive
		public void selectFilm()
		{
			
			
		}
    		// method to set show date
    		public void selectShowDate(Date date)
		{
    			
		}

		/* method to select film Time. Checks input against time variable in show
		 *  return cost and time
		 */
		public void selectShowTime(double time)
		{
			List<Show> shows = new ArrayList<>(4);
			
			if (time
			{
				
				
			}
				
			
		}
		
		// method to set number of seats
		public void numberofSeats(int seats)
		{

		}
	
		
		// method to choose payment type	
		public void selectPayment(int paymentType)
		
		{
			switch(paymentType)
			
				case:1
			
		}
		
		
		
		// method to confirm date of Ticketbooking is today. 
		public Date bookingDate()
		{
			return timenow;
		}
		
		
		// method to print out ticket
		public void printTicket()
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