public class NumTester
{
    public static void main(String[] args)
    {
        Num n1 = new Num(1);
        Num n2 = new Num(1);

        System.out.println(n1.isEqual(n2));
        n2.setNum(2);
        System.out.println(n1.isEqual(n2));
    }
}
