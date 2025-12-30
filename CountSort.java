import java.util.Arrays;
public class CountingSort {
    public static void countingSort(int[] arr) {
        if (arr.length == 0)
            return;

        // 1. Find the maximum element
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        // 2. Create count array
        int[] count = new int[max + 1];
        
        // 3. Store frequency of each element
        for (int num : arr) {
            count[num]++;
        }

        // 4. Modify count array (prefix sum)
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // 5. Build output array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // 6. Copy output to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
