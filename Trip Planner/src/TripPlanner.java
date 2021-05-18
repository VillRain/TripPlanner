import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        beginning(input);
        travelInfo(input);
        timeZone(input);
        areaConverter(input);

    }

    //Asks for name and destination to be used later.

    public static void beginning(Scanner input) {
        System.out.println("Hello there!");
        System.out.println("We shall be planning a trip...");

        System.out.print("But first... tell me your name!");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Where would you like to travel? ");
        String destination = input.nextLine();
        System.out.println(destination + " sounds awesome!");
    }

    //Asks for duration and currency, returns budget in USD.

    public static void travelInfo(Scanner input) {
        System.out.println("Let's continue planning!");
        System.out.print("How long is your trip going to last?");
        Integer duration = Integer.valueOf(input.nextLine());
        System.out.print("And what is your budget?");
        Double budget = Double.valueOf(input.nextLine());
        System.out.print("What is the local currency unit where you'll be traveling?");
        String curUnit = input.nextLine();
        System.out.print("What is the current exchange rate of your currency to local currency?");
        Double exRate = Double.valueOf(input.nextLine());

        System.out.println("So you will be gone for " + duration + " days");
        System.out.println("Your budget is " + budget + "USD and that equals " + (budget * exRate) + " " + curUnit);

    }

    //Asks for time-zone and informs difference between local and destination.

    public static void timeZone(Scanner input) {
        System.out.println("The time-zone around there will probably be different");
        System.out.print("So could you tell me the local time at your destination?");
        Integer localTime = Integer.valueOf(input.nextLine());
        System.out.print("And now, what is the time around here?");
        Integer homeTime = Integer.valueOf(input.nextLine());
        System.out.print("So the time difference will be: " + (localTime - homeTime));

    }

    //Converts destination area.

    public static void areaConverter(Scanner input) {
        System.out.println("We'll convert the size of that country to miles next.");
        System.out.print("So, how large is that country in square kilometers?");
        Double countrySize = Double.valueOf(input.nextLine());
        Double countrySizeMiles = (countrySize / 2.59) * 100;
        Integer countrySizeMilesConverted = (int)Math.round(countrySizeMiles);
        countrySizeMiles = countrySizeMilesConverted / 100.0;
        System.out.printf("The size of the country is " + countrySizeMiles + " square miles.");

    }
}
