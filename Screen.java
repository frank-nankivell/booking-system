
public class Screen 
{      
	// screen number to set standard number of screens
	private int id;
	private int[] seat;
	
	private int VIPcount;
	private int standardCount;
	
	public Screen()
	{
		seat = new int[50];
	}

	// method to book seats for Cinema per Screen
	public void seatBook(int choice)
	{
	// exception to check value is a 1 or 2
		if (choice <= 1 && choice >= 2) {
	        throw new IllegalArgumentException("Value must be a 1 or 2!");
	     } else {
			// loop to start seat booking
				while (choice!= 0) {
					int seatX = 0;
					// if a VIP chosen, attempt to book
					if (choice == 1) {
						seatX = bookViP();
						if (seatX == -1) {
							// Seats unavailable for VIP. Loop exits
							System.out.println("Unable to book VIP");
							choice = 0;
							complete();
						}
						else {
							// Vip booked. Counter updates number of VIP booked
							System.out.println("Vip Booked");
							VIPcount ++;
							complete();
							
						}
				}
				
			// if a normal seat Chosen, attempt to book 
				else if (choice == 2) 
				{
					seatX = bookNormal();
					if(seatX != -1) 
					{
						System.out.println("Unable to book Normal");
						choice = 0;
						complete();
					}
				}
				else {
					System.out.println("Standard Booked");
					choice = 0;
					standardCount ++;
					complete();
					
				}
			}
			
	     }
		}
	
// method to set Vip seats per Screen, 10 max. Return -1 if full
	public int bookViP() {
		   	for (int x = 0; x < 10; x++) {
		   		if (seat[x] == 0) {
		   			seat[x] = 1;
		               }
		           }
		           return -1;
		       }
// method to set Normal seats per screen 40 max. Retunr -1 if full
	public int bookNormal() {
	   	for (int x = 0; x < 40; x++) {
	   		if (seat[x] == 0) {
	   			seat[x] = 1;
	               }
	           }
	           return -1;
	}
	
	// accessor for VIPcounter
	public int getVIPCount()
	{
		return VIPcount;
	}
	// accessor for standard Counter
	public int getStandardCount()
	{
		return standardCount;
	}

	// Accessor for id
	public int getId() {
		return id;
	}
	// mutator for id
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	// method to check booking complete
	public boolean complete()
	{
		return true;
	}
	
}

	
	
	
	
