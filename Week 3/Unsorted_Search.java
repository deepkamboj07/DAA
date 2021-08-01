/*Given an unsorted array of positive integers, design an algorithm and implement it using a program 
to find whether there are any duplicate elements in the array or not. (use sorting) */

import java.util.Scanner;

public class Unsorted_Search {
	
	private static void insertionSort(int[] arr, int n) {
		
		for(int i=1;i<n;i++) {
			int j=i-1;
			int tmp=arr[i];
			
			while(j>=0 && arr[j]>tmp) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=tmp;		
		}
		
	}
	
	private static Boolean isDublicate(int[] arr, int n) {
		if(n==0||n==1)
		   return false;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
		}
		
		return false;
		
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
			
		 
			insertionSort(arr,n);
			if(isDublicate(arr,n))
				System.out.println("YES");
			else
				System.out.println("NO");
				
			test--;
		}
		
		kb.close();
	}
	

}
