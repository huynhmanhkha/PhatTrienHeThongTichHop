import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
    public int dem(String s) throws RemoteException;

    public String dao(String s) throws RemoteException;

    public String inhoa(String s) throws RemoteException;

    public int tong(int a,int b) throws RemoteException;

    public int hieu(int c,int d) throws RemoteException;


}
