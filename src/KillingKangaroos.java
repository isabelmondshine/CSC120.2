import java.util.Scanner;

public class KillingKangaroos {
    private static Scanner keyboard = new Scanner(System.in);
// Establish constants
    private static final double ROAD_WIDTH = .01;
    private static final double ROADKILL_PROB = 1.47;

    public static void main(String[] args) {
// Declare variables
        double side_length, roads_length, number_kangaroos;
        double kangaroo_density, surface_area, road_kills;
// Receive input
        System.out.println("Enter side of square in km : ");
        side_length = keyboard.nextDouble();
        System.out.println("Enter roads length in km : ");
        roads_length = keyboard.nextDouble();
        System.out.println("Enter number of kangaroos : ");
        number_kangaroos = keyboard.nextDouble();
// Make calculations
        kangaroo_density = number_kangaroos / (side_length * side_length);
        surface_area = roads_length * ROAD_WIDTH;
        road_kills = kangaroo_density * surface_area * ROADKILL_PROB;
// Print output
        System.out.print("Expected number of kills is : " + road_kills);
    }

}