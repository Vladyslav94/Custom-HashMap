import java.lang.Integer;

public class HashMapImplementation<K, V> {
    private static final int DEFAULT_CAPACITY = 16;

    private int[] keys;
    private long[] values;

    int currentSize;
    int maxSize;

    public HashMapImplementation(int capacity) {
        currentSize = 0;
        maxSize = capacity;
        keys = new int[maxSize];
        values = new long[maxSize];
    }

    public HashMapImplementation() {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return currentSize;
    }

    public void put(int key, long value) {
        if (key == 0) {
            System.out.println("Key can`t be zero");
            return;
        }
        int probe = hash(key);
        int i = probe;
        do {
            if (keys[i] == 0) {
                keys[i] = key;
                values[i] = value;
                currentSize++;
                return;
            }
            if (keys[i] == (key)) {
                values[i] = value;
                return;
            }
            i = (i + 1) % maxSize;
        } while (i != probe);

    }

    public long get(int key) {
        int i = hash(key);
        while (keys[i] != 0) {
            if (keys[i] == (key))
                return values[i];
            i = (i + 1) % maxSize;
        }
        return 0;
    }

    public boolean contains(Integer key) {
        return get(key) != 0;
    }

    private int hash(int key) {
        return Math.abs(key % maxSize);
    }

}
