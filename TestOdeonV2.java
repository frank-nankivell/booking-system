import java.util.*;
public class TestOdeonV2 {
	public static void main(String[] args)
	{
		List<Customer> customers = new ArrayList<>(5); //list to hold all customer names
		    Customer c1 = new Customer("Peter", "Jones", "pjones@test.com" ); //test customer
		    customers.add(c1); //adding test player to the list
		    //customers.add(new Customer("Peter","Jones", "pjones@test.com")); //also possible to add test customer in this way.
		    customers.add(new Customer("2firstname","3lastname","email2@test.com"));
		    customers.add(new Customer("3firstname","3lastname","email3@test.com"));
		    customers.add(new Customer("4firstname","4lastname","email4@test.com"));
		    customers.add(new Customer("5firstname","5lastname","email5@test.com"));
	
	    List<Film> films = new ArrayList<>(5);
			films.add(new Film("A Cambodian Spring"));
			films.add(new Film("Star Wars"));
			films.add(new Film("The Constant Gardner"));
			films.add(new Film("Bruce Almighty")); 
			films.add(new Film("Blue Planet"));
			
		// Constructor is time and price
		//list to hold 4 times and prices
		List<Show> shows = new ArrayList<>(4);
			Show am1 = new Show(5.99, 11.00);
			shows.add(am1);
			Show pm1 = new Show(4.99, 15.30);
			shows.add(pm1);
			Show eve1 = new Show(6.99, 18.00);
			shows.add(eve1);
			Show eve2 = new Show(6.99, 20.00);
			shows.add(eve2);
		}
}
		
		
			
		    
		
		    
	
	
	