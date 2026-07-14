import java.util.Scanner;
public class NestedIfEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Given number is postive.");
			if(num % 2 == 0) {
				System.out.println("Given number is even.");
			}else {
				System.out.println("Given number is odd.");
			}
			
		}
		else if(num < 0){
			System.out.println("Given number is negative.");
		}
		else {
			System.out.println("Given number is zero.");
		}
		
		

	}

}
