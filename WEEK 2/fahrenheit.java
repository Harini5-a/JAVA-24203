import java.util.Scanner;
public class fahrenheit {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int fahrenheit = input.nextInt();
        int celsius = (fahrenheit-32)*5/9;
        System.out.println("Fahrenheit: " +fahrenheit +"celsius: " + celsius);
        System.out.println("Kasi Harini");
        input.close();
    }
}
