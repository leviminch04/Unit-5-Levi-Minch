public class Die {
    private int max;
    private int value;
    private Lock lock = new Lock();

    public Die(int max, int key)
    {
        lock.setKey(key);
        this.max = max;
    }

    public void lock(int key)
    {
        lock.lock(key);
    }

    public void unlock(int key)
    {
        lock.lock(key);
    }

    public void roll()
    {
        if(lock.locked() == false)
        {
            value = (int) (Math.random()*max + 1);
        }
    }

    public int getValue() {
        if(!lock.locked())
            return value;
        else
            return 0;
    }
}
