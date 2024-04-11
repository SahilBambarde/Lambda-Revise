public class LambdaExample {
    public static void main(String[] args){
//        funInterfaceExample i =new funInterfaceExampleImpl();
//        i.funMethod();

        funInterfaceExample i =() -> System.out.println("Function without any argument and return type");
    }
}

interface funInterfaceExample{
    public void funMethod();
}

class funInterfaceExampleImpl implements funInterfaceExample{

    @Override
    public void funMethod() {
        System.out.println("Function without any argument and return type");
    }
}
