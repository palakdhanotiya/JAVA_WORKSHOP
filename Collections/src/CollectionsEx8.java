import java.util.*;

public class CollectionsEx8 {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		
		a.addFirst(10);
		a.addLast("PALAK");
		a.addLast(7.2);
		a.addFirst(90);
		a.addLast(10);
		a.addLast(5);
		
		System.out.println(a.get(3));
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}