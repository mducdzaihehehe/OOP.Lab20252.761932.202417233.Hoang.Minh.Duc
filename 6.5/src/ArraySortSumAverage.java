import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        double average = (double) sum / n;

        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
        System.out.println("Tong = " + sum);
        System.out.println("Trung binh cong = " + average);
    }
}