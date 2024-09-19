package hashMaps;
import java.util.HashMap;

public class FrequencyCalculat {

    public static void main(String[] args) {

        String[] arr = { 
            "a","b","a","c","d","f","o","q","b","a","c","d","f","o","q"
        };

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : arr) {

            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } 

            else {
                frequencyMap.put(word, 1);
            }
        }
        for (String key : frequencyMap.keySet()) {
            System.out.println("Word: " + key + ", Frequency: " + frequencyMap.get(key));
        }
    }
}
