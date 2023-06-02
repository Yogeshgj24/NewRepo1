
public class HelloWorld {
	
	public void myMethod() {
		
		System.out.println("myMethod");
	}
	
	public int myCalculation() {
		System.out.println("myCalculation");
		return 112120;
	}
	
	public String myName() {
		System.out.println("myName");
		return "Java";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld h =  new HelloWorld();
		h.myMethod();
		h.myName();
		h.myCalculation();
		
		System.out.println("Hello World!!!");
		System.out.println("Hello Friends !!!");
		

	}

}
