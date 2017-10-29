package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {				
		int value = 0;												
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				value += 1;
			}
		}
		return value;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		for(int i = 0; i < message.size(); i++) {
			if(message.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> list){
		List<Double> answer = new ArrayList<Double>();
		for(int i = 0; i < list.size(); i++) {
			answer.add(list.get(i));
		}
		Collections.sort(answer);
		return answer;
	}


	public static List<String> sortDNA(List<String> unsorted){
		List<Integer> numbers = new ArrayList<Integer>();
		List<String> answer = new ArrayList<String>();
		for(int i = 0; i < unsorted.size(); i++) {
			numbers.add(unsorted.get(i).length());
		}
		Collections.sort(numbers);
		
		return answer;
	}
	
	// Add other methods here
}
