import java.util.*;

public class CollectionsEx6 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList(50);
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(10);
		a.add(12);
		a.add(5);
		a.add(12);
		a.add("Ram");
		System.out.println(a);
		a.add(2,3.6);
		System.out.println(a);
		a.set(2,5.1);
		System.out.println(a);
		
		Double d=(Double)a.get(2);
		System.out.println(d);
		

		
		
		System.out.println(a);
		a.remove(2);
		a.remove((Integer)12);
		a.remove("Ram");
		System.out.println(a);
	}

}