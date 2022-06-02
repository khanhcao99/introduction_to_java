package Leapyear;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Nhập vào số năm để kiểm tra");
        int a = value.nextInt();
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("Đây là năm nhuận");
        } else if (a % 100 == 0 && a % 4 != 0) {
            System.out.println("Đây không phải là năm nhuận");
        }

    }
}
