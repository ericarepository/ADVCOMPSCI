import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDate;

public class CurrencyConverter {
    public static LocalDate date = LocalDate.now();
    public static LocalTime time = LocalTime.now();
    public static void main(String[] args) {
        Scanner currency = new Scanner(System.in);
        System.out.print("Do you want to convert Saudi Riyals to Dollars or Dollars to Saudi Riyals? ");
        String input = currency.nextLine();
        if (input.equalsIgnoreCase("Saudi Riyals to Dollars") || input.equalsIgnoreCase("Riyals to Dollars")) {
            RtoD();

        }
        else if (input.equalsIgnoreCase("Dollars to Saudi Riyals")||input.equalsIgnoreCase("Dollars to Riyals")) {
            System.out.println(date);
            System.out.println(time);
            DtoR();
        }
        else {
            System.out.println("Error: invalid input. Please re-enter command");
        }
    }
    private static void RtoD() {
        Scanner Riyal = new Scanner(System.in);
        System.out.println("Enter the value in Riyals: ");
        double input = Riyal.nextDouble();
        double Dollar = input * 0.26639;
        System.out.println(date);
        System.out.println(time);
        System.out.print("The exact value in dollars is " + Dollar + "$");
        return;
    }
    private static void DtoR(){
        Scanner dollar = new Scanner(System.in);
        System.out.println("Enter the value in Dollars: ");
        double input = dollar.nextDouble();
        double Riyal = input * 3.75405;
        System.out.println(date);
        System.out.println(time);
        System.out.print("The exact value in Riyals is " + Riyal + " SAR.");
        return;
    }
}
