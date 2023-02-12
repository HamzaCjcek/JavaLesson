import java.time.LocalDate;
import java.time.Period;

public class Periodd {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1995,8,12);
        LocalDate bugun=LocalDate.now();
        Period yas=Period.between(dogumTarihi,bugun);
        System.out.println(yas); //P27Y4M8D
        System.out.println(yas.getYears()); //27
    }
}
