import java.lang.reflect.Array;
import java.util.*;

public class Ushtrimi14 {

    public static int array[] = new int[100000];

    public static void populateArray(){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(1000);
        }
    }

    public static List<Integer> uniqueItems(){
        Set<Integer> uniqueItems = new HashSet<>();
        for (int number : array){
            if (uniqueItems.contains(number)){
                uniqueItems.remove(number);
            }
            else uniqueItems.add(number);
        }
        return new ArrayList<>(uniqueItems);
    }

    public static List<Integer> duplicateItems(){
        List<Integer> duplicateItems = new ArrayList<>();
        Set<Integer> uniqueItems = new HashSet<>();
        for (int number : array){
            if (!uniqueItems.contains(number) && !duplicateItems.contains(number)){
                duplicateItems.add(number);
            }
        }
        return duplicateItems;
    }

    public static List<Integer> twentyFiveMostFrequentItems(){
        Map<Integer, Integer> mostFrequentItems = new HashMap<>();
        for (int number : array){
            mostFrequentItems.put(number, mostFrequentItems.getOrDefault(number, 0) + 1);
        }
        return mostFrequentItems.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(25)
                .map(Map.Entry::getKey)
                .toList();
    }

    public static void main(String[] args) {
        populateArray();
        System.out.println(uniqueItems());
        System.out.println(duplicateItems());
        System.out.println(twentyFiveMostFrequentItems());
    }


}
