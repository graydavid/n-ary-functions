package io.github.graydavid.naryfunctions;

import java.util.function.Function;

public class SixAryFunctionTest
        extends FunctionTestBase<SixAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer>> {
    @Override
    protected SixAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c, d, e, f) -> a + b + c + d + e + f;
    }

    @Override
    protected SixAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunctionAndThen(
            SixAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(
            SixAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3, 4, 5, 6);
    }
}
