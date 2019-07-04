
public class Palindrom {

	public static void main(String[] args) {
		String  s="civic";
		String p="";
		int len=s.length();
		System.out.println(len);
		
for(int i=len-1;i>=0;i--) 
	p=p+s.charAt(i);
	System.out.println(p);
	if(s.equals(p)) 
		System.out.println("The word "+s+ " is palindrome");
		else 
			System.out.println(" The word "+s+ "  is not palindrome");
		}
	}

	


