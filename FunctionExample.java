import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args){
        String s = "BasicsStrong";
        int len = calculateLength(s);
        System.out.println(len);

        Function<String,Integer> fun = String::length;
        int len1 = fun.apply(s);
        System.out.println(len1);
    }

    private static int calculateLength(String s) {
        return s.length();
    }
}
