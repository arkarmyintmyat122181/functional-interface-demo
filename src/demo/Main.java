package demo;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<RuntimeException>
                //obj=() -> new RuntimeException();
                obj = RuntimeException::new;
        Consumer<String> obj1 = s -> System.out.println(s);
        obj1.accept("Hello world.");

        RuntimeException obj2 = getInstance(RuntimeException::new);

        Function<String,Integer> obj3 = s -> s.length();
        System.out.println("Length : " + obj3.apply("Hello"));

        Predicate<Integer> predicate = a-> a>10;
        System.out.println(predicate.test(12));

        UnaryOperator<String> unaryOperator = s-> "Hello!" + s;
        System.out.println(unaryOperator.apply("Honey"));
    }
    public static <T>T getInstance (Supplier<T> t){
        return t.get();
    }
}
