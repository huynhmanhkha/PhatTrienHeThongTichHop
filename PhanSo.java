package Tuan2;

import java.util.Scanner;

public class PhanSo {
    int tuso,mauso;

    void nhapphanso(int x,int y)
    {
        this.tuso=x;
        this.mauso=y;
    }
    void inphanso(int x,int y)
    {
        System.out.println("Phân số là: "+x+"/"+y);
    }
    static void nhap(){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        x=sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        y=sc.nextInt();
        PhanSo ps1 = new PhanSo();
        ps1.inphanso(x, y);
    }   
    static void nghichdaops()
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        x=sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        y=sc.nextInt();
        PhanSo ps1 = new PhanSo();
        System.out.println("Phân số nghịch đảo là: "+y+"/"+x);
    }
    static void giatri()
    {
        double x,y,kq;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        x=sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        y=sc.nextInt();
        PhanSo ps1 = new PhanSo();
        System.out.println("Giá trị phân số là: "+(x/y));
        
    }
    static void  congphanso()
    {
        double x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số thứ nhất: ");
        x1=sc.nextInt();
        System.out.print("Nhập mẫu số thứ nhất: ");
        y1=sc.nextInt();
        System.out.print("Nhập tử số thứ nhất: ");
        x2=sc.nextInt();
        System.out.print("Nhập mẫu số thứ hai: ");
        y2=sc.nextInt();
        PhanSo ps1 = new PhanSo();
        double kq=(((x1*y2)+(x2*y1))/(y1*y2));
        System.out.println("Kết quả cộng hai phân số:"+kq);
        
    }
    static void truphanso()
    {
        double x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số thứ nhất: ");
        x1=sc.nextInt();
        System.out.print("Nhập mẫu số thứ nhất: ");
        y1=sc.nextInt();
        System.out.print("Nhập tử số thứ nhất: ");
        x2=sc.nextInt();
        System.out.print("Nhập mẫu số thứ hai: ");
        y2=sc.nextInt();
        PhanSo ps1 = new PhanSo();
        double kq=(((x1*y2)-(x2*y1))/(y1*y2));
        System.out.println("Kết quả trừ phân số là: "+kq);
        
    }
    static void nhanphanso()
    {
        double x1,y1,x2,y2;
         Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số thứ nhất: ");
        x1=sc.nextInt();
        System.out.print("Nhập mẫu số thứ nhất: ");
        y1=sc.nextInt();
        System.out.print("Nhập tử số thứ nhất: ");
        x2=sc.nextInt();
        System.out.print("Nhập mẫu số thứ hai: ");
        y2=sc.nextInt();
        PhanSo ps1 = new PhanSo();
        double kq=(x1*x2)/(y1*y2);
        System.out.println("Kết quả nhân phân số là: "+kq);
    }
    static void chiaphanso()
    {
        double x1,y1,x2,y2;
         Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tử số thứ nhất: ");
        x1=sc.nextInt();
        System.out.print("Nhập mẫu số thứ nhất: ");
        y1=sc.nextInt();
        System.out.print("Nhập tử số thứ nhất: ");
        x2=sc.nextInt();
        System.out.print("Nhập mẫu số thứ hai: ");
        y2=sc.nextInt();
        PhanSo ps1 = new PhanSo();
        double kq=(x1*y2)/(y1*x2);
        System.out.println("Kết quả chia phân số là: "+kq);
    }
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo();
        PhanSo ps2=new PhanSo();

        
        // ps1.inphanso(4, 9);
        // ps2.nghichdaops(4, 9);

        // System.out.println("Giá trị thực của phân số: "+ps1.giatri(3, 9));

        // System.out.println("Kết quả cộng hai phân số: "+ps1.congphanso(5, 8, 7, 8));
        // System.out.println("Kết quả cộng hai phân số: "+ps1.congphanso(1, 2, 3, 5));

        // System.out.println("Kết quả trừ phân số: "+ps1.truphanso(4, 5, 2, 3));
        // System.out.println("Kết quả nhân phân số: "+ps1.nhanphanso(4, 7, 2, 3));
        // System.out.println("Kết quả chia phân số: "+ps1.chiaphanso(5, 3, 2, 7));

        System.out.println("Nhập phân số");
        nhap();
        System.out.println("Nghịch đảo phân số");
        nghichdaops();
        System.out.println("Giá trị thực của phân số");
        giatri();
        System.out.println("Cộng phân số");
        congphanso();
        System.out.println("Trừ phân số");
        truphanso();
        System.out.println("Nhân phân số");
        nhanphanso();
        System.out.println("Chia phân số");
        chiaphanso();
    }
}
