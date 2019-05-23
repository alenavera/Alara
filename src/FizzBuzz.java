import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			  if ((i%3 == 0) && (i%5 == 0)) {

	                System.out.println("FizzBuzz" + ", ");
		
			}else if
				(i%3==0){
					
				System.out.print("  Fizz"+ ", ");
			}else if (i%5==0){
				System.out.print("  Buzz"+ ", ");
			}else
			System.out.print(i+ " , ");
			
		}

		 String[] keys= {"a", "b", "c"}; 
		 int[] vals= {1, 2, 3}; 
		 
		 HashMap<String, Integer> hash= new HashMap<String, Integer>(); 
		 
	for(int i= 0; i < keys.length; i++){   
		
		hash.put(keys[i], vals[i]); 
		;}
	  System.out.println("---------------------------------------------------------------");
	  System.out.println(hash);
	  
	  System.out.println("------------------------------------------------------------------------");
	  
	 
	} 
	
	}
	
