package core;

import java.util.*;

public class WordFinder {

    public static String find(List<String> words, String word1) {
        // Convert the input string to a character frequency map
        Map<Character, Integer> inputFreq = getCharFrequency(word1);

        for (String word : words) {
            if (canForm(word, inputFreq)) {
                return word;
            }
        }

        return "-";
    }

    // Helper function to get character frequencies
    private static Map<Character, Integer> getCharFrequency(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }

    // Check if word can be formed from available characters
    private static boolean canForm(String word, Map<Character, Integer> inputFreq) {
        Map<Character, Integer> tempFreq = new HashMap<>(inputFreq);
        for (char c : word.toCharArray()) {
            if (!tempFreq.containsKey(c) || tempFreq.get(c) == 0) {
                return false;
            }
            tempFreq.put(c, tempFreq.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("baby", "cat", "dada", "dog");
        System.out.println(find(words, "ctay")); // Output: cat
        System.out.println(find(words, "dad"));  // Output: -
    }
}
