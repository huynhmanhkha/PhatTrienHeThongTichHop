import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPEchoServer {
    public final static int serverPort=7;
    public final static byte[] buffer = new byte[6000];
    public static void main(String[] args) {
        DatagramSocket ds= null;
        try {
            ds = new DatagramSocket(serverPort);
            System.out.println("Server da dc tao");
            while(true){
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                ds.receive(incoming); // chờ nhận gói tin gởi đến 
                //lấy dữ liệu khỏi gói tin nhận và đổi từ mảng byte ra chuỗi
                String theString = new String(incoming.getData(),0,incoming.getLength());
                System.out.println("Received: "+theString);
                // tạo gói tin chứa dữ liệu vừa nhận đc
                DatagramPacket outsending = new DatagramPacket(theString.getBytes(), incoming.getLength(),
                                                                    incoming.getAddress(),incoming.getPort());
                ds.send(outsending);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
