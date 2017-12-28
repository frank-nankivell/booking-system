import java.util.ArrayList;

public class TestInsert {
	
private static String customer1first = "First1";
private static String customer1last = "last2";
private static String email1 = "email1@email.com";
Customer c1 = new Customer(customer1first, customer1last, email1);
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

Film f1 = new Film("Harry Potter", 001);
Film f2 = new Film("Matrix", 002);
Film f3 = new Film("Moonlight", 003);
Film f4 = new Film("Mr Beans Holiday", 004);
Film f5 = new Film("Lost in Tranlsation", 005);

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
public void addFilms()
{
	ArrayList<Film> filmList = new ArrayList<>();
	filmList.add(f1);
	filmList.add(f2);
	filmList.add(f3);
	filmList.add(f4);
	filmList.add(f5);

}

public void addTickets()

}








