package Cache.storage;

/**
 * Interface to show blueprint of cache store
 * @param <Key>
 * @param <Value>
 */
public interface Storage<Key, Value>
{
    void add(Key key, Value value);
    void remove(Key key);
    Value get(Key key);
}
