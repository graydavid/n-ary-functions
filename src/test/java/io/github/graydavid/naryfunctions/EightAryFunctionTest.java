package io.github.graydavid.naryfunctions;

import java.util.function.Function;

public class EightAryFunctionTest extends
        FunctionTestBase<EightAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer>> {
    @Override
    protected EightAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c, d, e, f, g, h) -> a + b + c + d + e + f + g + h;
    }

    @Override
    protected EightAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunctionAndThen(
            EightAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(
            EightAryFunction<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
