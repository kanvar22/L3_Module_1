package SearchingAndSortingAlgorithms;

import java.util.Iterator;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int counter = 0;
		for(String brokenEgg : eggs) {
			if (brokenEgg .equals("cracked")) {
				return counter;
			}
		counter += 1;
		}
		return -1; //<- this needs changing
	}
	
	public static int countPearls(List<Boolean>Oysters ) {
		int counterPearl = 0;
		for(Boolean hasPearl : Oysters) {
			if (hasPearl ) {
				counterPearl +=1;
			}
		}
		return counterPearl;
		
	}

	public static double findTallest(List<Double> peeps) {
		
		return 0;
	}
	
}