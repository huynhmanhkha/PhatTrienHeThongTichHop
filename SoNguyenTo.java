package Tuan2;

import java.util.Scanner;

public class SoNguyenTo {
    public static boolean soNguyenTo (int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<=n/2; i++)
        {
            if(n%2==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            System.out.println("Nhập vào 1 số: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(soNguyenTo(n))
            {
                System.out.println(n+" là số nguyên tố");
            }
            else{
                System.out.println(n+" không là số nguyên tố");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
