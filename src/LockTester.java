public class LockTester
{
    public static void main(String[] args)
    {
        Lock lock = new Lock();
        lock.setKey(1234);
        System.out.println(lock.locked());
        lock.lock(1234);
        System.out.println(lock.locked());
        lock.unlock(1234);
        System.out.println(lock.locked());
    }
}
