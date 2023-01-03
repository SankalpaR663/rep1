package array_cloning;
import java.util.Arrays;

public class Array_copy {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		int b[] = new int[a.length];
			
		System.arraycopy(a,  0, b, 0, 3);
			
		System.out.println("a[] contents before");
			
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
			
		System.out.println("b[] contents before");
			
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
			
		b[0]++;
			
		System.out.println("a[] contents after");
			
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
			System.out.println();
			
		System.out.println("b[] contents after");
			
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
			
		}

	}
