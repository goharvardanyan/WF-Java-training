package homeworks.lesson7;

import java.util.*;

public class HashSetTasks {
    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set.

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Paris");
        hashSet.add("Berlin");
        hashSet.add("Amsterdam");
        hashSet.add("London");

        // 2. Write a Java program to iterate through all elements in a hash set.

        // iterate using enhanced for

        for (String s : hashSet) {
            System.out.println(s);
        }

        // iterate using iterate()

        Iterator<String> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.print(hashSetIterator.next());
        }
        System.out.println();

        // iterate using forEach

        hashSet.forEach(element -> {
            System.out.println(element);
        });

        // 3. Write a Java program to get the number of elements in a hash set.

        int hashsetSize = hashSet.size();
        System.out.println("The Size of hashset is: " + hashsetSize);

        // 4. Write a Java program to empty a hash set.

        HashSet<Integer> hashset2 = new HashSet<>();
        hashset2.add(24);
        hashset2.add(78);
        hashset2.add(95);
        hashset2.clear();
        System.out.println(hashset2);

        // 5. Write a Java program to test if a hash set is empty or not.

        System.out.println("Hashset is empty: " + hashSet.isEmpty());


        // 6. Write a Java program to clone a hash set to another hash set.

        @SuppressWarnings("unchecked")
        HashSet<String> hashSet3 = (HashSet<String>) hashSet.clone();

        // 7. Write a Java program to convert a hash set to an array.

        String[] arrayOfStirngs = hashSet.toArray(new String[hashsetSize]);
        System.out.println("Elements of the array are: ");
        for (String element : arrayOfStirngs) {
            System.out.print(element + ", ");
        }
        System.out.println();

        // 8. Write a Java program to convert a hash set to a tree set.

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("Elements of the treeSet : " + treeSet);

        // 9. Write a Java program to convert a hash set to a List/ArrayList.

        List<String> arrayList = new ArrayList<>(hashSet);
        System.out.println("Elements of the arrayList are: ");
        for (String s : arrayList) {
            System.out.print(s + ", ");
        }
        System.out.println();

        // 10. Write a Java program to compare two hash sets.

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("London");
        hashSet1.add("Austria");
        hashSet1.add("Yerevan");
        hashSet1.add("Berlin");
        System.out.println("Elements of the hashSet1 are: " + hashSet1);
        boolean areEquals = hashSet.equals(hashSet1);
        System.out.println("HashSet and Hashset1 are equals: " + areEquals);

        // 11. Write a Java program to compare two sets and retain elements which are the same on both sets.

        System.out.println("Compare and retain elements of hashSet and hashSet1");
        hashSet.retainAll(hashSet1);
        System.out.println("Elements of hashSet: " + hashSet);

        // 12. Write a Java program to remove all of the elements from a hash set.

        System.out.println("Hashset after removing elements: " + hashSet.removeAll(hashSet));
    }
}
