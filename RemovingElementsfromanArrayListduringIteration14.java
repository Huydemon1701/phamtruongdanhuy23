package Lec6_Arrays;
import java.util.ArrayList;
public class RemovingElementsfromanArrayListduringIteration14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(25);
        list.add(80);
        list.add(5);
        list.add(95);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
