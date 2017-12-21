public class Screen 
{
         
	// screen number to set standard number of screens
	private int[] screenNumber = {1,2,3,4,5,6};

	
	 // Accessor for ScreenNumber
			public int [] getScreenNumber() 
			{
				return screenNumber;
			}
			
		}
			// booking process to select 10 VIP seats 
			public int bookVIP() 
			{
				for (int i = 0; i<10; i++) {
					if (seat[i] == 0) {
						seat[i] =1;
						return i +1;
					}
				}
				return -1;
			}
			
			public int bookStandard() 
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

			

	