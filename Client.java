import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket s= null;
        DataOutputStream dos=null;
        DataInputStream dis=null;
        try {
            s=new Socket("127.0.0.1",8888);
            dos=new DataOutputStream(s.getOutputStream());
            dis=new DataInputStream(s.getInputStream());
            Scanner sc = new Scanner(System.in);
            String ch=null;
            while(true){
                System.out.println("Nhap so tu 0-9: ");
                ch=sc.nextLine();
                dos.writeUTF(ch);
                String str=dis.readUTF();
                System.out.println("Ket qua la: "+str);
                
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
