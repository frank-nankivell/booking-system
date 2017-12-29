package odeon_Cinema;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Film {

	private String filmName; // Film Name

	private int filmID; 	// Film ID
	
	ArrayList<Integer> r = new ArrayList<>(); // ArrayList to store data review scores

	ArrayList<Double> income = new ArrayList<>(); // ArrayList to store income from reviews

	private int count; // int for counting number of people who went to a film. Increments 1 each time

	private int rev; // int for count number of people who wrote a review.Increments 1 each time
	

		// Constructor for film class
		public Film (String filmName,int filmID)
		{
			this.filmID = filmID;
			this.filmName = filmName;
		}

		// Accessor filmID

		public int getFilmID() {
			return filmID;
		}
		// Mutator filmID

		public void setFilmID(int filmID) {
			this.filmID = filmID;
		}
		// Accessor filmName
		public String getFilmName() {
			return filmName;
		}
		// Mutator filmName
		public void setFilmName(String filmName) {
			this.filmName = filmName;
		}
		
		// Accessor of film count. 
		public int getCount() {
			return count;
		}
		// Mutator of film count
		public void incrementCount() {
			count++;
		}
		// accessor for number of people who wrote a review
		public int getRev() {
			return rev;
		}
		
		// Mutator of rev count
		public void incrementRev() {
			rev++;
		}

		// method to store review values and dates seen.
		 public void archiveReview(int x)
		 {
			 r.add(x);
		 }
		 
		 // method to store cost of film and date of ticket
		 public void archiveIncome(Double cost)
		 {
			 income.add(cost);
		 }
 
		// Get average review score. Doesn't process if no scores recorded.
		 public int averageReviewScore()
		 {
			Integer sum =0;
			if(!r.isEmpty()) {
				    for (Integer r1 : r) {
				        sum += r1;
				    }
				    return (sum / r.size());
				  }
				  return sum;
				}		 
		 		 
		 // method to calculate total income from showings
		 public double getIncome()
		 {
			 double sum = 0;
			 for (Double d : income) {
			        sum += d;
			    }
			 return sum;
			}
			 
		
		 // method to calculate total tickets bought for a film
		 public double getTickets()
		 {
			 double x;
			 x= income.size();
			 return x;
				 
		 }

		 // to string method to access names
		  @Override
		    public String toString() {
		     return "" + filmName +"" ;
		  }
}
		
