package array;
public class BubbleSort
{
	public static void main(String[] args) 
	{
		int a[] = {67,-7,33,5};
		BubbleSort obj = new BubbleSort();
		obj.print(a);
		obj.BubbleSort(a);
		obj.print(a);
		
	}


public void BubbleSort(int a[]) 
{
	if ((a.length== 0)|| (a.length==1) )
	{
		return;
	}
	for (int i=0;i<a.length-1;i++) 
	{
		for (int j=0;j<a.length-1-i;j++) 
		{
			if (a[j]>a[j+1]) 
			{
				int x = a[j];
				a[j]=a[j+1];
				a[j+1] = x;
				
			}
			
		}
	}
	
}
public void print(int a[] ) 
{
	for(int i = 0;i<a.length;i++) {
		
		System.out.println(a[i]+" ");
		
		}
	System.out.println();
	
	}
	
}