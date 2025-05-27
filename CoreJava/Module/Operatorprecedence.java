public class OperatorPrecedence {
    public static void main(String[] args) {
        // Expression 1
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        // Explanation: 5 * 2 = 10 → 10 + 10 = 20

        // Expression 2
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
        // Explanation: (10 + 5) = 15 → 15 * 2 = 30

        // Expression 3
        int result3 = 20 / 5 + 3 * 2;
        System.out.println("20 / 5 + 3 * 2 = " + result3);
        // Explanation: 20 / 5 = 4, 3 * 2 = 6 → 4 + 6 = 10
