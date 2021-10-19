package lab3.task1;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.NavigableSet;
import java.util.Comparator;

public class topUsedWords {
    public static void usedWords(String[] words){
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words){
            if (wordCounts.containsKey(word)){
                wordCounts.put(word, wordCounts.get(word)+1);
            }else{
                wordCounts.put(word, 1);
            }
        }
        TreeMap<String, Integer> sortedWordCounts = new TreeMap<>(new ValueComparator(wordCounts));
        sortedWordCounts.putAll(wordCounts);
        NavigableSet<String> keys = sortedWordCounts.descendingKeySet();
        for (int i=0; i<5; i++){
            System.out.println(keys.pollLast());
        }
    }

    static class ValueComparator implements Comparator<String>{
        private Map<String,Integer> map;
        public ValueComparator(Map<String,Integer> map){
             this.map = map;
        }
        @Override
        public int compare(String o1, String o2) {
            if (map.get(o1)>=map.get(o2)){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
