package odeon_Cinema;

import java.util.Calendar;

public class Review
{
	/* value field is rating of the film
	 * description field is review of the film
	 * film field is the film the customer saw
	 * customer field is the customer completing the review
	 * reviewComplete checks if the review has been completed
	 */

	private Customer customer;

	private Film film;
	
	private Date date;

	private int value;

	private String description;

	private boolean reviewComplete;
	
	
	private Calendar cal = Calendar.getInstance();
	// constructor for review class. need to amend to check value is 1-5
	public Review (Customer customer, Film film, Date date, int value, String description)
	{
		checkValue(value);
		this.customer = customer;
		this.film = film;
		this.date = date;
		this.description = description;
		if (reviewComplete == true)
		{
			this.value = value;
			archive();
			
		}
	}
	
	// process to checkReview entered correctly
	public void checkValue(int value) 
	{
			if ((value > 0 && value <= 5))
			{
				
				reviewComplete =true;
			
			}
					else 
				{
					reviewComplete=false;
					
			}
	}
	
	/* Method to archive date and value 
	 * Only archives date that equal to this month as per coursework
	 */
	public void archive()
	{
		String a = date.monthYear(); // get a string of the entered month and year
	//	System.out.println("ENTERED month year entered is " +a);  for testing system 
		String b = date.nowMonthYear(); // gets a string of todays entered month and year
	//	System.out.println("TODAYS month and year  is " +b); for testing system 
		if(a.equals(b)) // checks if todays month is the month the ticket was made for
	//	{
			System.out.println("Review is in this month");
			film.incrementRev(); // increases reviewer by 1
			film.archiveReview(value); // increases reviewer by value enterd in review
	//	}
			System.out.println("Review is not in this month");
	}

// Accessor for description of review

	public String getDescription() 
	{
	return description;
	}
	
// Mutator for description of review

	public void setDescription(String newDescription)
	{
		 description = newDescription;
	}
// Accessor for rating value, int 'value'

		public int getValue() 
	{
		return value;
	}
		
	/* Mutator for rating value, int 'value'
	 * includes functionality to check if value is between 0 
	 */
	   	public void setValue(int newValue) 
	   	{
	   	 if (newValue < 0 || newValue > 5) 
	   	 {
	         throw new IllegalArgumentException(value +"not between 1 and 5");
	      } else {
	      value = newValue; 
	    }
	   }
	   	
	public Customer getCustomer() {
		return customer;
	}
	
	// mutator for customer

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

// method to print out current review and value of rating
	public void printOut() 
	{
		if(reviewComplete == true) 
		{
			System.out.println("A Review for " + film + " was entered correctly.");
			}
		}

	
}