import java.util.ArrayList;
import java.util.Date;
public class Ticket {
	
	/* class to combine much of system together and print ticket.
	 * 
	 */
	
	
	
	
    private Customer customer;
    private Show show;
    private Film film;
    private Screen screen;
    private Date date;
  
	// Constructor to take all objects above
    public Ticket(Customer customer, Show show, Film film, Screen screen)
    {
    		this.customer = customer;
    		this.film = film;
    		this.show = show;
    		this.screen = screen;
    }
 
		// method to set ticketCost
		public double selectTicketCost()
		{
			double ticketCost = show.getfilmPrice();
			return ticketCost;
		}
		// method to set film Time
		public double selectFilmTime()
		{
			double filmTime = show.getFilmTime();
			return filmTime;
		}
		
		// method to set film Name
		public String selectFilmName()
		{
			String name = film.getfilmName();
			return name;
		}
		
		// method to choose payment type	
		public void paymentChoice(int paymentType)
		{
			
		}
		
		public void printTicket()
		{
			Date timenow = new Date();
			
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