
public class Num implements Comparable
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

    public int compareTo(Object other)
    {
        Num otherNum = (Num) other;
        return this.getNum() - otherNum.getNum();
    }

}
