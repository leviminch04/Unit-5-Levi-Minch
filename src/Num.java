public class Num
{
    private int num;
    public Num(int num)
    {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String toString()
    {
        return "" + num;
    }

    public boolean isEqual(Num n1)
    {
        return num == n1.getNum();
    }

}
