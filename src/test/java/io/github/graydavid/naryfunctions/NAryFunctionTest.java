package io.github.graydavid.naryfunctions;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NAryFunctionTest extends FunctionTestBase<NAryFunction<Integer, Integer>> {
    @Override
    protected NAryFunction<Integer, Integer> sumNaryFunction() {
        return t -> t.stream().collect(Collectors.summingInt(i -> i));
    }

    @Override
    protected NAryFunction<Integer, Integer> naryFunctionAndThen(NAryFunction<Integer, Integer> naryFunction,
            Function<Integer, Integer> after) {
        return naryFunction.andThen(after);
    }

    @Override
    protected Integer applyToFirstNNaturalNumbers(NAryFunction<Integer, Integer> naryFunction) {
        return naryFunction.apply(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
    }

    @Override
    protected int arity() {
        return 14;
    }
}
