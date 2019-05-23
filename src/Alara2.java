import java.util.HashMap;

public class Alara2 {
	public static void main(String[] args) {
		String[] keys = { "a", "b", "c" };
		int[] vals = { 1, 2, 3 };

		int[] valsaj = { 1, 2, 3, 5, 9, 8, 7,5 };

		HashMap<String, Integer> hash = new HashMap<String, Integer>();

		for (int i = 0; i < keys.length; i++) {

			hash.put(keys[i], vals[i]);
		}

		for (int i:valsaj) {
			
			if( i == 5)
			{
				System.out.println(i);
				continue;
			}

		}
	}
}
