import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ushtrimi2 {
    public static List<String> fromAtoZ(List<String> strings){
        Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
        return strings;
    }
}
