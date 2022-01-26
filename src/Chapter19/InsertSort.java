package Chapter19;

import java.util.Scanner;

public class InsertSort {
    public static void insertSort(int[] num) {
        for(int i = 1; i < num.length; i++) {
            for(int j = i; j > 0; j--) {
                if(num[j-1] > num[j]) {
                    int tmp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] num = {5, 3, 1, 4, 2};
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Number");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        insertSort(num);

        for (int j : num) {
            System.out.print(j + " ");
        }
    }
}
