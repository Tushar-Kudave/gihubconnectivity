package AllPrograms;
// multi-level inheritance


class Device{  //base class
	void display() {
		System.out.println("It is a electronic device.");
	}
}
class LaptopD extends Device{ // derived class as well as base class
	void show() {
		System.out.println("It is a Laptop.");
	}
}

class HPLaptop extends LaptopD{ //derived class or child class
	void showall() {
		System.out.println("It is a HP laptop.");
	}
}

public class multilevel {

	public static void main(String[] args) {
		HPLaptop hp = new HPLaptop();
		hp.display();
		hp.show();
		hp.showall();

	}

}
