package homeworks.lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTasks {
    public static void main(String[] args) {

        // 13. Write a Java program to associate the specified value with the specified key in a HashMap.

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("John", "England");
        hashMap.put("Lara", "France");
        hashMap.put("Arpine", "Armenia");
        System.out.println(hashMap);

        // 14. Write a Java program to count the number of key-value (size) mappings in a map.

        int hashMapSize = hashMap.size();
        System.out.println("The size of hashmap: " + hashMapSize);

        // 15. Write a Java program to copy all of the mappings from the specified map to another map.

        HashMap<String, String> hashMap1 = new HashMap<>(hashMap);
        System.out.println("Content of hashmap2 : " + hashMap1);

        // 16. Write a Java program to remove all of the mappings from a map.

        hashMap1.clear();
        System.out.println("Hashmap1 after removing elements : " + hashMap1);

        // 17. Write a Java program to check whether a map contains key-value mappings (empty) or not.

        System.out.println("HashMap is empty: " + hashMap.isEmpty());

        // 18. Write a Java program to get a shallow copy of a HashMap instance.

        @SuppressWarnings("unchecked")
        HashMap<String, String> hashMap2 = (HashMap<String, String>) hashMap.clone();
        System.out.println("Clone of hashmap: " + hashMap2);

        // 19. Write a Java program to test if a map contains a mapping for the specified key.

        String key = "John";
        boolean containsKey = hashMap.containsKey(key);
        if (containsKey) {
            System.out.println("Hashmap contains a mapping with " + key + " key : " + hashMap.get(key));
        } else {
            System.out.println("Hashmap doesn't contain mapping with " + key + " key : ");
        }

        // 20. Write a Java program to test if a map contains a mapping for the specified value.

        System.out.println("Hashmap contains a mapping with France value: " + hashMap.containsValue("France"));

        // 21. Write a Java program to create a set of the mappings contained in a map.
        // ( hint: myHashmap.entrySet() )

        Set<Map.Entry<String, String>> setOfEntries = getEntrySetContainer(hashMap);
        System.out.println("Content of hashset : " + setOfEntries);

        // 22. Write a Java program to get the value of a specified key in a map.

        String keyOfHashMap = "Emma";
        System.out.println("Value of " + keyOfHashMap + " key in hashmap: " + hashMap.get(keyOfHashMap));

        // 23. Write a Java program to get a set of the keys contained in this map.

        Set<String> setOfKeys = getKeySetContainer(hashMap);
        System.out.println(setOfKeys);

        // 24. Write a Java program to get a collection view of the values contained in this map.

        System.out.println("Collection view of hashmap: " + hashMap.values());
    }

    static <K, V> Set<Map.Entry<K, V>> getEntrySetContainer(HashMap<K, V> map) {
        return map.entrySet();
    }

    static <K, V> Set<K> getKeySetContainer(HashMap<K, V> map) {
        return map.keySet();
    }
}
