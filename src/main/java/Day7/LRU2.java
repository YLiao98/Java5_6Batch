package Day7;

import java.util.LinkedHashMap;

// implement LRU using LinkedHashMap
public class LRU2 {
    private final int capacity;
    LinkedHashMap<Integer,Integer> cache;
    public LRU2(int capacity){
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity);

    }
    public int get(int key){
        int res = -1;
        if(cache.containsKey(key)){
            int val = cache.get(key);
            cache.remove(key);
            cache.put(key, val);
            res = val;
        }
        return res;
    }
    public void put(int key, int value){
        if(cache.containsKey(key)){
            cache.remove(key);

        }else{
            if(cache.size() == this.capacity){
                cache.remove(cache.entrySet().iterator().next().getKey());
            }

        }
        cache.put(key, value);
    }
    public static void main(String[] args) {
        LRU2 lru = new LRU2(2);
        lru.put(1,1);
        lru.put(2,2);
        int first = lru.get(1); //should return 1
        System.out.println(first);
        lru.put(3,3); //lru key was 2, evicts key 2
        int second = lru.get(2);
        System.out.println(second); // should return -1
        lru.put(4,4);
        int third = lru.get(1);
        System.out.println(third); // return -1
        int fourth = lru.get(3);
        System.out.println(fourth); //return 3
        int fifth = lru.get(4);
        System.out.println(fifth); // return 4
    }
}
