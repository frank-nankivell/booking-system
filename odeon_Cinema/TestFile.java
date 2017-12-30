package odeon_Cinema;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
public class TestFile {
	
	private static TestInsert testInsert = new TestInsert();
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Attempting Customer Load");
		testInsert.addCustomers();
		System.out.println("Customers added");
		
		System.out.println("Attempting Film Load");
		testInsert.addFilms();
		System.out.println("Films added");
		
		System.out.println("Attempting ticket Load");
		testInsert.addTickets();
		System.out.println("Tickets added");
		
		System.out.println("Attempting review load");
		testInsert.addReviews();
		
		System.out.println("Welcome to Odeon Cinema Monthly Report");
		System.out.println("The reports you will see are for the current month " + new SimpleDateFormat("MMMMMMMMM").format(cal.getTime()));
		System.out.println();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
		while (true)
		{
			System.out.println("System Menu");
			System.out.println("Enter 1 for " + new SimpleDateFormat("MMMMMMMMM").format(cal.getTime()) + " Report 1");
			System.out.println("Enter 2 for " + new SimpleDateFormat("MMMMMMMMM").format(cal.getTime()) + " Report 2");
			System.out.println("Enter 3 to exit Program");
			int input = Integer.parseInt(bufferedReader.readLine());
		    switch (input) {
		        case 1:
		            System.out.println("report 1 request");
		            testInsert.report1();
		            break;
		            
		        case 2:
		            System.out.println("Report 2 Requested");
		            System.out.println();
		            System.out.println();
		            
		            testInsert.report2();
		            break;
		       
		        case 3:
		        		System.out.println("Program Exit");
		        		System.exit(0);
		        		
		        		default :
		            System.out.println("Incorrect Input!");
	            
	    		}
	    }
	
	}
}	

