package algorithm;

import java.util.HashMap;
import java.util.Map;

public class VietnameseCharacterCounter {
    public static void countVietnameseCharacters(String input) {
       
    	Map<String, Character> vietnameseCharacters = new HashMap<>();
        vietnameseCharacters.put("aw", 'ă');
        vietnameseCharacters.put("aa", 'â');
        vietnameseCharacters.put("dd", 'đ');
        vietnameseCharacters.put("ee", 'ê');
        vietnameseCharacters.put("oo", 'ô');
        vietnameseCharacters.put("ow", 'ơ');
        vietnameseCharacters.put("w", 'ư');

        int count = 0;
        int i = 0;
        StringBuilder combinedWords = new StringBuilder();
        
        while (i < input.length() - 1) {
            String pair = input.substring(i, i + 2);
            if (vietnameseCharacters.containsKey(pair)) {
                count++;
                combinedWords.append(pair).append(", ");
                i += 2;
            } else {
                i++;
            }
        }
     
        System.out.println("Output: " + count +"(" +combinedWords.toString()+")");
        
    }

    public static void main(String[] args) {
        String input = "hfdawhwhcoomdd";
         countVietnameseCharacters(input);
        
       
    }
}