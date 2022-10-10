import java.util.Scanner;

public class DrivingUpI95 {
    private static Scanner keyboard = new Scanner(System.in);
    private static final int SPEED_LIMIT = 65;

    public static void main(String[] args) {
        PrintUserMessage();
        int distance_wanted;
        double time_available, travel_speed;

        System.out.print("Enter distance to travel : ");
        distance_wanted = keyboard.nextInt();
        System.out.print("Enter time available : ");
        time_available = keyboard.nextDouble();

        travel_speed = ComputeTravelSpeed(distance_wanted, time_available);
        printSpeedandLimit(travel_speed);
    }
    private static void PrintUserMessage(){
        System.out.println("Welcome to the I95 Speed Machine");
        System.out.println("You will have to supply:");
        System.out.println("+ The distance you want to travel, in miles");
        System.out.println("+ The time you have available, in hours");
    }
    private static double ComputeTravelSpeed(int distance_wanted, double time_available) {
        double timeForStops;
        double timeToTravel, travelSpeed;

        if ((distance_wanted % 100) > 0) {
            timeForStops = (5.0/60.0) * ((distance_wanted / 100) + 1);
        } else {
            timeForStops = (5.0/60.0) * (distance_wanted / 100);
        }
        timeToTravel = time_available - timeForStops;
        travelSpeed =  distance_wanted / timeToTravel;

        return (travelSpeed);
    }
    private static void printSpeedandLimit(double travel_speed) {
        boolean over_limit;
        over_limit = travel_speed > SPEED_LIMIT;
        System.out.println("You will have to travel at " + travel_speed);
        System.out.println("Over the speed limit: " + over_limit);
    }

}
