import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RMIImpl extends UnicastRemoteObject implements RMIInterface {
    protected RMIImpl() throws RemoteException{
        super();
    }

    @Override
    public int dem(String s) throws RemoteException {
        // TODO Auto-generated method stub
        // System.out.println("Nhap chuoi: ");
        // Scanner sc = new Scanner(System.in);
        // string = sc.nextLine();

        // int c=0;
        // char ch[]= new char[s.length()];   
        // for(int i=0;i<s.length();i++)
        // {
        //     ch[i]= s.charAt(i);
        //     if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
        //     c++;
        // }
        // return c;

        // StringTokenizer stringTokenizer = new StringTokenizer(s);
        // int dem = stringTokenizer.countTokens();
        // return dem;

        if (s == null) {
            return -1;
        }
        int count = 0;
        int size = s.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i) != '\t' 
                    && s.charAt(i) != '\n') {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
    @Override
    public String dao(String s) throws RemoteException {
        // TODO Auto-generated method stub
        // String s = "";
        // s = new StringBuilder().reverse().toString();
        // return s;
        
        byte[] strAsByteArray = s.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        String kq=new String(result);
        
        return kq;

    }

    @Override
    public String inhoa(String line) throws RemoteException {
        // TODO Auto-generated method stub
        //String line = "";
        String inhoa = line.toUpperCase().toString();
        return inhoa;
    }

    @Override
    public int tong(int a,int b) throws RemoteException {
        // TODO Auto-generated method stub

        return a+b;
    }

    @Override
    public int hieu(int c,int d) throws RemoteException {
        // TODO Auto-generated method stub
        return c-d;
    }

    
}
