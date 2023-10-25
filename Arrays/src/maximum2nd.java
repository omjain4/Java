public class maximum2nd {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    public static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static int min(int[] arr) {
        int Val = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Val) {
                Val = arr[i];
            }
        }
        return Val;
    }
}
