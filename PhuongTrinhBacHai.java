package Tuan2;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Nhập vào hệ số a: ");
        a = sc.nextFloat();
        System.out.println("Nhập vào hệ số b: ");
        b = sc.nextFloat();
        System.out.println("Nhập vào hệ số c: ");
        c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("Phương Trình Có Vô Số Nghiệm ");
                else
                    System.out.println("Phương Trình Vô Nghiệm");
            }
            System.out.println("Phương Trình Có Một Nghiệm = " + (-c / b));
        } else {
            double x1, x2, denta = Math.pow(b, 2) - 4 * a * c;
            if (denta < 0)
                System.out.println("Phương Trình Vô Nghiệm");
            else if (denta > 0) {
                x1 = (-b + Math.sqrt(denta)) / (2 * a);
                x2 = (-b - Math.sqrt(denta)) / (2 * a);
                System.out.println("x1 = " + (x1) + ", " + "x2 = " + (x2));
            } else
                System.out.println("Phương Trình Có Nghiệm Kép x = " + (-b / (2 * a)));
        }
    }

}
