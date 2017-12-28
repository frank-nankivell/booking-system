import java.util.HashMap;

public class Show 
{
	
	private String[] val = {"Morning","Afternoon","Evening Early", "Evening Late"};
	private HashMap <String, Double> showPrice = new HashMap<>();
	private HashMap< String, Double> showTime = new HashMap<>();
	
	// value to store selected price
	private double price;
	private double time;
	/* constructor to take store all values for time and price of shows
	*/
	
	public Show()
	{
		showPrice.put(val[0], 5.99);
		showPrice.put(val[1], 3.99);
		showPrice.put(val[2], 7.99);
		showPrice.put(val[3], 6.99);
		
		showTime.put(val[0], 11.00);
		showTime.put(val[1], 15.30);
		showTime.put(val[2], 19.00);
		showTime.put(val[3], 21.00);
	}
	
	// method to print out all prices of shows in order
	public void displayPriceAll()
	{ 
		for (int i = 0; i < val.length; i++) 
		{
	        String key =  val[i];
	        String value = showPrice.get(key).toString();
	        System.out.println("[" + (i + 1) + "] " + key + " " + value);
		}
	}
	// method to print out all times of shows in order
	public void displayTimeAll()
	{ 
		for (int i = 0; i < val.length; i++) 
		{
		     String key =  val[i];
		     String value = showTime.get(key).toString();
		     System.out.println("" + (i + 1) + "" + key + " " + value);
			}
	}

	
	// method to print Time from hashMap if equal to option!!!!
		public void selectTime(String option)
		{ 
			for (int i = 0; i < val.length; i++) 
				if(option == val[i])
				{
					{
				        String key =  val[i];
				        String time = showTime.get(key).toString();
				        double x  = showPrice.get(key);
				        System.out.println(time);
				        price = x;
					}
				}
		}
		
		// Accessor for price
		public double getPrice()
		{
		return price;
		}
		// Accessor for time
		public double getTime()
		{
			return time;
		}
}
	
	


	
	

