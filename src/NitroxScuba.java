 import java.util.Scanner;

public class NitroxScuba {
        private static Scanner keyboard = new Scanner(System.in);
        private static final int FEET_PER_ATMOSPHERE = 33;
        private static final double RECOMMENDED_PARTIAL= 1.4;
        private static final double CONTINGENCY_PARTIAL = 1.6;

        public static void main(String[] args) {
            int depth, percentage;
            double ambient_pressure, partial_pressure;
            boolean exceeds_maximal, exceeds_contingency;
            char pressure_group_letter;
            System.out.print("Enter depth and percentage 02 : ");
            depth = keyboard.nextInt();
            percentage = keyboard.nextInt();

            ambient_pressure = depth / FEET_PER_ATMOSPHERE + 1;
            partial_pressure = ((double)percentage / 100) * ambient_pressure;

            pressure_group_letter = (char)((int)(partial_pressure * 10) + (int)('A'));


            System.out.println("Ambient pressure : " + ambient_pressure);
            System.out.println("02 pressure : " + partial_pressure);
            System.out.println("02 group : " + pressure_group_letter);

            exceeds_maximal = partial_pressure > RECOMMENDED_PARTIAL;
            System.out.println("Exceeds maximal 02 pressure : " + exceeds_maximal);
            exceeds_contingency = partial_pressure > CONTINGENCY_PARTIAL;
            System.out.println("Exceeds contingency 02 pressure : " + exceeds_contingency);



    }

}
