import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            RMIInterface inter = new RMIImpl();
            System.out.println("Khoi tao doi tuong RMIImplement ");
            LocateRegistry.createRegistry(9989);
            Registry reg = LocateRegistry.getRegistry(9989);

            reg.bind("Obj", inter);
            System.out.println("Obj da duoc dang ky");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
