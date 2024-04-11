public class LambdaExample2 {
    public static void main(String[] args){
//        MyFunInterface2 i = new MyFunInterface2Impl();
//        int a = i.findLength("sahil");
//        System.out.println(a); // 5

        MyFunInterface2 i = String::length;
        System.out.println(i.findLength("Sahils"));
    }
}

interface MyFunInterface2 {
    public int findLength(String s);
}

class MyFunInterface2Impl implements MyFunInterface2{
    @Override
    public int findLength(String s) {
        return s.length();
    }
}