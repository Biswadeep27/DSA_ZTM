import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseHashMaps {


    public static void main(String[] args){
        //HashMap - No order
        //LinkedHashMap - Ordered in which the key,value pairs are entered
        //TreeMap - Natural Ordering/Sorted - for String {A..Z}, for Numbers - ASC
        HashMap<String, String> dict = new HashMap<String, String>();
        LinkedHashMap<String, String> orderedDict = new LinkedHashMap<String, String>();
        TreeMap<Integer, Integer> sortedDict = new TreeMap<Integer, Integer>();

        dict.put("raj","aryan");
        orderedDict.put("raj","aryan");
        dict.put("tgnd","tbnd");
        orderedDict.put("tgnd","tbnd");
        dict.put("pos","neg");
        orderedDict.put("pos","neg");
        dict.put("friends","bbt");
        orderedDict.put("friends","bbt");

        sortedDict.put(7,5);
        sortedDict.put(2,6);
        sortedDict.put(9,1);
        sortedDict.put(4,9);

        for(String word: dict.keySet()){
            System.out.println("Keys: " + word + " , Values: " + dict.get(word));
        }
        for(String word: orderedDict.keySet()){
            System.out.println("Ordered Keys: " + word + " , Ordered Values: " + orderedDict.get(word));
        }

        for(Map.Entry<String, String> entry: dict.entrySet()) {
            System.out.println("Keys: " + entry.getKey() + " , Values: " + entry.getValue());
        }

        for(Map.Entry<Integer, Integer> entry: sortedDict.entrySet()) {
            System.out.println("sorted Keys: " + (entry.getKey()) + " , Values: " + (entry.getValue()));
        }
    }
}
