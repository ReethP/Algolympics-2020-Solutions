import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Swappinator{
	public static void main(String[] args) {
		String userInput;
		int iterations, swaps;
		Scanner sc = new Scanner(System.in);
		userInput = sc.nextLine();
		String inputs[] = userInput.split(" ");
		iterations = Integer.parseInt(inputs[0]);
		swaps = Integer.parseInt(inputs[1]);
		
		ArrayList<Integer> ones = new ArrayList<Integer>();
		ArrayList<Integer> zeroes = new ArrayList<Integer>();
		ArrayList<String> binaryNumberList = new ArrayList<String>();
		for(int k = 0;k<iterations;k++){
			String mokmek = sc.nextLine();
			if(mokmek.equals("MOOK")){
				binaryNumberList.add(0,"1");
				ones.add(0,k);
			}else{
				binaryNumberList.add(0,"0");
				zeroes.add(zeroes.size(),k);
			}
		}

		for(int k = 0;k<swaps;k++){
			if(zeroes.get(k) < ones.get(k)){
				binaryNumberList.set(((iterations-1) - ones.get(k)),"0");
				binaryNumberList.set(((iterations-1) - zeroes.get(k)),"1");
			}else{break;}
		}

		System.out.print(Integer.parseInt(String.join("",binaryNumberList),2));

										}
}