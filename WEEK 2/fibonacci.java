import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int a = 0; int c = 1;
        System.out.println("Fibonacci sequence");
        for(int i = 1; i<=n ; i++){
            System.out.println("Fibonacci: " + a);
            int next = a+c;
            a = c;
            c = next;
        }
        System.out.println("Kasi Harini");
        input.close();
    }
}
