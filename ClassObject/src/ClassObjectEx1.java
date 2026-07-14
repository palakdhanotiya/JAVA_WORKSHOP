class Employee{
	String name;
	int salary;
	String cname;
}
public class ClassObjectEx1 {
	public static void main(String[] args) {
		
		Employee a = new Employee();
		Employee b = new Employee();
		Employee c = new Employee();
		Employee d = new Employee();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(a.name+ " "+a.salary+" "+a.cname);
		System.out.println(b.name+ " "+b.salary+" "+b.cname);
		System.out.println(c.name+ " "+c.salary+" "+c.cname);
		System.out.println(d.name+ " "+d.salary+" "+d.cname);
		
		a.name = "palak";
		a.salary = 2_00_000;
	    a.cname = "ABC";
	    
	    b.name = "Ruhanii";
	    b.salary = 1_50_000;
	    b.cname = "XYZ";
	    
	    c.name = "Priyansh";
	    c.salary = 2_00_000;
	    c.cname = "ABC";
	    
	    d.name = "Prince";
	    d.salary = 1_50_000;
	    d.cname = "XYZ";
	    
	    
	}

}
