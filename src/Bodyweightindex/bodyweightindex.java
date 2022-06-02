package Bodyweightindex;

import java.util.Scanner;

public class bodyweightindex {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Nhập vào số cân nặng của bạn: ");
        weight = value.nextDouble();

        System.out.println("Nhập vào chiều cao của bạn: ");
        height = value.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.println("Bạn đang bị thiếu cân!");
        } else if (bmi < 25.0) {
            System.out.println("Cơ thể của bạn bình thường");
        } else if (bmi < 30.0) {
            System.out.println("Bạn đang bị thừa cân rồi");
        } else {
            System.out.println("Giảm cân ngay bạn đang bị béo phì đấy");
        }
    }
}
