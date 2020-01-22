import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
// import java.util.LinkedHashSet;
import java.math.BigInteger;
 
public class swapp{
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
		for(int k = 0;k<iterations;k++){
			String mokmek = sc.nextLine();
			if(mokmek.equals("MOOK")) ones.add(k);
			else zeroes.add(k);
		}

		int len1,len0,last1;
		len1 = ones.size();
		len0 = zeroes.size();
		int special = 0;
		Collections.reverse(ones);

		if(iterations == 2){
			int temp;
			if(len1 == 1 && len0 == 1){
				for(int i = 0;i<swaps;i++){
					temp = ones.get(0);
					ones.set(0,zeroes.get(0));
					zeroes.set(0,temp);
				}}
		}
		else{
				if(len1 < swaps) swaps = len1;
				if(len0 < swaps) swaps = len0;
		
				for(int k = 0;k<swaps;k++){
						if(zeroes.get(k) < ones.get(k)){
							int temp = ones.get(k);
							ones.set(k,zeroes.get(k));
							zeroes.set(k,temp);
						}else{break;}
				}
			}

		int iters = 0;
		BigInteger base = BigInteger.valueOf(2L);
		BigInteger finalint = BigInteger.valueOf(0L);

		for(int i = 0;i<len1;i++){
			finalint = finalint.add(base.pow(ones.get(i)));
		}
		

		BigInteger toMod = BigInteger.valueOf(1000000000L);
		finalint = finalint.mod(toMod);
		System.out.println(finalint);
 
										}
}