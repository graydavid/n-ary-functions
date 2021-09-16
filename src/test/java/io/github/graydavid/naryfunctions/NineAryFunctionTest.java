package io.github.graydavid.naryfunctions;

import java.util.function.Function;

public class NineAryFunctionTest extends
        FunctionTestBase<NineAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer>> {
    @Override
    protected NineAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c, d, e, f, g, h, i) -> a + b + c + d + e + f + g + h + i;
    }

    @Override
    protected NineAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunctionAndThen(
            NineAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(
            NineAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
