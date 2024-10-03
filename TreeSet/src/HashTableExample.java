public class HashTableExample {
    public static void main(String[] args) {
        int N = 11;
        int[] keys = new int[N];
        int[] values = new int[N];
        // Store key-value pairs in the hash table
        put(keys, values, 1, 20);
        put(keys, values, 2, 70);
        put(keys, values, 42, 80);
        put(keys, values, 4, 25);
        put(keys, values, 12, 44);
        put(keys, values, 14, 32);
        put(keys, values, 17, 11);
        put(keys, values, 13, 78);
        put(keys, values, 37, 98);

        for (int i = 0; i < N; i++) {
            if (keys[i] != 0) {
                int hash = hash(keys[i], N);
                System.out.println("Key: " + keys[i] + " Value: " + values[i] + " Hash: " + hash + " Array Index: " + i);
            }
        }
    }
    public static int hash(int key, int N) {
        return key % N;
    }

    public static void put(int[] keys, int[] values, int key, int value) {
        int index = hash(key, keys.length);
        keys[index] = key;
        values[index] = value;
    }
}
