import java.util.*;

public class CollectionsEx5 {

	public static void main(String[] args) {

		Vector a=new Vector();
		a.add(10);
		a.add("Palak");
		a.add(7.2);
		a.add(10);
		a.add(12);
		a.add(5);
		System.out.println(a.size());
		System.out.println(a.get(2));
		
		for(int x=a.size()-1;x>=0;x--)
			System.out.println(a.get(x));
		
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}		

		ListIterator l=a.listIterator();
		System.out.println(l.previous());
		System.out.println(l.next());
		System.out.println(l.next());
		System.out.println(l.next());
		System.out.println(l.previous());
		System.out.println(l.previous());
		System.out.println(l.previous());
	}
}