package odeon_Cinema;
import java.util.Map.Entry;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.*;

public class TestInsert {
	
	Calendar cal = Calendar.getInstance();

	ArrayList<Film> filmList = new ArrayList<>();

	ArrayList<Customer> customerList = new ArrayList<>();

	ArrayList<Screen> screenList = new ArrayList<>();

	ArrayList<Ticket> ticketList = new ArrayList<>();

	ArrayList<Review> reviewList = new ArrayList<>();

	HashMap <String, Double> incomeEarnt = new HashMap<>();
	
	
	// 15 Customers

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
	static Film f1 = new Film("Harry Potter", 001);
	static Film f2 = new Film("Matrix", 002);
	static Film f3 = new Film("Moonlight", 003);
	static Film f4 = new Film("Mr Beans Holiday", 004);
	static Film f5 = new Film("Lost in Tranlsation", 005);

	// 15 dates used for ticket selection

	Date d1 = new Date("12.12.2017");
	Date d2 = new Date("13.12.2017");
	Date d3 = new Date("14.12.2017");
	Date d4 = new Date("14.12.2017");
	Date d5 = new Date("14.12.2017");
	Date d6 = new Date("15.12.2017");
	Date d7 = new Date("16.12.2017");
	Date d8 = new Date("17.12.2017");
	Date d9 = new Date("18.12.2017");
	Date d10 = new Date("01.01.2018");
	Date d11 = new Date("02.01.2018");
	Date d12 = new Date("02.01.2018");
	Date d13 = new Date("03.01.2018");
	Date d14 = new Date("04.01.2018");
	Date d15 = new Date("05.01.2018");
	Date d16 = new Date("01.11.2017");
	Date d17 = new Date("29.11.2017");
	Date d18 = new Date("02.01.2018");
	Date d19 = new Date("03.01.2018");
	Date d20 = new Date("04.01.2018");
	Date d21 = new Date("05.01.2018");
	
	// 15 tickets
	
	Ticket t1 = new Ticket(001, c1, d1, f1, 1,"Morning", 1); // ticket for customer1, vip
	Ticket t2 = new Ticket(002, c2, d2, f2, 2,"Afternoon", 1); //ticket for customer2, vip
	Ticket t3 = new Ticket(003, c3, d3, f3, 1,"Evening Early", 1); // ticket for customer3, vip
	Ticket t4 = new Ticket(004, c4, d4 , f1, 1,"Evening Late", 1); // ticket for customer 4, vip
	Ticket t5 = new Ticket(005, c5, d5 , f5, 1,"Morning", 1); // // ticket for customer 5, vip
	Ticket t6 = new Ticket(006, c6, d6 , f1, 1,"Afternoon", 1);
	Ticket t7 = new Ticket(007, c7, d7 , f2, 2,"Evening Early", 1);
	Ticket t8 = new Ticket(8, c8, d8 , f3, 2,"Evening Late", 1);
	Ticket t9 = new Ticket(9, c9, d9 , f2, 2,"Morning", 2);
	Ticket t10 = new Ticket(010, c10, d10 , f2, 2,"Afternoon", 2);
	Ticket t11 = new Ticket(011, c11, d11 , f1, 2,"Evening Early", 2);
	Ticket t12 = new Ticket(012, c12, d12 , f1, 2,"Evening Late", 2);
	Ticket t13 = new Ticket(013, c13, d13 , f2,2,"Morning", 2);
	Ticket t14 = new Ticket(014, c14, d14 , f1, 2,"Afternoon", 2);
	Ticket t15 = new Ticket(015, c15, d15, f1, 2,"Evening Early", 2);
	
	
	Review r1 = new Review (t1,f1,d1, 4, "Not a good film");
	Review r2 = new Review (t2,f1,d2,2, "Poor film");
	Review r3 = new Review (t3,f3,d3,3, "Okay film");
	Review r4 = new Review (t4,f4,d4,4, "Good film");
	Review r5 = new Review (t5,f5,d5,5, "Great film");
	Review r6 = new Review (t6,f1,d6,1, "Not a good film");
	Review r7 = new Review (t7,f2,d7,2, "Poor film");
	Review r8 = new Review (t8,f3,d8,3, "Yeh it was allright...");
	Review r9 = new Review (t9,f1,d9,4, "I liked it");
	Review r10 = new Review (t10,f1,d10,5, "The best ever");
	

	
	public void addCustomers()
	{

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
	public void addFilms()
	{
		filmList.add(f1);
		filmList.add(f2);
		filmList.add(f3);
		filmList.add(f4);
		filmList.add(f5);
	}
	

	public void addTickets()
	{

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
	
	/* method to get 1st report as requested in homework, will print:
	 * name of each film, 
	 * number of each people attending
	 * average review of each film
	 */
	public void report1()
	{
		System.out.println("------------------------------------------------------------");
		System.out.println("//OUTPUT REPORT 1//");
		System.out.println();
		
		System.out.println("The current month is:  " + new SimpleDateFormat("MMMMMMMMM").format(cal.getTime()));
		System.out.println();
		
		System.out.println("These are the films shown in the month of: " + new SimpleDateFormat("MMMMMMMMM").format(cal.getTime()) + " " +" below is the number of spectators and their average review score");
		System.out.println();
		double specs = 0;
		int revNum = 0;
		int review = 0;
		
		for(Film f2: filmList) {
			specs = f2.getCount();
			review = f2.averageReviewScore();
			revNum = f2.getRev();
			System.out.println("Name of film: " + f2);
			System.out.println("The number of spectators to the film was: " + specs);
			System.out.println("The average Review of this film is: " + review);
			System.out.println("(Reviewed this month by " + revNum + ": odeon Customers)");
			
			System.out.println();	
			}
		System.out.println("Have a great day - and remember, keep watching movies!");
		System.out.println("Even if you work in a Cinema!");	
		System.out.println("------------------------------------------------------------");
	}
	// method to get 2nd report as requested in coursework
	public void report2()
	{
		
		double x;
		String name;
		for(Film f: filmList)
		{
			x = f.getIncome();
			name = f.getFilmName();
			incomeEarnt.put(name, x);
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("//OUTPUT REPORT 2//");
		System.out.println();
		System.out.println("The current month is:  " + new SimpleDateFormat("MMMMMMMMM").format(cal.getTime()));
		
		// process to print out each film and their total income for this month
			Map<String, Double> map = new TreeMap<String, Double>(incomeEarnt); 
	        		System.out.println("The order of Films and their list of incomes this month are below:");
	        		Set set2 = map.entrySet();
	        		Iterator iterator2 = set2.iterator();
	        		while(iterator2.hasNext()) {
	             Map.Entry me2 = (Map.Entry)iterator2.next();
	             	System.out.print(me2.getKey() + ": ");
	             	System.out.println(me2.getValue());
        		}
	        	// process to print out 	
        		String a = incomeEarnt.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

        		System.out.println();
        		System.out.println("The highest grossing films is:" + a);
        		System.out.println("------------------------------------------------------------");
	        
	    }
	}
			

		
		
		






