package Lec6_Arrays;
import java.util.Arrays;
public class FindtheSecondLargestElement11 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 20};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Khong co phan tu lon thu hai");
        } else {
            System.out.println("Phan tu lon thu hai la: " + secondLargest);
        }
    }
}
