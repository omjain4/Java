import java.util.Arrays;

public class AscendingDescending {
    public static void main(String[] args) {

        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        Arrays.sort(stringArray);

        System.out.println("Ascending Order:");
        for (String str : stringArray) {
            System.out.println(str);
        }
        System.out.println("\n");
        Arrays.sort(stringArray, (a, b) -> b.compareTo(a));

        System.out.println("Descending Order:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
