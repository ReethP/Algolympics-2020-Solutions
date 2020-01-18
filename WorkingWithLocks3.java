import java.util.Scanner;
import java.util.ArrayList;

public class WorkingWithLocks3 {
	public static void main(String[] args) {
		int numOfKeys = 0, numOfLocks = 0;
		ArrayList<Integer locksOpened = new ArrayList(){};
		ArrayList<Integer> allKeys = new ArrayList(){};
		ArrayList<Integer> allLocks = new ArrayList(){};

		Scanner sc = new Scanner(System.in);

		try {
			numOfKeys = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		String k = sc.nextLine();
		String keys[] = k.split(" ");
		for (int i = 0; i < numOfKeys; i++) {
			allKeys.add(Integer.parseInt(keys[i]));
		}

		try {
			numOfLocks = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		String l = sc.nextLine();
		String locks[] = l.split(" ");
		for (int j = 0; j < numOfLocks; j++) {
			allLocks.add(Integer.parseInt(locks[j]));
		}

		for (int a = 0; a < numOfLocks; a++) {
			if (allLocks.get(a).equals(1)) {
				if (allKeys.contains(((Integer) allLocks.get(a)) + 1) && (!locksOpened.contains(allLocks.get(a)))) {
					locksOpened.add(allLocks.get(a));
				}
			} else if (allLocks.get(a).equals(1000000000)) {
				if (allKeys.contains(((Integer) allLocks.get(a)) - 1) && (!locksOpened.contains(allLocks.get(a)))) {
					locksOpened.add(allLocks.get(a));
				}
			} else {
				if (allKeys.contains(((Integer) allLocks.get(a)) + 1) && (!locksOpened.contains(allLocks.get(a)))) {
					locksOpened.add(allLocks.get(a));
				} else if (allKeys.contains(((Integer) allLocks.get(a)) - 1) && (!locksOpened.contains(allLocks.get(a)))) {
					locksOpened.add(allLocks.get(a));
				}
			}
		}
		System.out.println(locksOpened.size());
	}
}