//package Cache.DoublyLinkedList;
//
//public class DoublyLinkedList<T>
//{
//
//
//    public DoublyLinkedList()
//    {
//
//    }
//
//    public void addLast(Node<T> tail, Node<T> node)
//    {
//        Node<T> prev = tail.prev;
//        node.prev = prev;
//        node.next = tail;
//        prev.next = node;
//        tail.prev = node;
//    }
//
//    public void remove(Node<T> node)
//    {
//        Node<T> prev = node.prev;
//        Node<T> next = node.next;
//        prev.next = node.next;
//        next.prev = node.prev;
//    }
//}
