public class LambdaExample3 {
    public static void main(String[] args){
        MyFunInterface3 i = new MyFunInterface3Impl();
        int a =i.doSomeCalculation(100);
        System.out.println(a);

        MyFunInterface3 e = o-> {
            int x = o+10;
            x=x/2;
            return x;
        };

        int q =e.doSomeCalculation(100);
        System.out.println(q);

    }
}

interface MyFunInterface3 {
    public int doSomeCalculation(int a);
}

class MyFunInterface3Impl implements MyFunInterface3{

    @Override
    public int doSomeCalculation(int a) {
        int x = a+10;
        x=x/2;
        return x;
    }
}
