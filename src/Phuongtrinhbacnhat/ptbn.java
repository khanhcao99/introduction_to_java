package Phuongtrinhbacnhat;

import java.util.Scanner;

public class ptbn {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Bài giải phương trình bật nhất");
        System.out.println("Điền  thông tin các thông số để giải phương trình");

        System.out.println("Số a là: ");
        double a = value.nextDouble();

        System.out.println("Số b là: ");
        double b = value.nextDouble();

        System.out.println("Số c là: ");
        double c = value.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Kết quả của phương trình bật nhất x = " + answer);
        } else if (b == c){
            System.out.println("Phương trình vô số nghiệm");
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
