package task4;

import java.util.*;

public class Anagrams {
        public static void test() {
            String[] words = {"calipers", "caret", "slat", "cater", "thickset", "spiracle", "trace",
                    "last", "salt", "bowel", "crate", "loop", "polo", "thickest", "below",
                    "thickets", "pool", "elbow", "replicas"};

            groupAnagrams(words);
        }

        public static void groupAnagrams(String[] words) {
            Map<String, List<String>> map = new HashMap<>();

            for (String word : words) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);

                if (!map.containsKey(sorted)) {
                    map.put(sorted, new ArrayList<>());
                }
                map.get(sorted).add(word);
            }

            for (List<String> anagrams : map.values()) {
                System.out.println(anagrams);
            }
        }
}
