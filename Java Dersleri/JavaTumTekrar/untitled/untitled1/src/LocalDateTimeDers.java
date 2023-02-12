import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeDers {
    public static void main(String[] args) {
        LocalDateTime ldt= LocalDateTime.now();//2022-12-20T12:29:07.669855400
        LocalDateTime ldt2= LocalDateTime.now(ZoneId.of("Turkey"));//2022-12-20T12:29:07.670869
        System.out.println(ldt);
        System.out.println(ldt2);

        System.out.println(ldt.withYear(2030));//2030-12-20T12:34:43.978490300

    }
}
