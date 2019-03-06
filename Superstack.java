import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
/**
 * 
 * @Description Class to do stack operations
 */
public class Superstack {
	static void superStack(String[] stackOperations) {
        if (stackOperations == null || stackOperations.length == 0) {
            System.out.println("EMPTY");
            return;
        }
        LinkedList<Integer> dataList = new LinkedList<>();
        for (int i = 0; i < stackOperations.length; i++) {
            String currentEle = stackOperations[i];
            if (currentEle.equals("pop")) {
            	dataList.removeLast();
            } else {
                if (currentEle.startsWith("push")) {
                	dataList.addLast(Integer.parseInt(currentEle.split(" ")[1]));
                } else {
                    int incInitial = Integer.parseInt(currentEle.split(" ")[1]);
                    int incNext = Integer.parseInt(currentEle.split(" ")[2]);
                    ListIterator<Integer> listIterator = dataList.listIterator();
                    int j = 1;
                    while (listIterator.hasNext()) {
                        if (j > incInitial)
                            break;
                        listIterator.set(listIterator.next() + incNext);
                        j++;
                    }
                }
            }
            if (dataList.isEmpty())
                System.out.println("EMPTY");
            else
                System.out.println(dataList.getLast());

        }
	}
	
	/**
	 *
	 * @Description : Method to start the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		 input.nextLine();
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextLine();//Adding elements in an array
		}
		superStack(array);
	}
}
