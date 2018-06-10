package assignment1;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter string ");
		
		String str = s.nextLine();
		
		System.out.println("string you entered = "+str);
		
		String[] name = str.split(",");
		for(String n:name) {
			System.out.println(n.trim());
			
		}
		
        char[] ch = str.toCharArray();
        for(char c:ch) {
        	System.out.println(c+" ");
        	
        }
        
        if(str.startsWith("x"))
        {
        	
        }
	    
			
	
			
		
	}

}
