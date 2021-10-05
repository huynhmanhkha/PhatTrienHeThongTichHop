import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPEchoClient {
    public final static int serverPort=7;
    public final static byte[] buffer = new byte[6000];
    public static void main(String[] args) {
        DatagramSocket ds=null;
        try {
            ds = new DatagramSocket();
            System.out.println("Client da dc tao");
            InetAddress server = InetAddress.getByName("localhost");
            while(true){
                System.out.println("Nhap: ");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new  BufferedReader(isr);
                String theString = br.readLine();
                byte[] data = theString.getBytes(); //đổi chuỗi ra mảng byte

                // tạo gói tin gởi
                DatagramPacket dp = new DatagramPacket(data, data.length,server,serverPort);
                ds.send(dp);
                byte[] buffer = new byte[6000]; //vùng đếm cho dữ liệu nhận

                //gói tin nhận
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                ds.receive(incoming);

                //doi du lieu nhan dc dang mang byte sang chuoi va in man hinh
                System.out.println("Received: "+new String(incoming.getData(),0,incoming.getLength()));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
