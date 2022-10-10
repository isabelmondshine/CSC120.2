import java.util.Scanner;
public class BuggyProgram {
    //-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//----Gas constant is always 8.3143
    private static final double GAS_CONSTANT = 8.3143;
    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold system values
        double volume, moles, temp;
        double pressure;

//----Getting data
        System.out.print("Enter Volume, Moles, Temp : ");
        volume = keyboard.nextDouble();
        moles = keyboard.nextDouble();
        temp = keyboard.nextDouble();

//----Assigning the variable to the computation
        pressure = moles * GAS_CONSTANT * temp / volume;

//----Display results
        System.out.println("Pressure is " + pressure);
    }
}
//-----------------------------------------------------------------------------
//=============================================================================
