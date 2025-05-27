public class PatternMatchingSwitch {

    public static void main(String[] args) {
        handleObject(42);
        handleObject("Hey there");
        handleObject(3.14);
        handleObject(true);
        handleObject(null);
    }

    public static void handleObject(Object obj) {
        String result = switch (obj) {
            c

