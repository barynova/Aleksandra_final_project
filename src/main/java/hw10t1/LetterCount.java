package hw10t1;

import java.util.HashMap;
import java.util.Map;

class LetterCount {
                public static void main(String[] args) {
                       String sentence = "Use JDBC connection";

                        Map<Character, Integer> letterCounts = new HashMap<>();

                        // Count each letter
                        for (char letter : sentence.toCharArray()) {
                                if (Character.isLetter(letter)) {
                                        letter = Character.toUpperCase(letter); // Convert to uppercase
                                        letterCounts.put(letter, letterCounts.getOrDefault(letter, 0) + 1);
                                }
                        }

                        // Counts for all letters
                        for (char letter : letterCounts.keySet()) {
                                int count = letterCounts.get(letter);
                                System.out.println("Letter '" + letter + "' appears " + count + " times.");
                        }
                }
}
