import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
public class EmployeeHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1001,"Divya");
		hmap.put(1002,"Vipin");
		hmap.put(1003,"Vidyuth");
		hmap.put(1004,"Arjun");
		hmap.put(1005,"Anitha");
		System.out.println("Employee names");
		System.out.println("----------------");
		for(Map.Entry<Integer,String> emp:hmap.entrySet())
		{
			String value=emp.getValue();
			System.out.println(value);
		}
	}

}
