public class Testing {
    private static final int NUMBER_OF_NODES = 8;
    private static final int POWER_BASE = 2;
    public static void main(String[] args) {
        int newArray[] = new int[NUMBER_OF_NODES];
        for (int index = 0; index < newArray.length; index++){
            newArray[index] = (int)Math.pow(POWER_BASE,index + 1);
        }
    }
}