import java.util.Date;
public class Review
{
	/* value field is rating of the film
	 * description field is review of the film
	 * film field is the film the customer saw
	 * customer field is the customer completing the review
	 * reviewComplete checks if the review has been completed
	 */
	private int value;
	private String description;
	private Film film;
	private Customer customer;
	private Ticket ticket;
	
	private boolean reviewComplete = false;
	
	// constructor for review class
	public Review(String description, int value, Film film, Customer customer, Ticket ticket)
	{
		this.description = description;
		if (value < 0 && value > 5) {
	         throw new IllegalArgumentException("Review must be a numberbetween 1 and 5");
	      } else {
	         this.value= value;
	      } 
		this.film = film;
		this.customer = customer;
		this.ticket = ticket;
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
		
// Accessor for film review was based on
		public String getFilmName()
		{
			String value = film.getfilmName();
			return value;
		}
		
/* Mutator for rating value, int 'value'
 * includes functionality to check if value is between 0 
 */
	   	public void setValue(int newValue) 
	   	{
	   	 if (newValue < 0 || newValue > 5) 
	   	 {
	         throw new IllegalArgumentException("New review must be a number between 1 and 5");
	      } else {
	      value = newValue;
	    }
	   }
	   	
/* To check review for two factors: 
 * First that date of review has been entered correctly
 * Second that Review was entered after date of Film Showing
 */
	public void checkReview() 
	{
		Date timenow = new Date();
		
		if (timenow > ticket.bookingDate())
		{
			if ((description.length() <= 5) && (value < 0 && value > 5))
			{
				reviewComplete = true;
			}
				else 
			{
				reviewComplete  = false;
			}
		}
		{
			reviewComplete = false;
		}
			
	}

// method to print out current review and value of rating
	public void printOut() 
	{
		if(reviewComplete == true) 
		{

			System.out.println("This review was made by: " + customer.fullName());
			System.out.println("This review was for the film" + film.getfilmName());
			System.out.println("The review said the film was: " + description);
			System.out.println("The rating was: " + value);
			}
		}
}