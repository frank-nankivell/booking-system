public class Customer {
		   //Private fields
		   private String firstName;
		   private String lastName;
		   private String email;
		 
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
}