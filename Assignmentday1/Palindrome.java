package Assignmentday1;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your string : ");
//		String p = sc.next();
//		
		String p = "nit"
				+ "in";
		String p2 = "";
		int n=p.length();
		for(int i=n-1;i>=0;i--) {
			p2=p2+p.charAt(i);
		}
		if(p.equals(p2)) {
			System.out.println("This is palindrome");
			}
		else {
			System.out.println("This is not a palindrome");

		}
	}

}
