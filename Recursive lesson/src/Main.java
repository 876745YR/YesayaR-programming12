public class Main {
    public static int multIter(int a, int b){
        int result = 0;
        for(int i=0; i<b;i++){
            result += a;
        }
        return result;
    }
    public static int multRec(int a,int b){
        int result = 0;
        if(b==1)
            return a;

        result = a + multRec(a, b-1);
        return result;
    }
    public static int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static int fibSeq(int n){
        if(n==1)
            return 1;
        else if(n==2)
            return 1;
        else;
    }

    public static void main(String[] args) {
        System.out.println(multIter(8,5));
        System.out.println(multRec(8,5));
        System.out.println(fact(4));
        System.out.println(fibSeq(3));
    }
}
