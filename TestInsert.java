import java.util.ArrayList;

public class TestInsert {
	
	// 15 Customers.
	Customer c1 = new Customer("test1", "test1","email1");
	Customer c2 = new Customer ("Jon","Jones", "jj@email.com");
	Customer c3 = new Customer ("Teddy","Brian", "Tj@email.com");
	Customer c4 = new Customer("4first", "4last", "4@email.com");
	Customer c5 = new Customer ("5first", "5last", "5@email.com");
	Customer c6 = new Customer ("6first", "6last", "6@email.com");
	Customer c7 = new Customer ("7first", "7last", "7@email.com");
	Customer c8 = new Customer ("8first", "8last", "8@email.com");
	Customer c9 = new Customer ("9first", "9last", "9@email.com");
	Customer c10 = new Customer ("10first", "10last", "10@email.com");
	Customer c11 = new Customer ("11first", "111last", "11@email.com");
	Customer c12 = new Customer ("12first", "12last", "12@email.com");
	Customer c13 = new Customer ("13first", "13last", "13@email.com");
	Customer c14 = new Customer ("14first", "14last", "14@email.com");
	Customer c15 = new Customer ("15first", "15last", "15@email.com");
	
	// 5 Films
	Film f1 = new Film("Harry Potter", 001);
	Film f2 = new Film("Matrix", 002);
	Film f3 = new Film("Moonlight", 003);
	Film f4 = new Film("Mr Beans Holiday", 004);
	Film f5 = new Film("Lost in Tranlsation", 005);

	// 3 dates used for ticket selection
	Date d1 = new Date("12/01/2019");
	Date d2 = new Date("03/01/2019");
	Date d3 = new Date("05/01/2019");

	public void addCustomers()
	{
	ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		customerList.add(c6);
		customerList.add(c7);
		customerList.add(c8);
		customerList.add(c9);
		customerList.add(c10);
		customerList.add(c11);
		customerList.add(c12);
		customerList.add(c13);
		customerList.add(c14);
		customerList.add(c15);

	}
	public  void addFilms()
	{
	ArrayList<Film> filmList = new ArrayList<>();
		filmList.add(f1);
		filmList.add(f2);
		filmList.add(f3);
		filmList.add(f4);
		filmList.add(f5);
	}

	public void addTickets()
	{
		Ticket t1 = new Ticket(001, c1, d1, f1, 0,"Morning", 1, 6.99); // ticket for customer1, vip
		Ticket t2 = new Ticket(002, c2, d2, f1, 1,"Afternoon", 1, 7.99); //ticket for customer2, vip
		Ticket t3 = new Ticket(003, c3, d3, f3, 1,"Early Evening", 1, 6.99); // ticket for customer3, vip
		Ticket t4 = new Ticket(004, c4, d1 , f4, 1,"Evening Late", 1, 6.99); // ticket for customer 4, vip
		Ticket t5 = new Ticket(005, c5, d2 , f5, 1,"Morning", 1, 6.99); // // ticket for customer 5, vip
		Ticket t6 = new Ticket(006, c6, d3 , f1, 1,"Afternoon", 1, 6.99);
		Ticket t7 = new Ticket(007, c7, d1 , f2, 1,"Early Evening", 1, 6.99);
		Ticket t8 = new Ticket(8, c8, d2 , f3, 1,"Evening Late", 1, 6.99);
		Ticket t9 = new Ticket(9, c9, d3 , f1, 2,"Morning", 2, 6.99);
		Ticket t10 = new Ticket(010, c10, d1 , f2, 2,"Afternoon", 2, 6.99);
		Ticket t11 = new Ticket(011, c11, d2 , f3, 2,"Early Evening", 2, 6.99);
		Ticket t12 = new Ticket(012, c12, d3 , f1, 2,"Evening Late", 2, 6.99);
		Ticket t13 = new Ticket(013, c13, d1 , f1,2,"Morning", 2, 6.99);
		Ticket t14 = new Ticket(014, c14, d2 , f1, 2,"Afternoon", 2, 6.99);
		Ticket t15 = new Ticket(015, c15, d3, f1, 2,"Early Evening", 2, 6.99);
	
		
		ArrayList<Ticket> ticketList = new ArrayList<>();
		ticketList.add(t1);
		ticketList.add(t2);
		ticketList.add(t3);
		ticketList.add(t4);
		ticketList.add(t5);
		ticketList.add(t6);
		ticketList.add(t7);
		ticketList.add(t8);
		ticketList.add(t9);
		ticketList.add(t10);
		ticketList.add(t11);
		ticketList.add(t12);
		ticketList.add(t13);
		ticketList.add(t14);
		ticketList.add(t15);
	}
	
	public void addReviews()
	{
		Review r1 = new Review (c1,f1,1, "Not a good film");
		Review r2 = new Review (c2,f1,2, "Poor film");
		Review r3 = new Review (c3,f3,3, "Okay film");
		Review r4 = new Review (c4,f4,4, "Good film");
		Review r5 = new Review (c5,f5,5, "Great film");
		Review r6 = new Review (c6,f1,1, "Not a good film");
		Review r7 = new Review (c7,f2,2, "Poor film");
		Review r8 = new Review (c8,f3,3, "Yeh it was allright...");
		Review r9 = new Review (c9,f1,4, "I liked it");
		Review r10 = new Review (c10,f1,5, "The best ever");
		
		ArrayList<Review> reviewList = new ArrayList<>();
		reviewList.add(r1);
		reviewList.add(r2);
		reviewList.add(r3);
		reviewList.add(r4);
		reviewList.add(r5);
		reviewList.add(r6);
		reviewList.add(r7);
		reviewList.add(r8);
		reviewList.add(r9);
		reviewList.add(r10);

		
	}
}







