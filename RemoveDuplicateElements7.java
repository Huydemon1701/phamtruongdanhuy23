package Lec6_Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicateElements7 {
     public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        System.out.println("Input: " + numbers);
        ArrayList<Integer> noDup = removeDuplicates(numbers);
        System.out.println("Output: " + noDup);
    }
}
