class Node {
    int key;
    int value;
    Node prev = null;
    Node next = null;

    Node (int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    int capacity;
    Map<Integer, Node> cache;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);

    public LRUCache(int capacity) {
        this.cache = new HashMap<>(capacity);
        this.capacity = capacity;
        head.next = tail;
        tail.next = head;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            add(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
        }

        if (capacity == cache.size()) {
            remove(tail.prev);
        }

        add(new Node(key, value));
    }

    private void add(Node node) {
        cache.put(node.key, node);
        Node tail = head.next;
        node.next = tail;
        tail.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void remove(Node node) {
        cache.remove(node.key);
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
