public class LockDie
{
    public static void main(String[] args) {
        Die die = new Die(6, 1234);
        die.roll();
        System.out.println(die.getValue());
        die.lock(1234);
        die.roll();
        System.out.println(die.getValue());

    }
}
