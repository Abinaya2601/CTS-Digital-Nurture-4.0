public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit and explicit type casting demo

        // Step 1: double to int (explicit casting)
        double decimalValue = 9.75;
        int intValue = (int) decimalValue;  // cuts off decimal, doesn't round
        System.out.println("Original double: " + decimalValue);
        System.out.println("After casting to int: " + intValue);

        // Step 2: int to double (implicit casting)
        int wholeNumber = 42;
        double convertedDouble = wholeNumber;  // no need to cast explicitly
        System.out.println("Original int: " + wholeNumber);
        System.out.println("After casting to double: " + convertedDouble);
    }
}
