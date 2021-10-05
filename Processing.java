import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Processing extends Thread{
    Socket chanel;
    public Processing(Socket s){
        this.chanel=s;
    }
    public void run(){
        try {
            OutputStream os = chanel.getOutputStream();
            InputStream is = chanel.getInputStream();
            while(true){
                int n=is.read();
                if(n==-1)   break;
                os.write(n);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
