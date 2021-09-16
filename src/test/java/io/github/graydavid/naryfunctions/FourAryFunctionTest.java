package io.github.graydavid.naryfunctions;

import java.util.function.Function;

public class FourAryFunctionTest
        extends FunctionTestBase<FourAryFunction<Integer, Integer, Integer, Integer, Integer>> {
    @Override
    protected FourAryFunction<Integer, Integer, Integer, Integer, Integer> sumNaryFunction() {
        return (a, b, c, d) -> a + b + c + d;
    }

    @Override
    protected FourAryFunction<Integer, Integer, Integer, Integer, Integer> naryFunctionAndThen(
            FourAryFunction<Integer, Integer, Integer, Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(
            FourAryFunction<Integer, Integer, Integer, Integer, Integer> naryFunction) {
        return naryFunction.apply(1, 2, 3, 4);
    }
}
