public class Screen 
{
	
	/* Customer for accessing screen class
	 */
	private Customer customer;
	
	// array of the total number of seats
	private int [] seat = new int[50];
	
	// screen number to set standard number of screens
	private int[] screenNumber = {1,2,3,4,5,6};
	
	
	
	//Constructor for Screen class
	public Screen(Customer customer)
	{
		this.customer = customer;
	}
	
	 // Accessor for ScreenNumber
			public int [] getScreenNumber() 
			{
				return screenNumber;
			}
			
	// class to select type of seat at screen // maybe this needs to be in ticket class
			public int selectSeat(int value)
			{
				System.out.println("Enter a 1 for VIP and 2 for standard seating");
				int x = 0;
				int y = 0;	
			if (value==1 || value==2)
			{
				switch(value)
				{
				
				case 1:
				System.out.println("VIP selected");
				x++;
				break;		
				
				case 2:
				System.out.println("Standard selected");
				y++;
				break;
				}
				
				{
					// need to loop back round
					System.out.println("Please retry");
				}
			}
			
			private int bookVIP() 
			{
				for (int i = 0; i<10; i++) {
					if (seat[i] == 0) {
						seat[i] =1;
						return i +1;
					}
				}
				return -1;
			}
			private int bookStandard() 
			{
				for (int i = 0; i<40; i++) {
					if (seat[i] == 0) {
						seat[i] =1;
						return i +1;
					}
				}
				return -1;
			}
			}
}

			

	