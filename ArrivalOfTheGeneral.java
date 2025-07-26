import java.util.*;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] <= min) {  // last occurrence of min
                min = arr[i];
                minIndex = i;
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            swaps--;
        }

        System.out.println(swaps);
    }
}
