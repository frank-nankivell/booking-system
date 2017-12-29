package odeon_Cinema;
public class Ticket {
	

	private Film film;
	
	private Customer customer;

	private Date date;

	private int ticketID;

	private int paymentType;
	
	private double price;

	private double time;

	private boolean check;
	
	private String month;
	

	// Constructor for Ticket class
    public Ticket (int ticketID, Customer customer, Date date, Film film, int seat, String time, int paymentType) // 
    {
    		System.out.println("Ticket process for ticket ID: " + ticketID + "   Customer name: " + customer.fullName()); 
    		
    		this.ticketID = ticketID;
    		this.date = date;
    		this.customer = customer;
    		this.selectFilm(film);
    		this.selectShowTime(time);
    		this.selectSeats(seat);
    		this.selectPayment(paymentType);
    		this.check = false;
    		ticketBooked();
    		
    }
    // show the film information update on the count per ticket. 
   
  
	// method to set film Name
		public void selectFilm(Film film)
		{
			System.out.println("ticketID" + ticketID + "Process 1: Film Selection");
			System.out.println();
			
			if (film.equals(film))
			{
				this.film = film;
				film.incrementCount(); // to update number of people selecting film
					System.out.println("Film chosen: " + film.getFilmName());
					getDateMonth(date);
					}
			}
		
		public void getDateMonth(Date date)
		{
			int x;
			x = date.getMonth();
			System.out.println("Month is " + x);
			
		}
		/* method to select film time.
		 * return price and update to price
		 */
		public void selectShowTime(String option)
		{	
		//	System.out.println("ticketID  " + ticketID + "Process 2: Checking time of Show: Options available 'Morning', 'Afternoon', 'Evening Early', 'Evening Late'");
			
			Show show = new Show();
			//System.out.println();
			//System.out.println("Prices are below");
			//show.displayPriceAll();
			//System.out.println();
			
			//System.out.println("Times are below");
			//show.displayTimeAll();
				
			// uses checkShow method to ensure option is available
			if (show.checkShow(option))
			{
				System.out.println("Customer selected " + option );
				show.selectTime(option);
				price = show.getPrice();
				time = show.getTime();
			}
				else throw new IllegalArgumentException ("Customer must select option from the list");
		}
			
		// method to set number of seats

		public void selectSeats(int seat)
		{
			Screen screen = new Screen();
			System.out.println("ticketID  " + ticketID + "" +"Process 3: Attempting to book Seat");
			System.out.println();
			if (seat < 1 || seat > 2)
			{
	   	         throw new IllegalArgumentException ("Seat Type must be a 1 or 2");
	   	      } else {
	   	    	  			screen.seatBook(seat);
	   	    	  			if (screen.complete())
	   	    	  			{
	   	    	  		//		selectPayment(paymentType);
	   	    	  			}
	   	      }
		}
		
		// method to choose payment type	and process payment
		public void selectPayment(int paymentType)
		{
			//System.out.println("ticketID  " + ticketID + "" + "Process 4. Checking option for payment. 1 for Credit card, 2 for Cash / Standard");
			//System.out.println();
			
			
				//if (paymentType>2) {
		   	   //      throw new IllegalArgumentException ("Payment Type must be a 1 or 2");
		   	   //   } 
				//	else 
		   	   //   {
					switch (paymentType) 
					{
						case 1:
						System.out.println("Credit Card Payment chosen");
						Payment p = new Payment(this.customer,this.date,this.film, price);
						p.makePayment(customer.getCreditcard());
						ticketBooked();
					//	printTicket();
						
						break;
						
						case 2:
						System.out.println("Cash Payment chosen");
						Payment p2 = new Payment(this.customer,this.date,this.film, price);
						p2.makePayment(customer.getCreditcard());
						ticketBooked();
					//	printTicket();
						break;
					}
		   	      }
	//		}

	
		// method to check ticket correctly purchased
		public boolean ticketBooked()
		{
			return true;
		}
		// accessor ticketID
		/**
		 * @return
		 * @uml.property  name="ticketID"
		 */
		public int getTicketID() {
			return ticketID;
		}

		// mutator ticketID
		/**
		 * @param ticketID
		 * @uml.property  name="ticketID"
		 */
		public void setTicketID(int ticketID) {
			this.ticketID = ticketID;
		}
		
		// method to print out ticket
		public void printTicket()
		{
			if (ticketBooked())
				
			// some method to create new review
			{ // to update film with highest income
				
				System.out.println("Ticket Booked Succefully");
				System.out.println("TicketID" + ticketID);
				System.out.println("Ticket Information for the Odeon Cinema");
				System.out.println(customer.fullName()); // stating customers name
				System.out.println("This ticket cost " + price + "Paid in full");
				System.out.println("Showing is" + time);
				System.out.println("Film Name: " +film.getFilmName() ); // stating film selected
				System.out.println("Date of film" + date);
				
				

			}
		}



}