import java.util.Scanner;

public class ForestFire {

    //
    //Modified from Adeeba Khan
    //Date: 25-Aug-2023
    //Availability: https://www.tutorialspoint.com/how-to-print-colored-text-in-java-console
    //
    static String RESET = "\u001B[0m";
    static String RED = "\u001B[31m";
    static String GREEN = "\u001B[32m";
    static String YELLOW = "\u001B[33m";
    //end of citation
    static String a = "morning (6-11 am)?";
    public static void main(String[] args) {
    Introduction();
    int stat1 = Humidity();
    int stat2 = wind();
    if(stat2 == 1){
        System.out.println(GREEN + "There is a little to low chance of a wildfire happning." + RESET);
    }
    if(stat2 == 2){
        System.out.print("Error: You typed in an incorrect value, please restart the program.");
    }
    }

    private static void Introduction(){
        System.out.println(RED + "WELCOME TO WILDFIRE DETECTION CALIFORNIA" + RESET);
        System.out.println(YELLOW + "A wildfire is a fire that burns in wild vegetation," + RESET);
        System.out.println(YELLOW + "such as a forest, prairie, or grassland." + RESET);
        System.out.println(YELLOW + "These fires are dangerous to animals, plants, and people.");
        System.out.println(YELLOW + "By detecting them, we can save lives!" + RESET);
    }
    private static int Humidity(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the humidity in the morning (6-11 am): ");
        int a = kb.nextInt();
        System.out.println("Enter the humidity in the afternoon (12-5 pm): ");
        int b = kb.nextInt();
        System.out.println("Enter the humidity in the night (7-11 pm): ");
        int c = kb.nextInt();
        int sum = a+b+c;
        int div = sum/3;
        return div;
        }
    private static int wind(){
        Scanner wind = new Scanner(System.in);
        System.out.println("Are there frequent gusts of wind?" );
        String y = wind.nextLine();
        if(y.equalsIgnoreCase("yes")){
            System.out.println("Enter the number of measurements of windspeed: ");
            int num = wind.nextInt();
            System.out.println("Enter the windspeed in km/h: ");
            num = num --;
            int numm = wind.nextInt();
            while(num >= 1){
                System.out.println("Enter the windspeed in km/h: ");
                num = num --;
                int numsum = numm + wind.nextInt();
                return numsum;
            }
        }
        if(y("No") || y("no")) {
            return 1;

        }
        else{
            return 2;
        }
    }
}