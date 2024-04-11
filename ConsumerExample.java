import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        Consumer<String> c = System.out::println;
        c.accept("Consumer");
    }
}
