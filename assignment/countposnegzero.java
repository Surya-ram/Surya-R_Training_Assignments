package assignment;
import java.util.*;

public class countposnegzero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements:");
		int a=sc.nextInt();
		
		int[] arr=new int[a];
		System.out.print("Enter the number of elements:");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int p=0,n=0,z=0;

		for(int x:arr){
		    if(x>0)p++;
		    else if(x<0)n++;
		    else z++;
		}

		System.out.println(p+" "+n+" "+z);
		// TODO Auto-generated method stub

	}

}
