import java.util.Scanner;
import java.io.FileWriter;
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
    //End of citation
    static String a = "morning (6-11 am)?";
    public static void main(String[] args) {
    Introduction();
    int stat1 = Humidity();
    int stat2 = wind();
    String date = GREEN + date();
    if(stat2 == 1){
        System.out.println(GREEN+ date);
        String warning = GREEN + "There is a little to low chance of a wildfire happening." + RESET;
        System.out.println(warning);
        Filewrite(date, warning);


    }
    if(stat2 == 2){
        String Error = "Error: You typed in an incorrect value, please restart the program.";
        Filewrite(date, Error);
    }

    else{
        int[] arr = {stat1, stat2};
        if(stat1 >= 15 && stat2 >= 25){
            System.out.println(GREEN+ date);
            String warning = (RED + BLACK + "WARNING! There is a high chance of a forest fire in your area! " +
                    "Close all your doors and windows, and shut off the gas. Stay safe!" +
                    "The average humidity was " + arr[0] +"%, "
            + "The average wind-speed  was " + arr[1] +"km/h. " + RESET);
            System.out.println(warning);
            Filewrite(date, warning);
        }
        if(stat1 >= 15 && stat2 < 25){
            System.out.println(GREEN + date);
            String warning = GREEN + "There is a little to low chance of a wildfire happening." + RESET;
            System.out.println(warning);
            Filewrite(date, warning);
        }
        if(stat1 < 15 && stat2 >= 25){
            System.out.println(GREEN+ date);
            String warning = GREEN + "There is a little to low chance of a wildfire happening." + RESET;
            System.out.println(warning);
            Filewrite(date, warning);
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
    private static String date(){
        Scanner date = new Scanner(System.in);
        System.out.println(RED+ BLACK + "Enter today's day: " + RESET );
        String day = date.nextLine();
        System.out.println(RED + BLACK + "Enter today's month: " + RESET);
        String month = date.nextLine();
        System.out.println(RED + BLACK + "Enter today's year: " + RESET);
        String year = date.nextLine();
        String dateFinal = day + "/" + month + "/" + year;
        return dateFinal;
    }
    private static int Humidity(){
        Scanner kb = new Scanner(System.in);
        System.out.println(RED + BLACK + "Enter the humidity % in the morning (6-11 am): "  + RESET );
        int a = kb.nextInt();
        System.out.println(RED + BLACK + "Enter the humidity % in the afternoon (12-5 pm): " + RESET);
        int b = kb.nextInt();
        System.out.println(RED + BLACK + "Enter the humidity % in the night (7-11 pm): " + RESET);
        int c = kb.nextInt();
        int sum = a+b+c;
        return sum/3;
        }
    private static int wind(){
        Scanner wind = new Scanner(System.in);
        System.out.println();
        System.out.println(RED + BLACK + "Are there frequent gusts of wind?" + RESET );
        String y = wind.nextLine();
        if(y.equalsIgnoreCase("yes")){
            System.out.println(RED + BLACK + "Enter the number of measurements of wind-speed you have: " + RESET );
            int num = wind.nextInt();
            int numd = num;
            int numsum = 0;
            System.out.println(RED + BLACK + "Enter the wind-speed in km/h: " + RESET );
            numd = numd - 1;
            int numm = wind.nextInt();
            while(numd >= 1){
                System.out.println(RED + BLACK + "Enter the wind-speed in km/h: " + RESET);
                numsum = numm+ wind.nextInt();
                numd--;

            }
            int z = numsum/num;
            return z;
        }
        if(y.equalsIgnoreCase("no")) {
            return 1;

        }
        else{
            if (!y.equalsIgnoreCase("yes") & !y.equalsIgnoreCase("no")) {
                return 2;
            }
                return 2;
        }
    }
    //Modified from goelshubhangi3118
    //Date: 10-Feb-2022
    //Availability: https://www.geeksforgeeks.org/filewriter-class-in-java/
    private static void Filewrite(String x, String y){
        try {
            FileWriter output
                    = new FileWriter("output.txt");

            // Writes the string to the file
            output.write(x + y);

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        System.exit(0);
    }
    //End of citation

}