class Emp{
	void m() {
		System.out.println("Heloo Employee");
	}
	
	String name;
	int salary;
	String cname;
	
	void show() {
		System.out.println(name+" "+salary+" "+cname);
	}
	
	void input(String n, int s, String cn) {
		name = n;
		salary = s;
		cname = cn;
	}
}
public class ClassObjectEx2 {
	public static void main() {
		System.out.println("Hello Main");
		Emp a =new Emp();
		Emp b =new Emp();
		Emp c =new Emp();
		Emp d =new Emp();
		
		a.m();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		a.input("Ram Gupta" , 100000 , "ABC" );
		b.input("Teja Singh",  890000, "XYZ");
		c.input("Kaliya Singh" , 750000000, "MNO");
		d.input("Cheetan Mehra", 100000000, "PQR");
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		int total=a.salary+b.salary+c.salary+d.salary;
		System.out.println("Total Salary: "+total);
		
		a.m();
		
		
	}

}
