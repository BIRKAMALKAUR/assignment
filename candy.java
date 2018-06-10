package assignment1;
import java.util.Scanner;
public class candy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter total number of candies = ");
		int n = s.nextInt();
		
		System.out.println("enter number of candies you want to omit = ");
		int m = s.nextInt();
		
		int x = 0 ;
		
		int count = 0;
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			x=(x+m)%n;                        //4,8,2,6...
			arr[i]=x;
			count++;
			
			
		
				for(int j=0;j<i;j++) {
					
				 if( x == arr[j] || x==0 ) {
					 System.out.println("answer = "+count);
					 break;
				 }
				
			
			
			}
			
				
				
				
				
			
			
			
			
		}
		
		
		
		
		

	}

}
