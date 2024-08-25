import java.util.ArrayList;

public class CustomArrayList<E> extends ArrayList<E> {

    public CustomArrayList<E> getEveryNthElement(int startIndex, int skip){
        CustomArrayList newList = new CustomArrayList();
        try {
            if (startIndex < 0 || startIndex > this.size()){
            System.out.println("Index out of bound");
            }
            for (int i = startIndex; i < this.size(); i += skip) {
                if (startIndex + skip > this.size()) {
                    System.out.println("Invalid index");
                }else {
                    newList.add(this.get(i));
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception Error");
            e.printStackTrace();
        }
        return newList;
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> listInteger = new CustomArrayList<>();
        for (int i = 6; i < 16; i++) {
            listInteger.add(i);
        }
        System.out.println(listInteger);
        System.out.println(listInteger.getEveryNthElement(5,3));

        CustomArrayList<String> listString = new CustomArrayList<>();
        listString.add("abc");
        listString.add("def");
        listString.add("ghi");
        listString.add("jkl");
        listString.add("mno");

        System.out.println(listString);
        System.out.println(listString.getEveryNthElement(1,3));
    }
}
