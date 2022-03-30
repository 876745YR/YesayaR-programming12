class X{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}
class Y extends X{

    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }

}
class Z extends Y{

    void calculate(int a, int b)
    {
        System.out.println("Class Z");

    }
}
public class MainClass{
    public static void main(String[] args) {
        X x = new Y();
        x.calculate(10,20);
        Y y = (Y) x;
        y.calculate(50, 100);
        Z a = new Z();
        Z z = (Z) y;
        z.calculate(100, 200);
        a.calculate(1,2);
    }
}