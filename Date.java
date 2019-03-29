package odeon_Cinema;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.io.*;

import java.time.LocalDateTime;

public class Date {
    private int day;
    private int month;
    private int year;
    private String monthName;
    private String date;

    public Date(String date)
    {
    		checkDate();
    		if(checkDate())
    		{
    			splitDate(date);
    		}
    		{
    			System.err.println("Date inputted wrong format. Must be (dd/mm/yyyy). Re-enter");
    		}
    }
   
    // expand method to check date works
    public boolean checkDate()
    {
    	
    		return true;
    }
    // method to split date into sections to process 
    public void splitDate(String date)
    {
	    	try
	    	{
	    		String [] dateParts = date.split("\\.");
	    		 day = Integer.parseInt(dateParts[0]);
	    		 month = Integer.parseInt(dateParts[1]);
	    		 year = Integer.parseInt(dateParts[2]);
	    		System.out.println("date split");
	    	
	    	}catch(NumberFormatException ex) {
   
	    	}
    }
    
    // method to calculate current month year
   
    
    
    // method to get a string of the current month and year.
    public String nowMonthYear() 
    {
    		
    		Calendar cal = Calendar.getInstance();
    		int a =  cal.get(Calendar.MONTH)+1;
    		int b  = cal.get(Calendar.YEAR);
    		
    		String stra = Integer.toString(a);
    		String strb = Integer.toString(b);
    		
    		String c = stra + strb;
    				return c;	
    }

    // method to get 
    public String monthYear() {
    		String x = "" + month + year;
    		return x;	
    }

    public String getDayName(){
        return monthName;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }
}
