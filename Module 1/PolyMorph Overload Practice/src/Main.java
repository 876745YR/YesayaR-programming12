public class Main {
 /*   class X { //question 1
        static int method(int i, int d){
            return (int)i + d;
        }
        static int method (int i, double d){
            return (int)(i+d);
        }
        static double method(double i, int d){
            return (int)i+d;
        }
        static double method (double i, double d){
            return (int)i+d;
        }
    }

    public static void main(String[] args) {
        System.out.println(X.method( 1.0, 1.0));
    }
*/
static class X {
    void method(int a){
        System.out.println("ONE");
    }
    void method(double d){
        System.out.println("TWO");
    }

 }
 static class Y extends X {
    @Override
     void method(double d)
    {
        System.out.println("THREE");
    }
 }

 public static void main(String[] args) {

     new Y().method(100);
}

}


