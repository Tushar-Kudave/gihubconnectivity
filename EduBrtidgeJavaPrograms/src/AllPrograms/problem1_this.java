package AllPrograms;
// this method 
public class problem1_this {

	problem1_this(){
		this("Tushar",21);
		System.out.println("Inside default constructor.");
	}
	problem1_this(int a, String b){
		System.out.println("Inside 2 paramerterized constructor.");
		System.out.println(a+" "+b);
	}
	problem1_this(String name, int age){
		this(21,"Tushar");
		System.out.println("Inside 3 parameterized constructor.");
		System.out.println(name +" "+ age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem1_this p = new problem1_this();
	}
}
