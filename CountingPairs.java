import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
/**
 * 
 * @author rathanakumark
 * @Description : Class to compute three possible instances of pair to count as a single valid pair
 */
public class CountingPairs {
/**
  * @MethodName : minSum
  * @Description : Method to count pairs with difference k
 * @param array
 * @param k
 * @return
 */
	static int countPairsWithDiff(int array[], int k) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], true);
		}
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i] + k)) {
				String a = "";
				if (array[i] < array[i] + k) {
					a = "(" + array[i] + "," + (array[i] + k) + ")";
				} else {
					a = "(" + (array[i] + k) + "," + array[i] + ")";
				}
				set.add(a);
			}
		}
		return set.size();
	}

	/**
	 * 
	 * @Description : Method to start the program
	 * @param args
	 */
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();//Adding elements in an array
		}
		int k = input.nextInt();
		System.out.println(countPairsWithDiff(array, k));
	}
}
