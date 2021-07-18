#include<stdio.h>
void linearSearch(int arr[],int n,int key){
		int comparision=0;
		int flag=0;
		
		for(int i=0;i<n;i++){
			comparision++;
			if(key==arr[i]){
			   printf("PERSENT %d\n",comparision);
			   flag=1;
			   break;
			}
		}
		
		if(flag!=1){
			printf("NOT PERSENT %d\n",comparision);
		}
}
int main(){
	
	int test;
	scanf("%d",&test);
	
	while(test>0){
		
		int n,key;
		scanf("%d",&n);
		int arr[n];
		
		for(int i=0;i<n;i++){
			scanf("%d",&arr[i]);
		}
	
		scanf("%d",&key);
		
	    linearSearch(arr,n,key);
			
		test--;
	}
	
	return 0;
}