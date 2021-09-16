package io.github.graydavid.naryfunctions;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class ThreeAryFunctionTest extends FunctionTestBase<ThreeAryFunction<Integer, Integer, Integer, Integer>> {
    @Override
    protected ThreeAryFunction<Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c) -> a + b + c;
    }

    @Override
    protected ThreeAryFunction<Integer, Integer, Integer, Integer> naryFunctionAndThen(
            ThreeAryFunction<Integer, Integer, Integer, Integer> naryFunction, Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(ThreeAryFunction<Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3);
    }

    @Test
    public void asdf() {
        ThreeAryFunction<Double, Integer, Boolean, String> function = (d, i, b) -> d.toString() + i + b;
        String result = function.apply(5.0, 3, false);
        System.out.println(result);
    }
}
