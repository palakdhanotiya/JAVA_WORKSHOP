class A extends Object{
	String name;
	int age;
	int m() {
		return 6;
	}
	public String toString() {
		return "palak";
	}
}
public class StringEx1{
	public static void main(String[] args) {
		A d = new A();
		System.out.println(d);	
		
		int g[] = new int [] {4,9,0,9};
		System.out.println(g);
		
		char a[] = {'P','a','l','a','k'};
		String n = new String("Palak");
		System.out.println(a);
		System.out.println(n);
		
		//System.out.print(a.toUpperCase());  ----error
		System.out.println(n.toUpperCase());
		System.out.println(n.toString());
		System.out.println(a[2]);
		//System.out.println(n[2]);  ----error
		System.out.println(n.charAt(2));
		
	}
}