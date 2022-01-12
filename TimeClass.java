package DateTime;

import java.util.Date;
import java.time.*;


public class TimeClass {
    public static void main(String[] args) {
        Date date = new Date();
        date.setHours(1);
        date.setDate(6);
        System.out.println(date);
        LocalDate Ld = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(Ld);
        Ld = LocalDate.now(ZoneId.of("Pacific/Apia"));
        System.out.println(Ld);
        Ld = LocalDate.of(2021,Month.NOVEMBER,15);
        System.out.println(Ld);
        Ld = LocalDate.ofEpochDay(5);
        System.out.println(Ld);
        Ld = LocalDate.parse("2019-02-28");
        System.out.println(Ld);
        LocalDate LdNew = Ld.plusMonths(2);
        //LocalDate is immutable class
        System.out.println(LdNew);

        LocalTime Lt = LocalTime.now();
        System.out.println(Lt);
        LocalTime LtNew = Lt.minusHours(5);
        // LocalTime Immutable Class
        System.out.println(LtNew);

        ZonedDateTime ZDT = ZonedDateTime.now(ZoneId.of("Pacific/Apia"));
        System.out.println(ZDT);
        OffsetDateTime ODT = OffsetDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(ODT);
        MonthDay MD = MonthDay.now();
        LocalDate qa = MD.atYear(2021);
        System.out.println(qa);
        YearMonth YM = YearMonth.now();
        System.out.println(YM);
        Year Y = Year.now();
        System.out.println(Y);
        Period P = Period.of(2202,02,05);
        System.out.println(P.addTo(LocalDate.now()));
        Instant I = Instant.now();
        System.out.println(I);
        Duration D = Duration.ofDays(1);
        System.out.println(D);
    }
}
