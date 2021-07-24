import java.util.*;

public class Question3 {
	
	private static int countPair(int[] arr, int n,int key) {
		
		int count =0;
		for(int i=0;i<n-1;i++) 
		{
			for(int j=i+1;j<n;j++) {
				if(arr[i]-arr[j]==key) {
					count++;
				}
			}
		}
		
		return count;
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
			
			int key=kb.nextInt();
			
			int count=countPair(arr,arr.length,key);
			System.out.println(count);
			test--;
		}
		
		kb.close();

	}

	
}

