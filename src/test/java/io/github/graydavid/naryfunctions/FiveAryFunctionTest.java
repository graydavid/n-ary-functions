package io.github.graydavid.naryfunctions;

import java.util.function.Function;

public class FiveAryFunctionTest
        extends FunctionTestBase<FiveAryFunction<Integer, Integer, Integer, Integer, Integer, Integer>> {
    @Override
    protected FiveAryFunction<Integer, Integer, Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c, d, e) -> a + b + c + d + e;
    }

    @Override
    protected FiveAryFunction<Integer, Integer, Integer, Integer, Integer, Integer> naryFunctionAndThen(
            FiveAryFunction<Integer, Integer, Integer, Integer, Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(
            FiveAryFunction<Integer, Integer, Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3, 4, 5);
    }
}
