package homeworks.lesson8;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {

    public static void main(String[] args) {

        // 1 - Convert elements of a  collection to upper case.

        List<String> list = new ArrayList<>();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("John");
        list.add("Doe");

        List<String> transformedList = convertElementsToUpperCase(list);
        System.out.println("Transformed collection: " + transformedList);

        // 2 - Filter collection so that only elements with less than 4 characters are returned.

        List<String> filteredList = filterElementsLessThen4Characters(list);
        System.out.println("Elements of List with less than 4 characters: " + filteredList);

        // 3 - Flatten multidimensional collection (read about .flatMap non-terminal operation and use it)

        List<List<String>> collection = new ArrayList<>();
        collection.add(list);
        collection.add(transformedList);
        collection.add(filteredList);

        List<String> flattenList = flattenCollection(collection);
        System.out.println("Flatten collection: " + flattenList);

        // 4 -Get oldest person from the collection

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tatev", 35, "Armenian"));
        personList.add(new Person("Vahagn", 40, "Armenian"));
        personList.add(new Person("George", 50, "German"));
        personList.add(new Person("Johann", 60, "German"));
        personList.add(new Person("Tom", 14, "English"));
        personList.add(new Person("John", 12, "English"));

        Optional<Person> oldestPerson = personList.stream()
                .reduce((accumulator, person) -> person.getAge() > accumulator.getAge() ? person : accumulator);
        if (oldestPerson.isPresent()) {
            System.out.println("Oldest person: " + oldestPerson.get());
        } else {
            System.out.println("PersonList is Empty");
        }

        // 5 - Sum all elements of a numeric collection

        List<Integer> numericList = new ArrayList<>();
        numericList.add(1);
        numericList.add(2);
        numericList.add(3);

        Optional<Integer> sum = numericList.stream()
                .reduce((a, element) -> a += element);
        if (sum.isPresent()) {
            System.out.println("Sum of Elements: " + sum.get());
        } else {
            System.out.println("NumericList is empty");
        }

        // 6 - Get names of all kids (under age of 18)

        List<String> kidsList = getKidsNames(personList);
        System.out.println("Names of all kids: " + kidsList);

        // 7 - Partition adults and kids

        System.out.println("Adults: " + partitioningAdult(personList).get(true));
        System.out.println("Kids: " + partitioningAdult(personList).get(false));

        // 8 - Group people by nationality

        Map<String, List<Person>> groupedByNationalityMap = groupByNationality(personList);
        System.out.println("Armenian: " + groupedByNationalityMap.get("Armenian"));
        System.out.println("German: " + groupedByNationalityMap.get("German"));
        System.out.println("English: " + groupedByNationalityMap.get("English"));

        // 9 - Return people names separated by comma

        getNames(personList);

    }

    public static List<String> convertElementsToUpperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> filterElementsLessThen4Characters(List<String> list) {
        return list.stream()
                .filter(word -> word.length() < 4)
                .collect(Collectors.toList());
    }

    public static List<String> flattenCollection(List<List<String>> collection) {
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static List<String> getKidsNames(List<Person> personList) {
        return personList.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public static Map<Boolean, List<Person>> partitioningAdult(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getNationality));
    }

    public static void getNames(List<Person> personList) {
        String names = personList.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Names: " + names);
    }
}
