//package Cache.policies;
//
//import Cache.DoublyLinkedList.DoublyLinkedList;
//import Cache.DoublyLinkedList.Node;
//
//import java.util.HashMap;
//
//public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key>
//{
//    private HashMap<Key, Node<Key>> map;
//    DoublyLinkedList<Key> doublyLinkedList;
//
//    LRUEvictionPolicy(DoublyLinkedList<Key> doublyLinkedList)
//    {
//        map = new HashMap<>();
//        this.doublyLinkedList = doublyLinkedList;
//    }
//    @Override
//    public void keyAccess(Key key)
//    {
//        if(map.containsKey(key))
//        {
//            doublyLinkedList.remove(map.get(key));
//            doublyLinkedList.addLast(map.get(key));
//        }
//        else
//        {
//            Node<Key> node = new Node<>(key);
//            doublyLinkedList.addLast(node);
//            map.put(key, node);
//        }
//    }
//
//}
