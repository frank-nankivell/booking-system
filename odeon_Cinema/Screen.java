package odeon_Cinema;

public class Screen 
{      
	// screen number to set standard number of screens
	/**
	 * @uml.property  name="id"
	 */
	private int id;
	/**
	 * @uml.property  name="seat" multiplicity="(0 -1)" dimension="1"
	 */
	private int[] seat;
	
	/**
	 * @uml.property  name="vIPcount"
	 */
	private int VIPcount;
	/**
	 * @uml.property  name="standardCount"
	 */
	private int standardCount;
	
	public Screen()
	{
		seat = new int[50];
	}

	// method to book seats for Cinema per Screen
	// 1 = vip, and 2 = standard
	
	public void seatBook(int choice)
	{
		while(choice!=0)
		{
			if (choice>2) 
			{
				System.err.print("Cannot complete seat booking");
				choice = 0;
			}
			else
				{
				switch (choice) 
				{
					
					case 1:
							choice = 0;
							bookViP();
							break;
							
			
					case 2: 
							choice=0;
							bookNormal();
							break;
				}	
				}
		}
	}

// method to set VIP seats per Screen, 10 max. Return -1 if full
	public int bookViP() {
		System.out.println("VIP Seat Selected");
		   	for (int x = 0; x < 10; x++) {
		   		if (seat[x] == 0) {
		   			seat[x] = 1;
		   			VIPcount++;
		   			complete();
		               }
		           }
		           return -1;
		       }
	
	
// method to set Normal seats per screen 40 max. Return -1 if full
	public int bookNormal() {
		System.out.println("Normal Seat Selected");
		
	   	for (int x = 0; x < 40; x++) {
	   		if (seat[x] == 0) {
	   			seat[x] = 1;
	   			standardCount++;
	   			complete();
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
	/**
	 * @return
	 * @uml.property  name="standardCount"
	 */
	public int getStandardCount()
	{
		return standardCount;
	}

	// Accessor for id
	/**
	 * @return
	 * @uml.property  name="id"
	 */
	public int getId() {
		return id;
	}
	// mutator for id
	/**
	 * @param id
	 * @uml.property  name="id"
	 */
	public void setId(int id) {
		this.id = id;
	}
	// method to check booking complete
	public boolean complete()
	{
		return true;
	}
	
}

	
	
	
	
