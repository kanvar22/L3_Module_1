package SearchingAndSortingAlgorithms;

import java.util.Iterator;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int counter = 0;
		for (String brokenEgg : eggs) {
			if (brokenEgg.equals("cracked")) {
				return counter;
			}
			counter += 1;
		}
		return -1; // <- this needs changing
	}

	public static int countPearls(List<Boolean> Oysters) {
		int counterPearl = 0;
		for (Boolean hasPearl : Oysters) {
			if (hasPearl) {
				counterPearl += 1;
			}
		}
		return counterPearl;

	}

	public static double findTallest(List<Double> peeps) {
		double tallPerson = 0;
		for (double tallestPerson : peeps) {
			if (tallestPerson > tallPerson) {
				tallPerson = tallestPerson;
			}
		}
		return tallPerson;
	}

	public static String findLongestWord(List<String> words) {
		int LongestWord = 0;
		String LongWord = "hi";
		for (String word : words) {
			if (word.length() > LongestWord) {
				LongestWord = word.length();
				LongWord = word;
			}
		}
		return LongWord;
	}

	public static Object containsSOS(List<String> message2) {
		String Sos = "... --- ...";
		for (String sos : message2) {
			if (sos.contains(Sos)) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		
		for (int i = 0; i < results.size(); i++) {
			
			for (int j = i+1; j < results.size(); j++) {

				  if (results.get(j) < results.get(i)) {
					  // swap 
					  double swap = results.get(i);
					  results.set(i, results.get(j));
					  results.set(j, swap);

				}
			}
			
		}
return results;
		
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			
			for (int j = i+1; j < unsortedSequences.size(); j++) {

				  if (unsortedSequences.get(j).length() < unsortedSequences.get(i).length()) {
					  // swap 
					  String swap = unsortedSequences.get(i);
					  unsortedSequences.set(i, unsortedSequences.get(j));
					  unsortedSequences.set(j, swap);

				}
			}
			
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {

		return null;
	}
}