package Cache.storage;

import Cache.DoublyLinkedList.Node;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value>
{
    Map<Key, Node<Key, Value>> map;
    private final int capacity;
    Node<Key, Value> head;
    Node<Key, Value> tail;

    public HashMapBasedStorage(int capacity)
    {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node<>(null, null);
        tail = new Node<>(null, null);

        head.next = tail;
        tail.prev = head;
    }

    public void addNode(Node<Key, Value> node)
    {
        Node<Key, Value> prev = tail.prev;
        node.prev = prev;
        node.next = tail;
        prev.next = node;
        tail.prev = node;
    }
    public void removeNode(Node<Key, Value> node)
    {
        Node<Key, Value> prev = node.prev;
        Node<Key, Value> next = node.next;
        prev.next = node.next;
        next.prev = node.prev;
    }

    public Value get(Key key)
    {
        if(!map.containsKey(key))
            return null;
        Node<Key, Value> node = map.get(key);
        removeNode(node);
        addNode(node);
        return node.value;
    }

    public void add(Key key, Value value)
    {
        if(map.containsKey(key))
        {
            Node<Key, Value> node = map.get(key);
            removeNode(node);
            addNode(node);
        }
        else
        {
            Node<Key, Value> node = new Node<>(key, value);
            if (isStorageFull())
            {
                map.remove(head.next.key);
                removeNode(head.next);
            }
            addNode(node);
            map.put(key, node);
        }
    }

    public void remove(Key key)
    {
        Node<Key, Value> node = map.get(key);
        map.remove(key);
        removeNode(node);
    }

    private boolean isStorageFull()
    {
        return map.size() == capacity;
    }
}
