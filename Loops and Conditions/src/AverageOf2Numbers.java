import java.util.Scanner;

public class AverageOf2Numbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of element : ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            int average = input.nextInt();
            sum += average;
        }
        int number = sum/n;
        System.out.println("The average of "+n+" numbers is : "+number);
    }
}
