import java.util.HashSet;

public class SDAHashSet<E> extends HashSet<E> {

    HashSet<String> set = new HashSet<>();
    @Override
    public boolean remove(Object o) {
        if (set.contains("admin")){
            return false;
        }
        return super.remove(o);
    }

    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public void clear() {
        super.clear();
    }
}
