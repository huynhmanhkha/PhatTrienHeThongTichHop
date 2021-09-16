package Tuan2;

import java.util.ArrayList;
import java.util.Scanner;

public class TongSoThuc {
    public static void main(String[] args) {
        ArrayList <Float> ls=new ArrayList<Float>();
        System.out.print("Nhập số phần tử: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float a, sum=0;
        for(int i=0;i<n;i++)
        {
            a=sc.nextFloat();
            ls.add(a);
        }
        for(int i=0;i<ls.size();i++)
        {
            if(ls.get(i)>0){
                sum+=ls.get(i);
            }
            
        }
        System.out.println("Tổng là "+sum);
    }
}
