import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Write Monday or Tuesday :");
            String day = scanner.nextLine();
            if (Objects.equals(day, "Monday")){
                Week duishomu =Week.ДУЙШОМБУ;
                System.out.println(duishomu);
            }
            else if (Objects.equals(day,"Tuesday")) {
                Week sheishembi = Week.ШЕЙШЕМБИ;
                System.out.println(sheishembi);
            }else System.out.println("Error!!!");
        }
    }
    }
