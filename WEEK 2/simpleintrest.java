import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rateofinterest = input.nextDouble();
        System.out.print("Enter Time Period: ");
        double time = input.nextDouble();
        double simpleinterest = (principal * rateofinterest * time) / 100;
        System.out.println("The Simple Interest is: " + simpleinterest);
        System.out.println("Kasi Harini");
        input.close();
    }
}

