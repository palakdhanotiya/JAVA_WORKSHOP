public class ExceptionHandlingEx11 {

	public static void main(String[] args) {

		try {
			int r=7/0;
			System.out.println("Division: "+r);
		}catch (ArithmeticException ae) {
			System.out.println("Hi");
		}catch (Exception ae) {
			System.out.println("Hello");
		}
		System.out.println("Bye");
	}

}