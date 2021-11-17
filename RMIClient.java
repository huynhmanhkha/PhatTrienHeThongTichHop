import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry(9809);
            RMIInterface inter = (RMIInterface)reg.lookup("Obj");

            // System.out.println("So tu trong chuoi la: "+inter.dem());
            // System.out.println("Chuoi sau dao nguoc: "+inter.dao());

            Scanner sc = new Scanner(System.in);
           
            while(true){
                System.out.println("1.Dem so tu trong chuoi");
                System.out.println("2.Dao nguoc chuoi");
                System.out.println("3.In hoa chuoi");
                System.out.println("4.Tong 2 so");
                System.out.println("5.Hieu hai so");
                System.out.println("Nhap exit de thoat");
                System.out.println("Nhap lua chon");
                String chon=sc.nextLine();

                //sc.nextLine();
                switch (chon) {
                    case "1":
                        System.out.println("Nhap chuoi: ");
                        String string = sc.nextLine();
                        System.out.println("So tu trong chuoi la: "+inter.dem(string));
                        
                        break;
                    case "2":
                        System.out.println("Nhap chuoi: ");
                        String string1 = sc.nextLine();
                        System.out.println("Chuoi sau dao nguoc la: "+inter.dao(string1));
                        break;
                    case "3":
                        System.out.println("Nhap chuoi: ");
                        String string2 = sc.nextLine();                       
                        System.out.println("Chuoi sau khi in hoa: "+inter.inhoa(string2));
                        break;
                    case "4":
                        System.out.println("Nhap: ");
                        int a=sc.nextInt();
                        System.out.println("Nhap: ");
                        int b=sc.nextInt();
                        System.out.println("Tong hai so "+a +" va "+b +" la: "+inter.tong(a, b));
                        break;
                    case "5":
                        System.out.println("Nhap: ");
                        int c=sc.nextInt();
                        System.out.println("Nhap: ");
                        int d=sc.nextInt();
                        System.out.println("Hieu hai so "+c +" va "+d +" la: "+inter.hieu(c, d));
                        break;
                    case "exit":
                        return;
                
                
                    default:
                        break;
                }

            }
            

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
