import java.util.*;

public class CollectionsEx10 {

	public static void main(String[] args) {
		
		LinkedHashMap a=new LinkedHashMap();
		a.put("abc",10);
		a.put("xyz","Palak");
		a.put("pqr",7.2);
		a.put("tuv",10);
		a.put(5,12);
		a.put("mno",5);
		System.out.println(a);
		
		Set s=a.entrySet();
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Object o:s) {
			System.out.println(o);
		}
	}

}