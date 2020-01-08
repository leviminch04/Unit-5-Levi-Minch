public class Num
{
    int num1;
    int num2;
    public Num(int num, int numm)
    {
        num1 = num;
        num2 = numm;
    }

    public int getNum1()
    {
        return num1;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum1(int num)
    {
        this.num1 = num;
    }

    public boolean isEqual()
    {
        return num1 == num2;
    }

    public String toString()
    {
        String result = "num 1: " + num1;
        result += "\nnum 2: " + num2;
        return result;
    }

}
