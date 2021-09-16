package io.github.graydavid.naryfunctions;

import java.util.function.Function;

public class SevenAryFunctionTest extends
        FunctionTestBase<SevenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer>> {
    @Override
    protected SevenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c, d, e, f, g) -> a + b + c + d + e + f + g;
    }

    @Override
    protected SevenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunctionAndThen(
            SevenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(
            SevenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3, 4, 5, 6, 7);
    }
}
