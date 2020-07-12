import java.lang.Integer;

public class HashMapRealization<K, V> {
    private static final int DEFAULT_CAPACITY = 16;

    private Integer[] keys;
    private Long[] values;

    int currentSize;
    int maxSize;

    public HashMapRealization(int capacity) {
        currentSize = 0;
        maxSize = capacity;
        keys = new Integer[maxSize];
        values = new Long[maxSize];
    }

    public HashMapRealization() {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return currentSize;
    }

    public void put(Integer key, Long value) {
        if (key == null) throw new IllegalArgumentException("Null key");
        int probe = hash(key);
        int i = probe;
        do {
            if (keys[i] == null) {
                keys[i] = key;
                values[i] = value;
                currentSize++;
                return;
            }
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
            i = (i + 1) % maxSize;
        } while (i != probe);

        throw new RuntimeException("HashMap overflow");
    }

    public Long get(Integer key) {
        if (key == null) throw new IllegalArgumentException("Null key");
        int i = hash(key);
        while (keys[i] != null) {
            if (keys[i].equals(key))
                return values[i];
            i = (i + 1) % maxSize;
        }
        return null;
    }

    public boolean contains(Integer key) {
        return get(key) != null;
    }

    private int hash(Integer key) {
        return Math.abs(key.hashCode() % maxSize);
    }

}
