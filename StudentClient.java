package original;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StudentClient
{
	public static void main(String[] args) throws RemoteException, NotBoundException
	{
		Registry registry = LocateRegistry.getRegistry("localhost");
		StudentServerInterface student = (StudentServerInterface) registry.lookup("StudentServer");
		System.out.println(student.findScore("cc"));
	}
}
