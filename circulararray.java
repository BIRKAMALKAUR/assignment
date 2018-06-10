package assignment1;
import java.util.Scanner;
       
public class circulararray {
	
	void leftRotate(int arr[], int r, int n) 
	{
	    for (int i = 0; i < r; i++)
	        rightRotatebyOne(arr, n);
	}

	void rightRotatebyOne(int arr[], int n) 
	{
	    int i, temp;
	    temp = arr[n-1];
	    for (i = n-1; i > 0; i--)
	        arr[i] = arr[i-1];
	    arr[0] = temp;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		circulararray ca = new circulararray();
		System.out.println("Enter number of elements you want to enter = ");
		int n = s.nextInt();
		
		int[] arr= new int[n];
		
		System.out.println("Enter array elements = ");
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("array you entered");
		
		for(int i=0;i<n;i++) {
			System.out.print(+arr[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("enter the number of shifts you want");
		int r = s.nextInt();
		
		 ca.leftRotate(arr, r, n);
		 
		 System.out.println("array after "+r+" rotation = ");
		 
		 for(int i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		 }
	       

	}

	

}
