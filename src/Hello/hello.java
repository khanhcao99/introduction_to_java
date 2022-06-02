package Hello;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        String a;
        System.out.println("Nhập tên của bạn:");
        a = value.nextLine();
        System.out.println("Hello " + a);
    }
}
