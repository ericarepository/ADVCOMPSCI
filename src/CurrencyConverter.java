import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDate;

public class CurrencyConverter {
    //making the date and time global so I can access it within my functions.
    public static LocalDate date = LocalDate.now();
    public static LocalTime time = LocalTime.now();
    public static void main(String[] args) {
        Scanner currency = new Scanner(System.in); // creating a scanner.
        System.out.print("Do you want to convert Saudi Riyals to Dollars or Dollars to Saudi Riyals? "); //asking for user input to decide which function to use.
        String input = currency.nextLine(); // assigning the input to a variable.
        if (input.equalsIgnoreCase("Saudi Riyals to Dollars") || input.equalsIgnoreCase("Riyals to Dollars")) {
            RtoD(); //calling the function to convert Riyals to Dollars.

        }
        else if (input.equalsIgnoreCase("Dollars to Saudi Riyals")||input.equalsIgnoreCase("Dollars to Riyals")) {
            DtoR(); //calling the function to convert dollars to riyals.
        }
        else {
            System.out.println("Error: invalid input. Please re-enter command"); //Creating an output in case of invalid input.
        }
    }
    //Creating a function that converts Riyals to Dollars and outputs the result alongside date and time.
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
    //Creating a function that converts dollars to riyals and outputs it alongside the date and time.
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
