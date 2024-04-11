public class LambdaIntroduction {
    public static void main(String[] args){
        //CallFunctionalInterface funInter = new CallFunctionalInterface();
        //funInter.funMethod();

        MyFunctionalInterface funInterLambda = () -> System.out.println("Functional Method");
        funInterLambda.funMethod();

    }
}

interface MyFunctionalInterface {
    public void funMethod();
}

/*
class CallFunctionalInterface implements MyFunctionalInterface {
    @Override
    public void funMethod() {
        System.out.println("Funtional Method");
    }
}
 */
