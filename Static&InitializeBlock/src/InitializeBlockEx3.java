class Animall{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Animall(String n,int a){
		this();
		System.out.println("Hello Animal");
		name=n;
		age=a;
	}
	Animall(){
		System.out.println("Hi Animal");
	}
	{
		System.out.println("Universal");
	}
}
public class InitializeBlockEx3 {
	public static void main(String[] args) {
		Animall p1=new Animall("Gogo",45);
		p1.show();
		Animall p2=new Animall("Pogo",55);
		p2.show();
	}
}
