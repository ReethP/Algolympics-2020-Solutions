import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class TheOnlyLevel{
	public static int found(ArrayList<Integer> allKeys, int key) {
		int first = 0;
		int last = allKeys.size() - 1;
		int mid = last / 2;

		while (first <= last) {
			if (allKeys.get(mid) < key) {
				first = mid + 1;
			} else if (allKeys.get(mid) == key) {
				return mid;
			} else {
				last = mid - 1;
			}

			mid = (first + last) / 2;
		}

		return -1;
	}

	public static void main(String[] args) {
		int numOfCases = 0, numOfLocks = 0;
		ArrayList<Integer> numberlist = new ArrayList(){};
		ArrayList<String> answers = new ArrayList(){};
		Scanner sc = new Scanner(System.in);

		try {
			numOfCases = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		long runTime = System.nanoTime();

		for(int k = 0;k<numOfCases;k++){
		Boolean success = true;
		String a = sc.nextLine();
		String inputs[] = a.split(" ");
		int integer = Integer.parseInt(inputs[0]);
		int base = Integer.parseInt(inputs[1]);

		for(int i = 1;i<base;i++) numberlist.add(i);
		

		for (int j = 1; j < base; j++){
			int digitalroot = 1+(((integer*j)-1)%(base-1));
			int index = found(numberlist,digitalroot);
			if(index>-1) numberlist.remove(index);
			else{
				success = false;
				// answers.add("NOT COOL");
				// break;
			}
		}
		if(success) answers.add("COOL");
		else answers.add("NOT COOL");

									}
		for(int i = 0;i<numOfCases;i++) System.out.println(answers.get(i));
		long endTime = System.nanoTime() - runTime;
		System.out.println(endTime);
										}
}