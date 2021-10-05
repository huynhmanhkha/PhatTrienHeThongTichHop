import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPEchoClient{
    public final static String serverIP="127.0.0.1";
    public final static int serverPort=7;
    public static void main(String[] args) throws InterruptedException,IOException {
        Socket s=null;
        try {
            s=new Socket(serverIP,serverPort);
            System.out.println("Client da dc tao");
            InputStream is=s.getInputStream();
            OutputStream os=s.getOutputStream();

            for(int i='0';i<='9';i++){
                // Scanner sc = new Scanner(System.in);
                // System.out.println("Nhập 1 số: ");
                // int n=sc.nextInt();
                os.write(i);
                int ch=is.read();
                System.out.println((char)ch);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Khong the tao");
        }finally{
            if(s!=null){
                s.close();
            }
        }
    }
}