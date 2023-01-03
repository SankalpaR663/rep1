package array_cloning;

public class SingleDeepCopyEx {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		
		int arr2[]=arr1.clone();
		
		//arr2[1]++;
		
		System.out.println("arr1[] contents");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("arr2[] contents");
		for(int a:arr2)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		arr2[1]++;
		
		System.out.println("arr1[] contents after");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("arr2[] contents after");
		for(int a:arr2)
		{
			System.out.print(a+" ");
		}
		System.out.println();

	}

}
