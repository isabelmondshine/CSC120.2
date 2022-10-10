import java.util.Scanner;
public class PhoneCodes {
    private static Scanner keyboard = new Scanner(System.in);
    private static final int MIN = 999999;
    private static final int MAX = 9999999;

    public static void main(String[] args) {
        int number;
        String random_encoding;
        do {
            System.out.print("Please enter your 305 phone number: ");
            number = keyboard.nextInt();
        } while ((number < MIN) || (number > MAX));

        random_encoding = computeRandomEncoding(number);
        String encoding_305 = computeRandomEncoding(305);
        String final_result = encoding_305 + random_encoding;
        System.out.print("The phone number 305" + number + " can be encoded as " + final_result);

    }//end of main method
    private static String computeRandomEncoding(int number){
        String result = "";
        char[] firstLetters = {'0', '1', 'A', 'D','G', 'J', 'M', 'P', 'T', 'W'};
        int[] numberOfLetters = {0, 1, 3, 3, 3, 3, 3, 4, 3, 4};
        while (number > 0){
            int digit = number % 10;
            int numberPerDigit = (int)Math.floor((int)Math.random() * numberOfLetters[digit]);
            char characterCode = (char)((int)firstLetters[digit] + numberPerDigit);
            result = characterCode + result;
            number = number / 10;
        }
        return result;
    }//end of method
}// end of class