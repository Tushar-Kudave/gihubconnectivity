package AllPrograms;
abstract class abstractprog{
	abstractprog(){
		myinfo();
	}
	public void myinfo() {
		System.out.println("Printing my info.");
	}
	public void myname(String name) {}
	public void myage(int age) {}
}
public class AbstractUsingPoly extends abstractprog{
	AbstractUsingPoly(){
		super();
	}
	public void myinfo() {
		System.out.println("In child class method overriding.");
	}
	public void myname(String name) {
		System.out.println("My name is "+name);
	}
	public void myage(int age) {
		System.out.println("My age is "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractUsingPoly a = new AbstractUsingPoly();
		a.myname("Tushar Vijay Kudave");
		a.myage(21);
	}
}
