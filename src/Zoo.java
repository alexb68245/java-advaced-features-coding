import java.util.*;

public class Zoo {

    private Map<String, Integer> animals = new HashMap<>();//Map<emri i kafshes, numri i tyre>
    private List<String> animalList = new ArrayList<>();//List<emri i kafshes>


    public int getNumberOfAllAnimalsList(){
        return animalList.size();
    }

    public int getNumberOfAllAnimals() {
        int total = 0;
        for (int count : animals.values()) {
            total += count;
        }
        return total;
    }

    public Map<String, Integer> getAnimalsCountList(){
        Map<String, Integer> animalsCount = new HashMap<>();
        for (int i = 0; i < animalList.size(); i++) {
            int counter = 0;
            for (int j = i + 1; j < animalList.size(); j++) {
                if (animalList.get(i) == animalList.get(j)) {
                    counter++;
                }
                animalsCount.put(animalList.get(i), counter);
            }
        }
        return animalsCount;
    }

    public Map<String, Integer> getAnimalsCount() {
        return new HashMap<>(animals);
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(animals.entrySet());
        //List<Map.Entry<String, Integer>> list = new ArrayList<>(getAnimalsCountList().entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public void addAnimalList(String name, int count){
        if (count <= 0) {
            System.out.println("The number of animals to add must be greater than 0");
            return;
        }

        if (getAnimalsCount().get(name) != 0) {
            animalList.add(name);
            getAnimalsCount().put(name, count + getAnimalsCount().get(name));
        }
        animalList.add(name);
        getAnimalsCount().put(name, count);

    }

    public void addAnimals(String species, int count) {
        if (count <= 0) {
            System.out.println("The number of animals to add must be greater than 0");
            return;
        }
        animals.put(species, animals.getOrDefault(species, 0) + count);
    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimals("Lion", 5);
        zoo.addAnimals("Elephant", 3);
        zoo.addAnimals("Giraffe", 7);
        zoo.addAnimals("Lion", 2);


        System.out.println("Total number of animals: " + zoo.getNumberOfAllAnimals());

        System.out.println("Animals count: " + zoo.getAnimalsCount());

        System.out.println("Sorted animals count: " + zoo.getAnimalsCountSorted());
    }
}
