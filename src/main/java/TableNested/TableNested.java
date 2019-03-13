package TableNested;


import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList();
    }

    public V get(K key) {
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean containsKey = false;
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                containsKey = true;
                entry.setValue(value);
            }
        }
        if (!containsKey) {
            entries.add(new Entry(key, value));
        }
    }

    public void remove(K key) {
        entries.removeIf(entry -> entry.getKey().equals(key));
    }

    public class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}
