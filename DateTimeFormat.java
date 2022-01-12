package DateTime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormat {
    public static void main(String[] args) {
        //LocalDateTime LDT = LocalDateTime.now();
        ZonedDateTime LDT = ZonedDateTime.now();
        System.out.println(LDT);
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
        System.out.println(DF.format(LDT));
        System.out.println(LDT.get(ChronoField.YEAR_OF_ERA));
    }
}
