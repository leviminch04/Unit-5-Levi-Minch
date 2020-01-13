public class Lock implements Lockable
{
    private int key;
    private boolean locked = false;
    public Lock(){}
    public void setKey(int key)
    {
        this.key = key;
    }

    public void lock(int key)
    {
        if(this.key == key)
            locked = true;
    }

    public void unlock(int key)
    {
        if(this.key == key)
            locked = false;
    }

    public boolean locked()
    {
        return locked;
    }
}

