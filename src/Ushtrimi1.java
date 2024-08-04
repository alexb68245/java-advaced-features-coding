import java.util.List;

public class Ushtrimi1 {

    public static List<String> fromAtoZ(List<String> strings){
        return strings.stream().sorted().toList();
    }
}
