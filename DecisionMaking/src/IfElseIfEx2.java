
public class IfElseIfEx2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter b :");
		int b = sc.nextInt();
		
		System.out.println("Enter c :");
		int c = sc.nextInt();
		
		System.out.println("Enter d :");
		int d = sc.nextInt();

		if(a==b && b==c && c==d) {
			System.out.println("All numbers are equal !!");
		}
		else if (a > b && a > c && a > d) {
			System.out.println(a+" is larger among all numbers.");
		}
		else if (b > c && b > d) {
			System.out.println(b+" is larger among all numbers.");
		}
		else if (c > d) {
			System.out.println(c+" is larger among all numbers.");
		}
		else {
			System.out.println(d+" is larger among all numbers.");
		}
		
		System.out.println("Thank You !!");
	}

}
