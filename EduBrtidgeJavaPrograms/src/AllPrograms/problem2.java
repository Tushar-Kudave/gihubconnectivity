package AllPrograms;

class BManager{
	float salary = 125000.0f;
	void display()
	{
		System.out.println("salary :"+salary);
	}
}
class BDeveloper extends BManager{
	float salary = 45000.0f;
	void display() {
		System.out.println("Developer salary: "+salary);
		System.out.println("Manager salary: "+super.salary); // using super keyword we can take the value of parent class
	}
}

public class problem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDeveloper b = new BDeveloper();
		b.display();
	}

}
