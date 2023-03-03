package AllPrograms;
// multiple inheritance is not supported in java
// so we use interfaced concept to implement interface
interface Animal{
	void show();  // only method body
	void display();
}

interface Mammale{
	void category(); // only method body
}

class Whale implements Animal,Mammale{
	public void show() {
		System.out.println("It is animal");
	}
	
	public void display() {
		System.out.println("It is display");
	}
	
	public void category() {
		System.out.println("It is a mammale");
	}
}

public class multipleInheritance {
	public static void main(String[] args) {
		Whale w = new Whale();
		w.show();
		w.display();
		w.category();
	}
}
