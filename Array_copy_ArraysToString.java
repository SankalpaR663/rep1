package array_cloning;

import java.util.Arrays;

public class Array_copy_ArraysToString {

	public static void main(String[] args) {
	
		int a[] = {1,2,3};
		int b[] = new int[a.length];
		
		System.arraycopy(a,  0, b, 0, 3);
		
		System.out.println("a[] contents before");
		System.out.println("a[]:"+Arrays.toString(a));
	
		
		System.out.println("b[] contents before");
		System.out.println("b[]:"+Arrays.toString(b));
		
		b[0]++;
		
		System.out.println("a[] contents after");
		System.out.println("a[]:"+Arrays.toString(a));
		
		
		System.out.println("b[] contents after");
		System.out.println("b[]:"+Arrays.toString(b));
		
	}

}
