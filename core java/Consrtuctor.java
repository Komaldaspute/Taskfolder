

public class Constructor {
	public static void main(String[] args) {
		
		A a = new A(1,2,3);
		
	}

}

class A{
	private int a;
	private int b;
	private int c;

	A(){
		System.out.println("This is default construcor");
	}
	A(int a){
		this.a = a;
		System.out.println("This is parameterised constructor 1");
	}
	
	A(int a, int b){
		this.a = a;
		this.b = b;
		this.A() = A();
		System.out.println("This is parameterised constructor 2");
	}
	
	A(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println("This is parameterised constructor 3");
	}
}