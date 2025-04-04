import java.util.Scanner;
public class Admission {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = input.nextLine();
        System.out.println("Enter qualification percentage: ");
        double percentage = input.nextDouble();
        input.nextLine();
        System.out.println("Enter program: ");
        String program = input.next().toUpperCase();
        if (program.equals("UG")) {
            if (percentage>=60) {
                System.out.println(name +" is eligible for UG admission.");
            } else {
                System.out.println(name + " is not eligible for UG admission.");
            }
        } else if (program.equals("PG")) {
            if (percentage>= 70) {
                System.out.println(name + " is eligible for PG admission.");
            } else {
                System.out.println(name + " is not eligible for PG admission.");
            }
        } else {
            System.out.println("Invalid course entered.");
        }
        input.close();
    }
}
