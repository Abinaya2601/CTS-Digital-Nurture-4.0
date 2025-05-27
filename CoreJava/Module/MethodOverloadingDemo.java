public class MethodOverloadingDemo {

    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Calling different add methods
        int sum1 = add(5, 10);                 // 2 ints
        double sum2 = add(3.5, 7.2);           // 2 doubles
        int sum3 = add(1, 2, 3);               // 3 ints

        System.out.println("add(5, 10) = " + sum1);
        System.out.println("add(3.5, 7.2) = " + sum2);
        System.out.println("add(1, 2, 3) = " + sum3);
    }
}
