package HashmapCodes;

import java.util.HashMap;
import java.util.Set;

public class Intro {
    public static void main(String[] args){
        HashMap<String , Integer> hashmap = new HashMap<>();
        hashmap.put("balochistan",500);
        hashmap.put("india",50);
        hashmap.put("chian",10);
        hashmap.put("us",100);
        hashmap.put("uk",90);
        System.out.println(hashmap);
        hashmap.put("nigaria",100);
        System.out.println(hashmap);
        hashmap.put("uk",200);
        System.out.println(hashmap);
        System.out.println(hashmap.get("balochistan"));
        System.out.println(hashmap.get("ss"));
        System.out.println(hashmap.containsKey("balochistan"));
        System.out.println(hashmap.containsKey("ss"));
        Set<String> keys = hashmap.keySet();
        System.out.println(keys);
        for (String key : hashmap.keySet()){
            Integer val = hashmap.get(key);
            System.out.println(key + " -> " + val);
        }
        for(int i = 0; i < hashmap.size(); i++) {

        }
    }
}
