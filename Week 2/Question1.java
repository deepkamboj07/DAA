import java.util.*;

public class Question1 {
	

	private static int findKey(int[] arr, int n, int key) {
		
		int low=0;
		int high=n;
		int count=0;
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(arr[mid]==key) {
				count=1+occurence(arr,key,mid);
				break;
				
			}
			else if(arr[mid]>key) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		
		return count;
	
	}

	private static int occurence(int[] arr, int key, int mid) {
		int left=mid-1;
		int count=0;
		
		while(left>=0 && arr[left]==key) {
			count++;
			left--;
		}
		
		int right=mid+1;
		
		while(right<=arr.length-1 && arr[right]==key) {
			count++;
			right++;
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner kb= new Scanner(System.in);
		int test=kb.nextInt();
		
		while(test>0) {
			
			int n= kb.nextInt();
			int arr[]= new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=kb.nextInt();
			}
			
			int key=kb.nextInt();
			
			int count=findKey(arr,arr.length-1,key);
			
			if(count==0) {
				System.out.println("Key not persent");
			}else {
				System.out.println(key+" "+count);
			}
			
			test--;
		}
		kb.close();
		

	}


}
