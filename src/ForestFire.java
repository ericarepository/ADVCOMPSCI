import java.util.Scanner;
public class ForestFire {

    //
    //Modified from Adeeba Khan
    //Date: 25-Aug-2023
    //Availability: https://www.tutorialspoint.com/how-to-print-colored-text-in-java-console
    //
    static String RESET = "\u001B[0m";
    static String RED = "\u001B[41m";
    static String BLACK = "\u001B[4;30m";
    static String GREEN = "\u001B[32m";
    static String YELLOW = "\u001B[0;93m";
    //end of citation
    static String a = "morning (6-11 am)?";
    public static void main(String[] args) {
    Introduction();
    int stat1 = Humidity();
    int stat2 = wind();
    float date = date();
    if(stat2 == 1){
        System.out.println(GREEN+ date);
        System.out.println(GREEN + "There is a little to low chance of a wildfire happening." + RESET);
        System.exit(0);
    }
    if(stat2 == 2){
        System.out.print("Error: You typed in an incorrect value, please restart the program.");
    }

    else{
        int[] arr = {stat1, stat2};
        if(stat1 >= 15 && stat2 >= 25){
            System.out.println(GREEN+ date);
            System.out.println(RED + BLACK + "WARNING! There is a high chance of a forest fire in your area!" );
            System.out.println("Close all your doors and windows, and shut of the gas. Stay safe!");
            System.out.println("The average humidity was " + arr[0] +"%, ");
            System.out.println("The average windspeed  was " + arr[1] +"km/h. " + RESET);
        }
        if(stat1 >= 15 && stat2 < 25){
            System.out.println(GREEN+ date);
            System.out.println(GREEN + "There is a little to low chance of a wildfire happening." + RESET);
        }
        if(stat1 < 15 && stat2 >= 25){
            System.out.println(GREEN+ date);
            System.out.println(GREEN + "There is a little to low chance of a wildfire happening." + RESET);
        }
    }
    }

    private static void Introduction(){
        System.out.println(RED + BLACK + "WELCOME TO WILDFIRE DETECTION CALIFORNIA" + RESET);
        System.out.println(YELLOW + "A wildfire is a fire that burns in wild vegetation," + RESET);
        System.out.println(YELLOW + "such as a forest, prairie, or grassland." + RESET);
        System.out.println(YELLOW + "These fires are dangerous to animals, plants, and people, as they destroy habitats and homes.");
        System.out.println(YELLOW + "By detecting them, we can save lives!" + RESET);
    }
    private static float date(){
        Scanner date = new Scanner(System.in);
        System.out.println("Enter today's date: ");
        float dates = date.nextFloat();
        return dates;
    }
    private static int Humidity(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the humidity % in the morning (6-11 am): ");
        int a = kb.nextInt();
        System.out.println("Enter the humidity % in the afternoon (12-5 pm): ");
        int b = kb.nextInt();
        System.out.println("Enter the humidity % in the night (7-11 pm): ");
        int c = kb.nextInt();
        int sum = a+b+c;
        int div = sum/3;
        return div;
        }
    private static int wind(){
        Scanner wind = new Scanner(System.in);
        System.out.println();
        System.out.println("Are there frequent gusts of wind?" );
        String y = wind.nextLine();
        if(y.equalsIgnoreCase("yes")){
            System.out.println("Enter the number of measurements of windspeed you have: ");
            int num = wind.nextInt();
            int numd = num;
            System.out.println("Enter the windspeed in km/h: ");
            numd = numd - 1;
            int numm = wind.nextInt();
            while(numd >= 1){
                System.out.println("Enter the windspeed in km/h: ");
                numd = numd -1;
                int numsum = numm + wind.nextInt();
                int divsum = numsum/num;
                return divsum;
            }
        }
        if(y.equalsIgnoreCase("no")) {
            return 1;

        }
        else{
            if(!y.equalsIgnoreCase("yes")||!y.equalsIgnoreCase("no")){}
            return 2;
        }
    }
}