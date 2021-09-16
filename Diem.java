package Tuan2;

import java.util.Scanner;

public class Diem {
    static int x;
    int y;
    void nhaptoado(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void intoado(){
        System.out.println("("+x +"," +y+")");
    }
    //tính khoảng cách từ điểm đó đến gốc tọa độ (0,0)
    
    static void nhap()
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tọa độ x: ");
        x=sc.nextInt();
        System.out.println("Nhập tọa độ y: ");
        y=sc.nextInt();
        Diem d1 = new Diem();
        d1.nhaptoado(x, y);
        System.out.println("Tọa độ là: ");
        d1.intoado();
    }
    static void khoangcach()
    {
        int x,y;;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tọa độ x: ");
        x=sc.nextInt();
        System.out.println("Nhập tọa độ y: ");
        y=sc.nextInt();       
        double kq=Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        //return kq; 
        System.out.println("Khoang cách từ tọa độ ("+x+","+y+") là: "+kq);
        
    }
    public static void main(String[] args) {
        Diem d1=new Diem();
        Diem d2=new Diem();

        nhap();
        khoangcach();
        

        //System.out.println("Khoảng cách : "+d1.khoangcach(4, 2));
        
        
    }
}
