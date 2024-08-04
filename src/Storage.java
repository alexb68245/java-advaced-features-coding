import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static Map<String, String> storagMap = new HashMap<>();

    public Storage(Map<String, String> storagMap) {
        this.storagMap = storagMap;
    }

    private static void addToStorage(String key, String value){
        storagMap.put(key, value);
    }

    private static void printValues(String key){
        System.out.println(storagMap.get(key));
    }

    private static void findValues(String value){
        for (String key : storagMap.keySet()) {
            if (storagMap.get(key).equals(value)) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        addToStorage("hi", "hello");
        addToStorage("a", "1");
        addToStorage("b", "2");
        addToStorage("1", "a");

        System.out.println(storagMap.values());

        printValues("hi");
        findValues("hello");
    }
}
