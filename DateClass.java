package DateTime;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Current System Time: "+System.currentTimeMillis());
	    Date date =  new Date();
        System.out.println("Current Date: "+date.getDate());
        System.out.println("Current Time: "+date.getTime());
        System.out.println("Current Day: "+date.getDay());
        System.out.println("Current Month: "+date.getMonth());
        System.out.println("Current Year: "+(date.getYear()+1900));

        Date MyDate = new Date("02/14/2014"); // mm/dd/yyyy
        System.out.println("Broke Up: "+MyDate);
    }
}
