package AllPrograms;

class Laptop{
	public void device() {
		System.out.println("This is a laptop.");
	}
}
class hp extends Laptop{
	public void company() {
		System.out.println("This is a Hp laptop.");
	}
}


public class withinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hp h = new hp();
		h.device();
		h.company();
	}

}
