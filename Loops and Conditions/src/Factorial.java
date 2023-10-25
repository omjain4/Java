import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //factorial program :
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial : ");
        int n = input.nextInt();
        int x = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + x);
    }
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}