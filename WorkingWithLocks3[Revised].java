import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class WorkingWithLocks3 {
	public static boolean found(ArrayList<Integer> allKeys, int key) {
		int first = 0;
		int last = allKeys.size() - 1;
		int mid = last / 2;

		while (first <= last) {
			if (allKeys.get(mid) < key) {
				first = mid + 1;
			} else if (allKeys.get(mid) == key) {
				return true;
			} else {
				last = mid - 1;
			}

			mid = (first + last) / 2;
		}

		return false;
	}

	public static void main(String[] args) {
		int numOfKeys = 0, numOfLocks = 0;
		ArrayList<Integer> locksOpened = new ArrayList(){};
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
		Collections.sort(allKeys);

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
		Collections.sort(allLocks);

		for (int iter = 0; iter < numOfLocks; iter++) {
			if (allLocks.get(iter) == 1) {
				if (found(allKeys, 2)) {
					locksOpened.add(allLocks.get(iter));
				}
			} else if (allLocks.get(iter) == 1000000000) {
				if (found(allKeys, 999999999)) {
					locksOpened.add(allLocks.get(iter));
				}
			} else {
				if (found(allKeys, allLocks.get(iter) + 1)) {
					locksOpened.add(allLocks.get(iter));
				} else if (found(allKeys, allLocks.get(iter) -1)) {
					locksOpened.add(allLocks.get(iter));
				}
			}
		}

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.addAll(locksOpened);
		locksOpened.clear();
		locksOpened.addAll(lhs);

		System.out.println(locksOpened.size());
	}
}