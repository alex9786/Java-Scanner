package scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your frist name:");	
     String fristName =sc.next();	
	System.out.println(" Enter your last name: ");	
     String lastName =sc.next();
     System.out.println("Enter your Father name:");
     String fathername =sc.next();
	 System.out.println("Enter Your age:");
	  int age = sc.nextInt();
     System.out.println("Enter your demp:");
      double demp=sc.nextDouble();	
	System.out.println("name="+fristName +
			lastName);	
	System.out.println("Fathername="+fathername);
	System.out.println("age="+age);
	System.out.println("demp="+demp);
	
	}	

}
