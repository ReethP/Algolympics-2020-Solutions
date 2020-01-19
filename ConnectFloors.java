import java.util.Scanner;
import java.util.ArrayList;

public class ConnectFloors {
	public static void main(String[] args) {
		int floors = 0;
		Scanner sc = new Scanner(System.in);
		// might not need this, just use else:
		// String stairs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

		try {
			floors = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		if (floors != 0) {
			ArrayList<Integer> rows = new ArrayList<>();
			ArrayList<Integer> cols = new ArrayList<>();
			ArrayList<String> floor = new ArrayList<>();
			for (int i = 0; i < floors; i++) {
				String s = sc.nextLine();
				String size[] = s.split(" ");
				int r = Integer.parseInt(size[0]), c = Integer.parseInt(size[1]);
				rows.add(r);
				cols.add(c);

				for (int j = 0; j < r; j++) {
					String str = sc.nextLine();
					floor.add(floor.size(), str);
				}

				// if (i != (floors-1)) //not sure if i would use a seaprator for the last floor
				floor.add(floor.size(), "0"); //placing a separator
			}


		} else {
			System.out.println("0");
		}
	}
}