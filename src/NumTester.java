public class NumTester
{
    public static void main(String[] args)
    {
        Num num = new Num(1, 1);
        System.out.println(num.toString());
        System.out.println(num.isEqual());
        num.setNum2(2);
        System.out.println(num.toString());
        System.out.println(num.isEqual());
    }
}
