public class Film {

	// Film Name
	private String filmName;
	// Film ID
	private int filmID;

	private int count; // int for counting number of people who went to a film. Increments 1 each time
	private int rev; // int for count number of people who wrote a review.Increments 1 each time
	private int revVal; //int for storing review of each person,
	
	// 
	// private String viewing;

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
			this.count = count++;
		}
		// accessor for number of people who wrote a review
		public int getRev() {
			return rev;
		}
		// mutator for number of people who wrote a review
		public void incrementRev() {
			this.rev = rev++;
		}
		// accessor for review value
		public int getRevVal() {
			return revVal;
		}
		// mutator for review value
		public void setRevVal(int revVal) {
			this.revVal = revVal;
		}
		
		// method to calculate average review of film
		public int averageReview()
		{
			int value = revVal / rev;
			return value;
		}
}
		
