package UsingAlgorithms;

import java.util.Scanner;

public class using_algorithms {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner nhap = new Scanner(System.in);

        System.out.println("nhập vào chiều dài: ");
        width = nhap.nextFloat();
        System.out.println("ta có chiều dài là: " + width);

        System.out.println("nhập vào chiều rộng: ");
        height = nhap.nextFloat();
        System.out.println("ta có chiều rộng là: " + height);

        float area = width * height;
        System.out.println("Diện tích là: " + area);
    }
}
