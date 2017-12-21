import java.util.concurrent.atomic.AtomicInteger;

// currently setup to take one customer. Need to be able to take numerous Customers.
public class Customer {
		   //Private fields
		   private String firstName;
		   private String lastName;
		   private String email;
		   private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
		 
		   //Constructor method
		   public Customer(String firstName, String lastName, String email)
		   {
		     this.firstName = firstName;
		     this.lastName = lastName;
		     this.email = email;
		   }
		   // Accessor for firstName
		   public String getFirstName()
		   {
		     return firstName;
		   }
		 
		   //Accessor for lastName
		   public String getLastName()
		   {
		     return lastName;
		   }
		   // Accessor for email
		   public String getEmail()
		   { 
		       return email;
		   }
		   // method to get full name
		   public String fullName()
		   {
			   String name = (firstName + lastName);
			   return name;
		   }
		     
		   // Accessor for ID generator
		public static AtomicInteger getID_GENERATOR() {
			return ID_GENERATOR;
		}
		// mutator for ID generator
		public static void setID_GENERATOR(AtomicInteger iD_GENERATOR) {
			ID_GENERATOR = iD_GENERATOR;
		}
		}