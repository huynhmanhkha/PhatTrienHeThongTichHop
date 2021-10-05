import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer1 {
    public final static int serverPort=7;
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(serverPort);
            System.out.println("Server da dc tao");
            while(true){
                try {
                    Socket s=ss.accept();
                    Processing p =new Processing(s);
                    p.start();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
