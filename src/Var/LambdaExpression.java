package src.Var;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExpression {
    public static void main(String[] args) {
        Function<Integer,Integer> f = (var num) -> 1;

//        var f1 = (var num) -> 1;

        BiFunction<Integer,Integer,String> f2 = (@Notnull var a,var b) -> "Hello";
    }
}