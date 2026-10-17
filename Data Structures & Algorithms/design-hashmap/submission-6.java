class MyHashMap {
    int[] arr = new int[1000001];
    boolean[] present = new boolean[1000001];

    public MyHashMap() {

    }

    public void put(int key, int value) {
        arr[key] = value;
        present[key] = true;
    }

    public int get(int key) {
        if (!present[key]) {
            return -1;
        }
        return arr[key];
    }

    public void remove(int key) {
        present[key] = false;
    }
}