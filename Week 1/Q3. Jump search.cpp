#include<stdio.h>
void jumpsearch(int arr[],int n,int key,int bs){
	int low=0;
	int high=bs;
	int flag=0;
	
	while(high<=n){
		
		if(arr[low]<=key && key<arr[high]){
			for(int i=low;i<high;i++){
				if(arr[i]==key){
					flag=1;
					printf("Persent");
					return;		
				}
			}
		}else{
			low=high;
			high=high+bs;
		}
	}
	
	if(flag==0){
		printf("Not Persent");
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
		
		jumpsearch(arr,n-1,key,2);
		
		test--;
	}
	
	return 0;
}
