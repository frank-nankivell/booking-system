import java.util.Calendar;
import java.time.LocalDateTime;

public class Date {
	
    private boolean type;
    private boolean done;
    private int day;
    private int month;
    private int year;
    private String dayName ;
    private Calendar date;
    private String[] strDaysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};


    Date(String input){
        date = Calendar.getInstance();
        this.inputDate(input);
        type = false;
        done = false;
    }

    public void inputDate(String input){
        char ch = '/';
        if ((input.length() == 10) && (input.charAt(2) == ch) && (input.charAt(5) == ch)) {
            try {
                day = Integer.parseInt(input.substring(0, 2));
                month = Integer.parseInt(input.substring(3, 5));
                year = Integer.parseInt(input.substring(6, 10));

                if (checkDay(day) && checkMon(month) && checkYear(year)) {

                    getStrDayName(day, month, year);
                    type = true;
                }
                else {
                    System.out.println("You cannot select a date in the past. Try again.");
                }

            } catch (Exception e) {
                System.out.println("Sorry, the format was incorrect. Try again.");
                type = false;
            }
        }
        else{
            System.out.println("Sorry, the format was incorrect. Try again.");
        }
    }

    private boolean checkDay(int day) {
        int d = date.get(Calendar.DAY_OF_MONTH);
        return d <= day;
    }

    private boolean checkMon(int mon) {
        int m = date.get(Calendar.MONTH) + 1;
        return m <= mon;
    }

    private boolean checkYear(int yr) {
        int y = date.get(Calendar.YEAR);
        return y <= yr;
    }

    public boolean getFormat(){
        return done;
    }

    private void getStrDayName(int day, int month, int year) {
        date.set(year, month - 1, day);
        int day_of_week = date.get(Calendar.DAY_OF_WEEK);
        dayName = strDaysOfWeek[day_of_week - 1];
    }

    public void checkDateSelected() {
        System.out.println("You have chosen " + dayName + " " + day + "/" + month + "/" + year);

    }

    public Boolean chosen(){
        return done;
    }

    public String getDayName(){
        return dayName;
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
