import java.util.*;

public class main {
    public static void main(String[] args) {
        String[] words = new String[]{"Mama", "Tato", "Daughter", "Son"};

        Set<Character> uniqueChars = findUniqueChars(words);
        System.out.println(uniqueChars);
    }

    public static Set<Character> findUniqueChars(String[] words) {
        List<String> evenWords = new ArrayList<>();
        for (String word : words) {
            boolean isEven = true;
            char[] chars = word.toLowerCase().toCharArray();
            Map<Character, Integer> charCount = new HashMap<>();
            for (char c : chars) {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }
            for (int count : charCount.values()) {
                if (count % 2 != 0) {
                    isEven = false;
                    break;
                }
            }
            if (isEven) {
                evenWords.add(word);
            }
        }
        Set<Character> uniqueChars = new HashSet<>();
        for (String evenWord : evenWords) {
            char[] chars = evenWord.toLowerCase().toCharArray();
            for (char c : chars) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars;
    }
}


