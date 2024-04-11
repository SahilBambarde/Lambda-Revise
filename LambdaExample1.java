public class LambdaExample1 {
    public static void main(String[] args){
//        MyFunInterface i = new CallFunInterface();
//        i.funMethodAdd(3,4);

        MyFunInterface funInter = (a,b) -> System.out.println("Sum " + (a+b));
        funInter.funMethodAdd(10,30);

    }
}

interface MyFunInterface{
    public void funMethodAdd(int a,int b);
}

class CallFunInterface implements MyFunInterface{

    @Override
    public void funMethodAdd(int a, int b) {
        System.out.println("Sum " + (a+b));
    }
}