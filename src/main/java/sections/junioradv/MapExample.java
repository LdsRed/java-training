package sections.junioradv;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        

        String textTest = "Hola, esta es una prueba bastante loca, pero no"  +
       "que sea asi de loca como se lo estan imaginando tan solo porque dije HOLA";
       Map<String, Integer> myMap = getWordFrequency(textTest);

       for (Map.Entry<String, Integer> entry :myMap.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }
    }

    public static Map<String, Integer> getWordFrequency(String text){
        Map<String, Integer> wordFrequencyMap = new hashMap<>();

        String[] words = text.split("\\W+");
        for (String word : words ) {
            if(word.isEmpty()){continue;}
            word = word.toLowerCase();
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) +1);
        }
        return wordFrequencyMap;
    }
}
