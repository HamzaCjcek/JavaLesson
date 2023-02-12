package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2023-01-09
        System.out.println(tarih.getDayOfWeek());//MONDAY
        System.out.println(tarih.getDayOfMonth());//9
        System.out.println(tarih.getDayOfYear());//9
        System.out.println(tarih.getChronology());//ISO
        System.out.println(tarih.getMonth());//JANUARY
        System.out.println(tarih.getMonthValue());//1
        System.out.println(tarih.getYear());//2023
        System.out.println(tarih.lengthOfMonth());//31
        System.out.println(tarih.withDayOfMonth(5));//2023-01-05
        System.out.println(tarih.atStartOfDay());//2023-01-09T00:00
        System.out.println(tarih.atTime(5,2));//2023-01-09T00:00
        LocalDate tarih2=LocalDate.parse("2017-02-03");//2023-01-09T05:02
        System.out.println(tarih2.minus(5, ChronoUnit.DAYS));//2017-01-29
        System.out.println(tarih.minusDays(5));//2023-01-04
        System.out.println(tarih.minusMonths(2));//2022-11-09
        System.out.println(tarih.plusDays(10));//2023-01-19

        LocalTime baslangic=LocalTime.now();
        //System.out.println(baslangic);
        for (int i = 0; i <=1000 ; i++) {
            System.out.print(i+" ");
        }
        LocalTime bitis=LocalTime.now();
        //System.out.println("Bitis Zamanı "+bitis);
        System.out.println(" ");
        System.out.println(bitis.getNano()-baslangic.getNano());

        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(ldt.getHour());
    }
}