import java.util.Scanner;

public class SumofDigitofNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        int sum = 0;
        while (number != 0 ){
            int digit = number%10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum of digits is "+sum);
    }
}
