package original;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentServerInterface extends Remote
{
	double findScore(String name) throws RemoteException;
}
