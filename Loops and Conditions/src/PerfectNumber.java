import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i<num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
                System.out.println(num + " is a perfect number");
            } else {
                System.out.println("The given number is not a perfect number");
        }
        }
    }

