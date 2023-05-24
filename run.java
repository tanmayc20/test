import java.util.Arrays;

public class run{

    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {5, 2, 8, 7, 1};

        // Sort the array
        Arrays.sort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
