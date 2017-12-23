
public class Seat {
	
	/*private int for number of seats
	 * private screen - a single screen available 
	 */
	public int []seats = new int[50];
	private Screen screen;
	// Constructor for Seat
	
	public Seat(Screen screen)
	{
		this.setScreen(screen);
	}
//	accessor for seat
	public int [] getSeat() {
		return getSeat();
	}

	public void setSeat(int [] seat) {
		this.seats = seat;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	

}
