package array;

public class Quicksort {

	public static void quicksort(int arr[],int start,int end) {
		// TODO Auto-generated method stub
		int pivot,i,j,temp;
		
		if(start<end) {
			pivot = start;
			i =start;
			j=end;
			while(i<j) {
				while(arr[j]<=arr[pivot]&&i<end);
				i++;
				while(arr[j]>=arr[pivot]&&j>=0);
				j--;
				if (i<j) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
					
				}
				
					
			}
			temp= arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			quicksort(arr,start,j-1);
			quicksort(arr,j+1,end);
			
		}
		

	}
	public static void main(String[] args) {
		int arr[] = {12,8,30,6,15,2,1,18};
		System.out.println("Input:");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		int a = 0;
		Quicksort.quicksort(arr,a,arr.length-1);
		System.out.println();
		System.out.println("output:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		
	}
	
	

}
