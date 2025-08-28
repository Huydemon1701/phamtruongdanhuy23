package Lec6_Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class UnlimitedDataEntry6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> number =new ArrayList<>();
        int sum=0;
         System.out.println("Nhap so nguyen (-1 de dung):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;
            number.add(num);
            sum += num;
        }
        System.out.println("Danh sach: " + number);
        System.out.println("Tong la: " + sum);
        scanner.close();
        
    }
}
