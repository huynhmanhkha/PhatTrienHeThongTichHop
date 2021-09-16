package Tuan2;

import java.util.Scanner;

public class TongDaySo {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Tổng dãy số từ 1 đến "+n +" là " +sum);
    }
}
