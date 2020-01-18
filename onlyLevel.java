import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class onlyLevel{
	public static void main(String[] args) {
		int numOfCases = 0, numOfLocks = 0;
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
			int[] numberlist = new int[base];
			for (int j = 1; j < base; j++){
				int digitalroot = 1+(((integer*j)-1)%(base-1));
				try {
					if(numberlist[digitalroot] == 0) numberlist[digitalroot]++;
					else{
						success = false;
						break;
					}
				} catch (Exception e) {
					success = false;
					break;
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


