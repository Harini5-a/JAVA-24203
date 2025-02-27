import java.util.Scanner;
public class factorial {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number<0) {
            System.out.println("factorial is only for positive integers.");
        } else{
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *=i;
            }
            System.out.println("Factorial: " + factorial);
        }
        System.out.println("Kasi Harini");
        input.close();
    }
}
