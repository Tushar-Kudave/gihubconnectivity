package Java8Features;


interface functionalinterface{  //functional interface
	void method1();
	
}


interface marker{  // marker interface doesn't have any method 
	
}
public class FInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionalinterface f = ()->System.out.println("Hi  there this is a functional interface"); //lambda expression
		f.method1();
	}

}
