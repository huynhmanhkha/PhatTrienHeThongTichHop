import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
    public final static int serverPort=7;
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Server da dc tao");
            while(true){
                try {
                    Socket s = ss.accept();
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                int ch=0;
                while(true){
                    ch=is.read();
                    if(ch==-1)  break;
                    System.out.println((char)ch);
                    os.write(ch);
                    
                }
                s.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
