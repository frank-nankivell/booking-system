import java.util.ArrayList;
public class Ticket {
	
    private ArrayList<Customer>customer;
    private ArrayList<Show>show;
    private ArrayList<Film>film;
  
    //need to work on how they choose the filmtime
    private int chosenOption;
	private double ticketTime;
	private double ticketCost;`
	
	// need to build a bigger constructor
    public Ticket()
    {
    }
	// function for user to choose the time of their show which will provide corresponding time and price 
	
    			
// 			accessor for the chosen ticket time
			public double getTicketTime() {
				return ticketTime;
			}
		// accessor for the chosen ticket cost	
			public double getTicketCost() {
				return ticketCost;
			}
			
			public void paymentChoice(int paymentType) {
				try { 
					
				}
			}
				
			}
			
}