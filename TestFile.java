import java.util.*;
public class TestFile {
	
	private static TestInsert testInsert = new TestInsert();
	
	public static void main(String[] args)
	{
		System.out.println("Attempting Customer Load");
		testInsert.addCustomers();
		System.out.println("Customers added");
		
		System.out.println("Attempting Film Load");
		testInsert.addFilms();
		System.out.println("Films added");
		
		System.out.println("Attempting ticket Load");
		testInsert.addTickets();
		System.out.println("Tickets added");
		
		System.out.println("Attempting Review load");
		testInsert.addReviews();
		System.out.println("Reviews added");
		
		
		
		printReport1();
	//	printReport2();
		
	
		}
		public static void printReport1()
		{
			ArrayList<Film> f = new ArrayList<>();
			f.stream(); 
			
		}
		public static void printReport2()
		{
			
		}
}