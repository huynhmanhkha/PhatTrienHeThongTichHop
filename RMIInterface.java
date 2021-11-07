import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
    public int dem(String s) throws RemoteException;

    public String dao(String s) throws RemoteException;
}
