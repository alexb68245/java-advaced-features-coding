import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Therrasim Ushtrimin1
        List<String> list = new ArrayList<>();
        String a = "hi";
        String b = "atb";
        String c = "ghe";
        list.add(a);
        list.add(b);
        list.add(c);
        //System.out.println(Ushtrimi1.fromAtoZ(list));

        //Therrasim Ushtrimin6
        TreeMap treeMap = new TreeMap();
        treeMap.put("gw","2");
        treeMap.put("sw","3");
        treeMap.put("hd","4");
        //Ushtrimi6.printFirstAndLatEntrySet(treeMap);

        //Therrasim ushtrimin 8
        Parcel parcel = new Parcel(30, 59,67, 13.7f);
        System.out.println(parcel.validate(parcel));

    }
}