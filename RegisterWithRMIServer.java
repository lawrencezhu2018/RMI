package original;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RegisterWithRMIServer
{
	public static void main(String[] args) throws RemoteException, AlreadyBoundException
	{
		Registry registry = LocateRegistry.getRegistry();
		registry.rebind("StudentServer", new StudentServer());
	}
}
