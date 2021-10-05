import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static ServerSocket ss=null;
    public static void main(String[] args) {
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            ss = new ServerSocket(8888);
            System.out.println("Server da dc tao");
            Socket s = null;
            s=ss.accept();
            dos=new DataOutputStream(s.getOutputStream());
            dis=new DataInputStream(s.getInputStream());
            String ch="";
            while(true){
                ch=dis.readUTF();
                char n[]=ch.toCharArray();
                if(Character.isDigit(n[0])){
                    int i=Integer.parseInt(ch);
                    switch(i){
                        case 0: ch="Khong"; break;
                        case 1: ch="Mot"; break;
                        case 2: ch="Hai"; break;
                        case 3: ch="Ba"; break;
                        case 4: ch="Bon"; break;
                        case 5: ch="Nam"; break;
                        case 6: ch="Sau"; break;
                        case 7: ch="Bay"; break;
                        case 8: ch="Tam"; break;
                        case 9: ch="Chin"; break;
                    }
                    dos.writeUTF(ch);
                }
                else{
                    dos.writeUTF("Khong phai so nguyen");
                }
                 
            }
        } catch (Exception e) {
           
        }
    }
}
