
import java.util.*;

public class Question2 {
	
	private static void findSequence(int[] arr, int n) {
		
		int flag=0;
		
		for(int i=0;i<n-2;i++) 
		{
			for(int j=i+1;j<n-1;j++) 
			{
				for(int k=j+1;k<n;k++) 
				{
					if(arr[i]+arr[j]==arr[k]) {
						System.out.println((i+1)+","+(j+1)+","+(k+1));
						flag=1;			
					} 
				}
			}
		}
		
		if(flag==0) {
			System.out.println("No sequence");
		}
		
	}


	public static void main(String[] args) {
		
		Scanner kb= new Scanner(System.in);
		
		int test=kb.nextInt();
		while(test>0) {
			int n=kb.nextInt();
			int[] arr= new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=kb.nextInt();
			}
			
			findSequence(arr,arr.length);
			test--;
		}
		
		kb.close();

	}

	
}
