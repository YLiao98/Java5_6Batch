package Day7;

import java.util.*;

//implement LRU Cache using LinkedList + HashMap
public class LRUCache {
    private int size;

    class Node{
        Node next;
        Node prev;
        int val;
        int key;
    }
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> map;

    public LRUCache(int size){
        this.size = size;
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>(size);
    }

    public int get(int key){
        int res = -1;

        Node node = map.get(key);
        if(node != null){
            res = node.val;
            remove(node);
            add(node);
        }
        return res;

    }
    public void put(int key, int value){
        Node node = map.get(key);
        if(node != null){
            remove(node);
            node.val = value;
            add(node);
        }else{
            if(map.size() == this.size){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.val = value;
            new_node.key = key;
            map.put(key, new_node);
            add(new_node);
        }
    }

    //add to front
    public void add(Node node){
        Node head_next = head.next;
        node.next = head_next;
        head_next.prev= node;
        head.next = node;
        node.prev = head;
    }
    //remove last node
    public void remove(Node node){
        Node next_node = node.next;
        Node prev_node = node.prev;
        prev_node.next = next_node;
        next_node.prev = prev_node;
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
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
