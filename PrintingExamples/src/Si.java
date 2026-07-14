// WAP to calculate simple interest and all the values is given by user
public class Si {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter Principle(p), Rate(r), Time(t): ");
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float t = sc.nextFloat();
		
		float si = p*r*t/100;
		System.out.println("Final Result Of Si: "+si);
	}

}
