public class DoubleColonMethodReference {
    public static void main(String[] args){
        MyFunInterfaceNew funInter = () -> System.out.println("I am Lambda");
        funInter.method1();
    }

    public static void method2(){
        System.out.println("I am not a Lambda");
    }

    public void method3(){
        System.out.println("I am not a Lambda1");
    }
}

interface MyFunInterfaceNew {
    public void method1();
}

class NewCallerClass {
    public static void main(String[] args){
        MyFunInterfaceNew i = DoubleColonMethodReference::method2;
        i.method1();
        //I am not a Lambda

        DoubleColonMethodReference obj = new DoubleColonMethodReference();
        MyFunInterfaceNew i1 = obj::method3;
        i1.method1();
        //I am not a Lambda1
    }
}