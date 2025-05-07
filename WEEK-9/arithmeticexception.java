public class arithmeticexception {
    public static void main(String[]args) {
        int num = 10;
        int den = 0;
        try {
            int result = num/den;
            System.out.println("result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic exception caught: " + e.getMessage());
        }
    }
}
