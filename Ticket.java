public class Ticket {
	
	private Film film;
	private Customer customer;
	private Date showDate;
	private double money;
	private int ticketID;
	
	
	// to store update prices and times
	private double price;
	private double time;
	private boolean check;

	// Constructor for Ticket class
    public Ticket (Customer customer, Date showDate, Film film, int seat, String time, int paymentType, double money) // 
    {
    		this.film = film;
    		this.showDate = showDate;
    		this.customer = customer;
    		this.selectSeats(seat);
    		this.selectShowTime(time);
    		this.selectPayment(paymentType);
    		this.money = money;
    		this.check = false;
    		
    }
    // show the film informaation update on the count per ticket. 
   
  
	// method to set film Name
		public void selectFilm(Film film)
		{
			this.film = film;
			film.incrementCount(); // to update number of people selecting film
		}
	
		// method to set number of seats
		public void selectSeats(int seat)
		{
			Screen screen = new Screen();
			System.out.println("Enter 1 for a VIP Seat, 2 for a standard seat");
			System.out.println();
			screen.seatBook(seat);	
		}
		
		
		/* method to select film time.
		 * return price and update to price
		 */
		public void selectShowTime(String option)
		{	
			System.out.println("Enter time for the show: 'Morning', 'Afternoon', 'Evening Early', 'Evening Late'");
			System.out.println();
			
			Show show = new Show();
			//show.displayTimeAll();
			show.selectTime(option);
			price = show.getPrice();
			time = show.getTime();
		}
		
		// method to choose payment type	and process payment
		public void selectPayment(int paymentType)
		{
			System.out.println("Enter a 1 for Credit Card Payment or 2 for Cash Payment");
			System.out.println();
			
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
	
		// method to check ticket correctly purchased
		public boolean ticketBooked()
		{
			return true;
		}
		// accessor ticketID
		public int getTicketID() {
			return ticketID;
		}

		// mutator ticketID
		public void setTicketID(int ticketID) {
			this.ticketID = ticketID;
		}
		
		// method to print out ticket
		public void printTicket()
		{
			if (ticketBooked())
				
			// some method to create new review
			{
				System.out.println(ticketID);
				System.out.println("Ticket Information for the Odeon Cinema");
				System.out.println(customer.fullName()); // stating customers name
				System.out.println("This ticket cost " + price + "Paid in full");
				System.out.println("Showing is" + time);
				System.out.println("Film Name: " +film.getFilmName() ); // stating film selected
				System.out.println("Date of film" + showDate);

			}
		}



}