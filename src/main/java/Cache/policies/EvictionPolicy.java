package Cache.policies;

public interface EvictionPolicy<Key>
{
    /**
     * Method to update recently used key
     * @param key
     */
    void keyAccess(Key key);

    /**
     * Method to remove least recently used key
     * @param key
     * @return
     */
    Key evictKey(Key key);
}
