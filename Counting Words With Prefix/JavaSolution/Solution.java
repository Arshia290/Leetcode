package countingWordsWithPrefix;

public class Solution {
	//The thought process behind this solution was to check every single word
	//in the String array and check if it contains the prefix. The int count keeps
	//track of the number of words that contained the prefix
	public int prefixCount(String[] words, String pref) {
		int count = 0;
		
		for(String word : words) {
			if(word.length() >= pref.length() && word.startsWith(pref)) {
				count++;
			}
		}
		return count;
	}
}
