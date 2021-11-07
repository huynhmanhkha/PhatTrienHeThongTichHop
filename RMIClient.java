import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry(9989);
            RMIInterface inter = (RMIInterface)reg.lookup("Obj");

            // System.out.println("So tu trong chuoi la: "+inter.dem());
            // System.out.println("Chuoi sau dao nguoc: "+inter.dao());

            Scanner sc = new Scanner(System.in);
           
            while(true){
                System.out.println("1.Dem so tu trong chuoi");
                System.out.println("2.Dao nguoc chuoi");
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
