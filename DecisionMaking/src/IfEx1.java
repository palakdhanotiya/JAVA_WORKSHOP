import java.util.Scanner;
public class IfEx1 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println(name+ " is adult");
			System.out.println(name+ " can drive");
		}
		System.out.println("Thank You");
	}

}
