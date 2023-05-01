package Cache.DoublyLinkedList;


public class Node<Key, Value>
{
    public Key key;
    public Value value;
    public Node<Key, Value> next;
    public Node<Key, Value> prev;

    public Node(Key key, Value value)
    {
        this.key = key;
        this.value = value;
        next = null;
        prev = null;
    }
}
