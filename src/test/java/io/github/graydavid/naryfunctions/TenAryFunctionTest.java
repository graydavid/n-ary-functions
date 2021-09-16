package io.github.graydavid.naryfunctions;

import java.util.function.Function;

public class TenAryFunctionTest extends
        FunctionTestBase<TenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer>> {
    @Override
    protected TenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c, d, e, f, g, h, i, j) -> a + b + c + d + e + f + g + h + i + j;
    }

    @Override
    protected TenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunctionAndThen(
            TenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(
            TenAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
