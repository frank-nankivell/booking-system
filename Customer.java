package odeon_Cinema;
public class Customer {
		   //Private fields
		   /**
		 * @uml.property  name="firstName"
		 */
		private String firstName;
		   /**
		 * @uml.property  name="lastName"
		 */
		private String lastName;
		   /**
		 * @uml.property  name="email"
		 */
		private String email;
		   /**
		 * @uml.property  name="creditcard"
		 */
		private double creditcard;
		   /**
		 * @uml.property  name="cash"
		 */
		private double cash;
		 
		   //Constructor method
		   public Customer(String firstName, String lastName, String email)
		   {
		     this.firstName = firstName;
		     this.lastName = lastName;
		     this.email = email;
		     creditcard = 1000;
		     cash = 10;
		   }
		   // Accessor for firstName
		   /**
		 * @return
		 * @uml.property  name="firstName"
		 */
		public String getFirstName()
		   {
		     return firstName;
		   }
		   //Accessor for lastName
		   /**
		 * @return
		 * @uml.property  name="lastName"
		 */
		public String getLastName()
		   {
		     return lastName;
		   }
		   // Accessor for email
		   /**
		 * @return
		 * @uml.property  name="email"
		 */
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
		   // Accessor for creditcard
			/**
			 * @return
			 * @uml.property  name="creditcard"
			 */
			public double getCreditcard() {
				return creditcard;
			}
			//mutator for creditcard
			/**
			 * @param creditcard
			 * @uml.property  name="creditcard"
			 */
			public void setCreditcard(double creditcard) {
				this.creditcard = creditcard;
			}
			// accessor for cash
			/**
			 * @return
			 * @uml.property  name="cash"
			 */
			public double getCash() {
				return cash;
			}
			// mutator for cash
			/**
			 * @param cash
			 * @uml.property  name="cash"
			 */
			public void setCash(double cash) {
				this.cash = cash;
		}
}