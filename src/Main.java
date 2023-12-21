import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

      /*  Date date = new Date(122, 11, 31, 11,11,11);
        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth() + 1);
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());*/
     /*   System.out.println(date.getTime());
        date.setTime((long)500000344);
        System.out.println(date);*/

        /*Calendar calendar = new GregorianCalendar();

        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        Date date = new Date();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, 2000);

        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));*/

       /* Date date = new Date();
        System.out.println(date);

        String pattern = "yyyy-MM-dd HH:mm:ss Z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String format = simpleDateFormat.format(date);
        System.out.println(format);*/

      //  LocalDate ld = LocalDate.of(1989, Month.NOVEMBER , 15);
        /*System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getEra());
        System.out.println(ld.getMonthValue());*/

     /*   System.out.println(ld);
        LocalDate newLd = ld
                .plusDays(5)
                .plusMonths(3)
                .plusYears(34)
                .minusWeeks(5);
        System.out.println(newLd);*/

      /*  LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalTime LocT = LocalTime.of(12,20,30, 124563232);
        System.out.println(LocT);
        System.out.println(LocT.getHour());
        System.out.println(LocT.getNano());
        LocalTime sw1 = LocT.plusHours(11);
        System.out.println(sw1);*/
/*
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        Instant ldtNE = LocalDateTime.now().toInstant(ZoneOffset.UTC);
        System.out.println(ldtNE);

        Instant time = Instant.now();
        System.out.println(time);
        long second = time.getEpochSecond();
        System.out.println(second);
        long nano = time.getNano();
        System.out.println(nano);
*/
        ZoneId zone = ZoneId.of("Canada/Eastern");
        ZonedDateTime zdt = ZonedDateTime.now(zone);
        System.out.println(zdt);
        System.out.println("______________");
        System.out.println("Create date - test new branch");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMMM-dd").withLocale(Locale.ENGLISH);
        LocalDate dateTime = LocalDate.parse("2023-January-02", dtf);
        System.out.println(dateTime);

        int a = 5;
        int x = a+5/2;
        System.out.println(x);
    }
}