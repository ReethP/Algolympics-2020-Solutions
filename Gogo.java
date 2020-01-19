import java.util.Scanner;

public class Gogo {
	public static void main(String[] args) {
		int cases = 0;
		Scanner sc = new Scanner(System.in);

		try {
			cases = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		if (cases > 0) {
			int[] output = new int[cases];
			int rows = 0, cols = 0;
			for (int i = 0; i < cases; i++) {
				String s = sc.nextLine();
				String size[] = s.split(" ");
				rows = Integer.parseInt(size[0]);
				rows--;
				cols = Integer.parseInt(size[1]);

				String given[][] = new String[rows][cols];
				
				for (int j = 0; j < rows; j++) {
					String str = sc.nextLine();
					for (int k = 0; k < cols; k++) {
						given[j][k] = Character.toString(str.charAt(k));
					}
				}

				int hit = 0;
				for (int l = 0; l < cols; l++) {
					for (int m = (rows-1); m > -1; m--) {
						if (given[m][l].equals("#")) { //# is an obstacle
							break;
						} else if (given[m][l].equals("X")) { //X is a target
							hit++;
						} else { //otherwise, it's a . which denotes a space
							continue;
						}
					}
				}
				output[i] = hit;
			}

			for (int n = 0; n < cases; n++) {
				if (n == (cases-1)) {
					System.out.print(output[n]);
				} else {
					System.out.println(output[n]);
				}
			}
		} else {
			System.out.println("0");
		}
	}

}