package Cache;

import Cache.storage.HashMapBasedStorage;
import Cache.storage.Storage;

public class Cache<Key, Value>
{
    Storage<Key, Value> storage;

    Cache(int capacity)
    {
        storage = new HashMapBasedStorage<>(capacity);
    }

    void put(Key key, Value value)
    {
        storage.add(key, value);
    }

    Value get(Key key)
    {
        return storage.get(key);
    }
}
