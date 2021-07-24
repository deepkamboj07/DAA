#include<stdio.h>
#include<math.h>
void binarySearch(int arr[], int n, int key)
{
   int low=0;
   int high=n;
   int flag=0;
   int comparision=0;
   
   while(low<=high){
   	    int mid=floor((low+high)/2);
   	    
   		comparision++;
		if(arr[mid]==key){
			printf("Persent %d",comparision);
			flag=1;
			return;
		}
		
		
		else if(arr[mid]>key){
			comparision++;
			high=mid-1;
		}
		else{
			comparision++;
			low=mid+1;
		}
   }
   
   if(flag==0){
   	 printf("Not Persent %d",comparision);
   }
}
  
int main(){
	
	int test;
	scanf("%d",&test);
	while(test>0){
		int n;
		scanf("%d",&n);
		
		int arr[n];
		for(int i=0;i<n;i++){
			scanf("%d",&arr[i]);
		}
		
		int key;
		scanf("%d",&key);
		
		binarySearch(arr,n-1,key);
		
		test--;
	}
	
	return 0;
}
