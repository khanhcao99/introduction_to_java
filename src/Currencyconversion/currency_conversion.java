package Currencyconversion;

import java.util.Scanner;

public class currency_conversion {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int VND, USD;
        System.out.println("Nhập vào số tiền USD bạn muốn chuyển đổi: ");
        USD = value.nextInt();
        System.out.println("Số tiền USD sau khi chuyển đổi sang VND là: " + (USD * 23000) + " VND");

        System.out.println("Nhập vào số tiền VND bạn muốn chuyển đổi: ");
        VND = value.nextInt();
        System.out.println("Số tiền VND sau khi chuyển đổi sang USD là: " + (VND / 23000) + " $");
    }
}
