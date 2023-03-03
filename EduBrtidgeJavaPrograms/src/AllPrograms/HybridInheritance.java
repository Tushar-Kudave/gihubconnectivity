package AllPrograms;
//hybrid inheritance
class GFather{
	void show() {
		System.out.println("Grand Father");
	}
}
class Father extends GFather{
	void show1() {
		System.out.println("Father");
	}
}
class Uncle extends GFather{
	void show2() {
		System.out.println("uncle");
	}
}
class Son extends Father{
	void show3() {
		System.out.println("son");
	}
}
class cousine extends Uncle{
	void show4() {
		System.out.println("Cousine");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.show();
		s.show1();
		s.show3();
		
		
	}
}
