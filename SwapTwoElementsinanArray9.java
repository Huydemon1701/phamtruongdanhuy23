package Lec6_Arrays;
import java.util.Arrays;
public class SwapTwoElementsinanArray9 {
     public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        swap(arr, 0, 2);
        System.out.println("Mang sau khi doi cho: " + Arrays.toString(arr));
    }
}
