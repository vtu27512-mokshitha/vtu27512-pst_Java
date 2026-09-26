import java.util.LinkedList;

public class Task5_DesignHashSet {

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add(1);
        set.add(2);
        System.out.println("contains(1) -> " + set.contains(1)); // true
        System.out.println("contains(3) -> " + set.contains(3)); // false
        set.add(2);
        System.out.println("contains(2) -> " + set.contains(2)); // true
        set.remove(2);
        System.out.println("contains(2) -> " + set.contains(2)); // false
    }

    static class MyHashSet {
        private static final int BUCKETS = 1000;
        private final LinkedList<Integer>[] buckets;

        @SuppressWarnings("unchecked")
        public MyHashSet() {
            buckets = new LinkedList[BUCKETS];
            for (int i = 0; i < BUCKETS; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int getHash(int key) {
            return key % BUCKETS;
        }

        public void add(int key) {
            int index = getHash(key);
            LinkedList<Integer> bucket = buckets[index];
            if (!bucket.contains(key)) {
                bucket.add(key);
            }
        }

        public void remove(int key) {
            int index = getHash(key);
            // Integer.valueOf(key) ensures LinkedList removes by value (Object), not by index
            buckets[index].remove(Integer.valueOf(key));
        }

        public boolean contains(int key) {
            int index = getHash(key);
            return buckets[index].contains(key);
        }
    }
}