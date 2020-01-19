import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
// import java.util.LinkedHashSet;

public class onlyLevelRevise{
	public static void main(String[] args) {
		int numOfCases = 0;
		ArrayList<String> answers = new ArrayList(){};
		Scanner sc = new Scanner(System.in);
		try {
			numOfCases = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		for(int k = 0;k<numOfCases;k++){
			Boolean success = true; 
			String a = sc.nextLine();
			String inputs[] = a.split(" ");
			long integer = Long.parseLong(inputs[0]);
			long base = Long.parseLong(inputs[1]);
			long first = 1+(((integer*1)-1)%(base-1));
			for (long j = 2; j < base; j++){
				long digitalroot = 1+(((integer*j)-1)%(base-1));
				System.out.println(digitalroot);
				if(digitalroot == first){
					success = false;
					break;
				}
			}
			if(success) answers.add("COOL");
			else answers.add("NOT COOL");
			
			// long endTime = System.nanoTime() - runTime;
			// System.out.println(endTime);
		}
		for(int i = 0;i<numOfCases;i++) System.out.println(answers.get(i));

										}
}