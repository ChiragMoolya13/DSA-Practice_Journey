import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number from (1-7): ");
        int day = obj.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
        }
    }
}
