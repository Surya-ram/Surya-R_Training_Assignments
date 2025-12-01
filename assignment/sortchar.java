package assignment;
import java.util.*;
public class sortchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.print(ch);
		// TODO Auto-generated method stub

	}

}
