public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... element){
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < element.length; i++){
            if (i == element.length - 1){
                finalString.append(element[i]);
            }else {
                finalString.append(element[i]).append(separator);
            }
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        Joiner<Integer> joinerInteger = new Joiner("-");
        System.out.println(joinerInteger.join(1,3,4,6,9));

        Joiner<String> joinerString = new Joiner(",");
        System.out.println(joinerString.join("abc", "def", "ghi", "jkl"));

        Joiner<Character> joinerCharacter = new Joiner(".");
        System.out.println(joinerCharacter.join('a', 'b', 'c', 'd', 'e', 'f'));

    }
}
