import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author rathanakumark
 * @Description : Class to compute the array of unique elements with a minimal
 *              sum
 */
public class MinUniqArrSum {

	/**
	 * @MethodName : minSum
	 * @Description : Method to compute the array of unique elements with a minimal
	 *              sum
	 * @param inputArray
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static int getMinimumUniqueSum(int inputArray[]) {
		int sum = 0;
		List<Integer> arrayList = new ArrayList(inputArray.length);
		arrayList.add(inputArray[0]);
		sum=inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			int val = inputArray[i];
			while (arrayList.contains(val)) {//Checking the duplicate elements in the list
					val++;
			}
			sum+=val;
			arrayList.add(val);
		}
		return sum;
	}

	/**
	 *
	 * @Description : Method to start the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();//Adding elements in an array
		}
		System.out.println(getMinimumUniqueSum(array));
	}
}
