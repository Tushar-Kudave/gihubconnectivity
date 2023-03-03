package AllPrograms;

class Family{
	Family(){
		System.out.println("Family Constuctor");
	}
	
	void info() {
		System.out.println("General family info");
	}
}

public class problem3 extends Family{

	public problem3() {
		super(); // using super method we call parent class constructor
		System.out.println("problem3 constructor");
	}
	
	void info() {
		super.info(); //with use of super keyword we can call parent class method
		System.out.println("My name is Tushar i am 21 years old.");
	}

	public static void main(String[] args) {
		problem3 p = new problem3();
		p.info();
	}

}
