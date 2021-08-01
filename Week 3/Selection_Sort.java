/* Given an unsorted array of integers, design an algorithm and implement a program to sort this 
array using selection sort. Your program should also find number of comparisons and number of 
swaps required.
 */
import java.util.Scanner;

public class Selection_Sort {
	
	private static void selectionSort(int[] arr, int n) {
		
		int comparision=0,shift=0;
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++){
				comparision++;
				 if(arr[min]>arr[j])
					 min=j;
			}
		
			int tmp=arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
			shift++;
		}
		
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nComparision :"+comparision+"\nShift : "+shift);
		
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
					
				 
					selectionSort(arr,n);
					test--;
				}
				
				kb.close();
		
			}


}
