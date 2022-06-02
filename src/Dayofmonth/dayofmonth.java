package Dayofmonth;

import java.util.Scanner;

public class dayofmonth {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("nhập vào tháng cần kiểm tra: ");
        int month = value.nextInt();
        switch (month){
            case 2:
                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.println("không có tháng nào như này");
                break;

        }
    }
}
