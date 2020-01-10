public class SloganTester {
    public static void main(String[] args) {
        Slogan slogan1 = new Slogan("test1");
        System.out.println(Slogan.getCount());
        Slogan slogan2 = new Slogan("test2");
        System.out.println(Slogan.getCount());
        Slogan slogan3 = new Slogan("test3");
        System.out.println(slogan1.toString());
        System.out.println(Slogan.getCount());
    }
}
