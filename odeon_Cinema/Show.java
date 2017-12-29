package odeon_Cinema;
import java.util.Arrays;
import java.util.HashMap;

public class Show 
{
	
	private String[] val = {"Morning","Afternoon","Evening Early", "Evening Late"};

	private HashMap <String, Double> showPrice = new HashMap<>();

	private HashMap< String, Double> showTime = new HashMap<>();
	
	// value to store selected price
	private double price;

	private double time;

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
		     System.out.println("[" + (i + 1) + "] " + key + " " + value);
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
				        System.out.println("Time selected is: " + time); 
				        price = x;
				        System.out.println("The" + time + " O'clock show costs: " + price + "");
					}
				}
		}
		
		// method check if value is present within list
		public boolean checkShow(String option)
		{
			if(Arrays.asList(val).contains(option))
			{
				return true;
			}
			{
				return false;
			}
		}
		
		
		// Accessor for price
		/**
		 * @return
		 * @uml.property  name="price"
		 */
		public double getPrice()
		{
		return price;
		}
		// Accessor for time
		/**
		 * @return
		 * @uml.property  name="time"
		 */
		public double getTime()
		{
			return time;
		}
}
	
	


	
	

