import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        float bill;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter units consumed : ");
        float unit = input.nextInt();
        if (unit >= 100) {
            bill = unit * 8;
            System.out.println("Your electricity bill is : " + bill + "₹");
        } else if (unit >= 200) {
            bill = unit * 10;
            System.out.println("Your electricity bill is : " + bill + "₹");
        } else {
            bill = unit * 12;
            System.out.println("Your electricity bill is : " + bill + "₹");
        }
    }
}
