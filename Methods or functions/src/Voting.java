import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int in = input.nextInt();
        int age = age(in);
    }
    public static int age(int in) {
        if (in>= 18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible ");
        }
        System.out.println(" ");
        return in;
        //hello

    }
}
