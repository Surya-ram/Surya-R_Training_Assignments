package assignment;
import java.util.*;
public class frequency {

	public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
			        System.out.println("Enter the total no of elements");
			        int n = sc.nextInt();

			        int[] arr = new int[n];
			        System.out.println("Enter the elements of Array");

			        for (int i = 0; i < n; i++) 
			        {
			            arr[i] = sc.nextInt();
			        }

			        for (int i = 0; i < n; i++) 
			        {
			            boolean alreadyCounted = false;
			            for (int k = 0; k < i; k++) 
			            {
			                if (arr[i] == arr[k]) 
			                {
			                    alreadyCounted = true;
			                    break;
			                }
			            }

			            if (alreadyCounted) continue;

			            int count = 0;
			            for (int j = 0; j < n; j++) 
			            {
			                if (arr[i] == arr[j])
			                    count++;
			            }

			            System.out.println(arr[i] + " -> " + count);
			        }
			    }

		// TODO Auto-generated method stub

	}


