import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){
        int salary = 3000;
        boolean result = salaryCheck(salary);
        System.out.println(result); //false

        //salary -> salary>=4000

        Predicate<Integer> p = salary1 -> salary1>=4000;
        boolean result1 = p.test(salary);
        System.out.println(result1);
    }

    private static boolean salaryCheck(int salary) {
        return salary >= 4000;
    }
}
