import java.util.Scanner;
public class celsius {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int celsius = input.nextInt();
        int fahrenheit = (celsius*9/5)+32;
        System.out.println("celsius: "+ celsius +"fahrenheit: " + fahrenheit);
        System.out.println("Kasi Harini");
        input.close();
    }
}
