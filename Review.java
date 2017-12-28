
public class Review
{
	/* value field is rating of the film
	 * description field is review of the film
	 * film field is the film the customer saw
	 * customer field is the customer completing the review
	 * reviewComplete checks if the review has been completed
	 */
	
	private Film film;
	private Ticket ticket;
	private int value;
	private String description;

	
	private boolean reviewComplete;
	
	// constructor for review class. need to amend to check value is 1-5
	public Review (Film film, Ticket ticket, int value, String description)
	{
		this.film = film;
		this.ticket = ticket;
		this.description = description;
		this.value = value;
		reviewComplete = false;
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
			if ((description.length() <= 5) && (value < 0 && value > 5))
			{
				reviewComplete = true;
				printOut();
				film.setRevVal(value);
				film.incrementRev();
			}
					else 
				{
					reviewComplete  = false;
			}
			
	}

// method to print out current review and value of rating
	public void printOut() 
	{
		if(reviewComplete == true) 
		{;
			System.out.println("The review said the film was: " + description);
			System.out.println("The rating was: " + value);
			}
		}
}