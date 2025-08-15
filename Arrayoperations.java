import java.util.Arrays;

public class Arrayoperations {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Access index at 3: " + arr[3]);

        // Insertion
        int posInsert = 4;
        int value = 45;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < posInsert; i++)
            newArr[i] = arr[i];
        newArr[posInsert] = value;
        for (int i = posInsert; i < arr.length; i++)
            newArr[i + 1] = arr[i];
        arr = newArr;
        System.out.println("After insertion: " + Arrays.toString(arr));

        // Deletion
        int posDelete = 1;
        int[] delArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != posDelete) {
                delArr[j++] = arr[i];
            }
        }
        arr = delArr;
        System.out.println("After deletion: " + Arrays.toString(arr));
    }
}
