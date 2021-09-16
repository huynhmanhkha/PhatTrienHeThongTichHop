package Tuan2;

import java.util.Scanner;

public class InManHinh {
    public static void main(String[] args) {
        try {
            System.out.println("Nhập vào chuỗi ký tự");
            Scanner sc = new Scanner(System.in);
            String chuoi= sc.nextLine();
            System.out.println(chuoi.toUpperCase());
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
