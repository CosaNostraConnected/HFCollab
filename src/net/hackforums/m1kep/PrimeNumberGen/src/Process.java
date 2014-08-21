import java.util.HashMap;


public class Process {
public HashMap<Integer, Boolean> ProcessInformation(int p, HashMap<Integer, Boolean> map)
{
	return map;
}


public static int GetLargestKeyInHashMap(HashMap<Integer, Boolean> map)
{
	int num = 0;
	for(int i = 1; i <= map.keySet().size() + 1; i++)
	{
		System.out.println(i);
		if(map.containsKey(i))
		{

			if(i > num)
			{
				num = i;
			}
			System.out.println(num);
		}
	}
	return num;
}
}
