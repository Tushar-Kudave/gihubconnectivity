package AllPrograms;
class Manager{
	static float salary = 125000.0f;
	void display()
	{
		System.out.println("salary :"+salary);
	}
}
class Developer extends Manager{
	float salary = 45000.0f;
	void display() {
		System.out.println("Developer salary: "+salary);
		System.out.println("Manager salary: "+Manager.salary);
	}
}

public class Inheritanceexmple {
	public static void main(String[] args) {
		Developer d = new Developer();
		d.display();
	}

}
