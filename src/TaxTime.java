import java.util.Scanner;
public class TaxTime {
    private static Scanner keyboard = new Scanner(System.in);
    private static final double STINKING_RICH = 500000;
    private static final double QUITE_RICH = 200000;
    private static final double MIAMI_POOR = 100000;
    private static final double AVERAGE = 50000;
    private static final double REALISTIC = 20000;
    private static final double TAX_RATE_A = 0.25;
    private static final double TAX_RATE_B = 0.1;
    private static final double TAX_RATE_C = 0.03;

    public static void main(String[] args) {
        double user_input, income, deductions, taxable_income, tax_owed;
        char tax_group;
        income = 0.0;
        deductions = 0.0;
        do{
            System.out.print("Enter next amount : ");
            user_input = keyboard.nextDouble();
            if (user_input > 0.0) {
                income += user_input;
            }
            else{
                deductions -= user_input;
            }
        } while (user_input != 0.0);
        taxable_income = ComputeTaxableIncome(income, deductions);
        tax_group = ComputeTaxGroup(taxable_income);
        tax_owed = ComputeTax(tax_group, taxable_income);
        DisplayOutput(income, deductions, taxable_income, tax_group, tax_owed);
    }
    private static double ComputeTaxableIncome(double income, double deductions) {
        if (income >= deductions) {
            return income - deductions;
        }
        else {
           return 0.0;
        }
    }
    private static char ComputeTaxGroup(double taxable_income) {
        if (taxable_income >= STINKING_RICH){
           return 'S';
        }
        else if (taxable_income >= QUITE_RICH){
            return 'Q';
        }
        else if (taxable_income >= MIAMI_POOR){
            return 'M';
        }
        else if (taxable_income >= AVERAGE){
            return 'A';
        }
        else if (taxable_income >= REALISTIC){
            return 'R';
        }
        else{
            return 'P';
        }
    }
    private static double ComputeTax(char tax_group, double taxable_income){
        if (tax_group == 'S' || tax_group == 'Q'){
            return taxable_income * TAX_RATE_A;
        }
        else if (tax_group == 'M'){
            return taxable_income * TAX_RATE_B;
        }
        else if (tax_group == 'A' || tax_group == 'R'){
            return taxable_income * TAX_RATE_C;
        }
        else {
            return 0.0;
        }

    }
    private static void DisplayOutput(double income, double deductions, double taxable_income, char tax_group, double tax_owed){
        System.out.println("Income = $" + income);
        System.out.println("Deductions = $" + deductions);
        System.out.println("Taxable income = $" + taxable_income);
        System.out.println("Tax group = " + tax_group);
        System.out.println("Tax owed = $" + tax_owed);
    }

}
