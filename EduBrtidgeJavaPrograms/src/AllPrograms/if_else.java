package AllPrograms;
import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to check you are eligible or not? ");
		int a = sc.nextInt();
		
		if(a>18) {
			System.out.println("Eligible for voting ");
		}
		else {
			System.out.println("Not eligible for voting. ");
		}
		
		System.out.println( (a>18) ? "Eligible for voting ":"Not eligible for voting. ");
		
		sc.close();
	}

}
