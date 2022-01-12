package DateTime;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calender {
    public static void main(String[] args) {
        GregorianCalendar GC = new GregorianCalendar();
        System.out.println(GC.isLeapYear(2024));
        System.out.println(GC.getCalendarType());
        System.out.println(GC.getTimeZone());
        System.out.println(GC.getTime());
        TimeZone TZ = GC.getTimeZone();
        System.out.println(TZ.getDisplayName());
        System.out.println(TZ.useDaylightTime());
        System.out.println(TZ.getID());
        System.out.println(TZ.getOffset(01/01/2002));
    }
}
