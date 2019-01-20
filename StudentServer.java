package original;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class StudentServer extends UnicastRemoteObject implements StudentServerInterface
{
	private Map<String, Double> scoreMap = new HashMap<>();

	protected StudentServer() throws RemoteException
	{
		initialize();
	}

	private void initialize()
	{
		scoreMap.put("zz", 80.3);
		scoreMap.put("cc", (double) 100);
	}

	@Override
	public double findScore(String name) throws RemoteException
	{
		Double score = scoreMap.get(name);

		if (score == null)
		{
			return 100.0;
		}

		return score;
	}
}
