package password;
import java.util.Scanner;
public class password {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a password that must have ");
		System.out.println("At least eight characters");
		System.out.println("Must contain only letters and digits");
		System.out.println("Must contain at least two digits");
		System.out.print("Password :");
		String s=input.nextLine();
		
	  password( s);
}
	public static void password(String s) {
		int count=0;
		
			{for (int i=0;i<s.length();i++)
		if (s.charAt(i)>='0' && s.charAt(i)<='9') 
		count++;}
			int counter=0;
			{for (int i=0;i<s.length();i++)
			if (s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') 
				counter++;}
			int sum=0;
			{for (int i=0;i<s.length();i++)
			if (s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z'
				||s.charAt(i)>='0' && s.charAt(i)<='9')
				sum++;}
			
			if (count>=2 && s.length()>=8 && counter>=2 &&sum==s.length())
		System.out.println("Valid password");
			
		 if(count<2 ||s.length()<8|| counter<2||sum<s.length())
			{System.out.println("invalid password");}
		
	}
}
	
	
