package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DersSonKısım {


    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih); // 2022-12-19

        LocalTime saat=LocalTime.now();
        System.out.println(saat); // 21:13:33.030311300

        LocalDateTime tarihZaman=LocalDateTime.now();
        System.out.println(tarihZaman); // 2022-12-19T21:13:33.030311300

        System.out.println(tarih.getDayOfYear()); //353
        System.out.println(tarih.getDayOfMonth()); // 19
        System.out.println(tarih.getDayOfWeek()); // MONDAY
        System.out.println(tarih.getMonth()); // DECEMBER
        System.out.println(tarih.getMonthValue()); //12
        System.out.println(tarih.getChronology()); //  ISO

        System.out.println(tarih.withYear(2015));// 2015-12-19
        System.out.println(tarih.withDayOfMonth(15)); // 2022-12-15
        System.out.println(tarih.withDayOfMonth(15).withYear(2015)); // 2015-12-15

        System.out.println(tarih.isLeapYear());//False
        System.out.println(tarih.minusWeeks(5));//hafta  öncesine git // 2022-11-14
        System.out.println(tarih.minusYears(3).minusWeeks(5).minusDays(15));//2019-10-30
        System.out.println(tarih.plusMonths(15)); //2024-03-19

        LocalDate tarih1=LocalDate.of(1975,10,13);
        LocalDate tarih2=LocalDate.of(1975,10,20);
        System.out.println(tarih1.isBefore(tarih2) ? "Tarih1 daha eski":"Tarih2 daha eski"); // Tarih1 daha eski
        System.out.println(tarih.hashCode());//4141843
        System.out.println(tarih1.hashCode());//4045453
        System.out.println(tarih2.minusDays(7).hashCode());//4045453 // Tarih 2 den 7 gun çıkar


    }

}
