// Class for Review 

public class Review
{
	Ticket ticket;
	Customer customer;
	private int value;
	private String description;
	
	private boolean reviewComplete = false;

	public Review(String description, int value)
	{
		this.description = description;
		if (value < 0 && value > 5) {
	         throw new IllegalArgumentException("Review must be a numberbetween 1 and 5");
	      } else {
	         this.value= value;
	      }   
	}
// Accessor for description of review
	public String getDescription() 
	{
	return description;
	}
	public void setDescription(String newDescription)
	{
		 description = newDescription;
	}
// Accessor for rating value, int 'value'
		public int getValue() {
		return value;
		}
		
/* Mutator for rating value, int 'value'
 * includes functionality to set 
 */
	   	public void setValue(int newValue) {
	   	 if (newValue < 0 || newValue > 5) {
	         throw new IllegalArgumentException("New review must be a number between 1 and 5");
	      } else {
	      value = newValue;
	    }
	   }
// to check review and rating inputted correctly
	public void checkReview() {
		if ((description.length() <= 5) && (value < 0 && value > 5))
		{
			reviewComplete = true;
		}
	else 
		{
			reviewComplete  = false;
		}
	}
// method to print out current review and value of rating
	public void printOut() {
	if(reviewComplete == true) {
	System.out.println("This review was made by: " + customer.getFirstName()+ customer.getLastName());
	System.out.println("The film was: " + ticket.getFilmName);
	System.out.println("The review said the film was: " + description);
	System.out.println("The rating was: " + value);
	}
	}
}