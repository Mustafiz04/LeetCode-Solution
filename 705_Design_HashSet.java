class MyHashSet {

    HashSet<Integer> hs = new HashSet<>();
    
    public void add(int key) {
        hs.add(key);
    }
    
    public void remove(int key) {
        hs.remove(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hs.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */