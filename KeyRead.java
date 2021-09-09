package Tuan1;

import java.io.*;

public class KeyRead {
    public static void main(String[] args) {
        try {
            System.out.print("Nhạp vào kí tự : ");
            int ch = System.in.read();
            System.out.println("Ký tự"+ " " +(char)ch +" " + "có mã ASCII là" + " " +ch);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
