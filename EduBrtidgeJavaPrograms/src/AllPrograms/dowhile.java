package AllPrograms;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for to form table ?");
		int a = sc.nextInt(), i=0;
		System.out.println("Table of "+a+" is");
		do {
			System.out.println(a+" * "+i+" ="+(a*i));
			i++;
		}while(i<11);
		
		sc.close();
	}

}
