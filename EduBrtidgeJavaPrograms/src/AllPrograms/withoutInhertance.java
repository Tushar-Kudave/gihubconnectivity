package AllPrograms;
//without inheritance concept
class laptop{
	void print() {
		System.out.println("Laptop");
	}
}

class hplaptop{
	void company() {
		System.out.println("HP laptop.");
	}
}

public class withoutInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laptop l = new laptop();
		l.print();
		
		hplaptop h = new hplaptop();
		h.company();
	}

}
