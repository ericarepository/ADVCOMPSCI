import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.FileWriter;
import java.util.Scanner;

public class Flighttracker{
    public static void main(String[] args) {
        try {
            // Construct the API URL with the access key and optional parameters
            String accessKey = ""; // Replace with your actual access key
            String url = "https://api.aviationstack.com/v1/flights?access_key=" + accessKey +
                    "&limit=100&offset=0";

            // Create the HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Build the HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print the response body
            System.out.println("Response: " + response.body());
            Filewrite(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void Filewrite(String x) {
        try {
            FileWriter output
                    = new FileWriter("flightdata.txt");

            // Writes the string to the file
            output.write(x);

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public class flight {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter flight number: ");
            String flightNumber = scanner.nextLine();


        }
        private int number;
        private String airline;
        private String airport;
        private int delay;
        public int getNumber() { return number; }
        public void setNumber(String name) { this.number = number; }
        public String getairline() { return airline; }
        public void setairline(String airline) { this.airline = airline; }
        public String airport() { return airport; }
        public void airport(String airport) { this.airport = airport; }
        public int delay() { return delay; }
        public void delay(int delay) { this.delay = delay; }
        @Override
        public String toString() {
           System.out.print("Person{Flight number='" + number + "', Airline=" + airline + ", Airport='" + airport + "',Flight delay='" + delay + "'}");
           return null;


    }
}
}

