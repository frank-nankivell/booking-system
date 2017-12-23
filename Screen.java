
public class Screen 
{      
	// screen number to set standard number of screens
	private int[] screenNumber = {1,2,3,4,5,6};
	private Film film;
	
	
	// Constructor for Screen
	public Screen(Film film)
	{
		this.film = film;
	}
	
	// Accessor for Film
	public Film getfilm()
	{
		return film;
	}
	
	 // Accessor for ScreenNumber
	public int [] getScreenNumber() 
	{
		return screenNumber;
	}
}

			

	