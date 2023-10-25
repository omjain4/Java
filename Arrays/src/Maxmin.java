import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {

        int arr[] = {6, 5, 4, 2};
        int max = arr[1];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The maximum number in the given array is : " + max);
        System.out.println("The minimum number in the given array is : "+min);
    }
}

