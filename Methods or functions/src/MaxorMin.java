import java.util.Scanner;

public class MaxorMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = input.nextInt();
        System.out.println("Enter the second number : ");
        int second = input.nextInt();
        System.out.println("Enter the third number : ");
        int third = input.nextInt();
        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
        System.out.println("The largest of the three numbers is : " + largest);
        System.out.println("The smallest of the three numbers is : " + smallest);
    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
            return 0;
        }
        return min;
    }
}

