package assignment;
import java.util.*;

public class countdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		int a=0,d=0,sp=0;

		for(char c : s.toCharArray()){
		    if(Character.isDigit(c)) d++;
		    else if(Character.isLetter(c)) a++;
		    else sp++;
		}

		System.out.println(a+" "+d+" "+sp);
		// TODO Auto-generated method stub

	}

}
