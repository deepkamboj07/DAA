/* Given an unsorted array of integers, design an algorithm and a program to sort the array using 
insertion sort. Your program should be able to find number of comparisons and shifts ( shifts - total 
number of times the array elements are shifted from their place) required for sorting the array. */


import java.util.*;

public class Insertion_sort {
	
	private static void insertionSort(int[] arr, int n) {
		
		int comparision=0,shift=0;
		
		for(int i=1;i<n;i++) {
			int tmp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>tmp) {
				arr[j+1]=arr[j];
				j--;
				comparision++;
				shift++;
			}
			
			shift++;
			arr[j+1]=tmp;
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
			
		 
			insertionSort(arr,n);
			test--;
		}
		
		kb.close();

	}

}


