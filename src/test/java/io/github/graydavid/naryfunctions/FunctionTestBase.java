package io.github.graydavid.naryfunctions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.ParameterizedType;
import java.util.function.Function;

import org.junit.jupiter.api.Test;


/**
 * A helper class for testing n-ary functions.
 * 
 * @param <T> the type of the n-ary function under test.
 */
public abstract class FunctionTestBase<T> {
    private final Function<Integer, Integer> times2 = a -> 2 * a;

    /** Returns an an n-ary function that sums its arguments. */
    protected abstract T sumNaryFunction();

    /** Applies the n-ary function andThen the after function. */
    protected abstract T naryFunctionAndThen(T naryFunction, Function<Integer, Integer> after);

    /** Applies the first n integers to the naryFunction. */
    protected abstract Integer applyToFirstNNaturalNumbers(T naryFunction);

    /**
     * Returns the arity of the function under test (e.g. 2 for BiFunction). Defaults to inspecting the class's generic
     * parameters. Relevant only for the {@link #applyToFirstNNaturalNumbers(Object)} set of inputs.
     */
    protected int arity() {
        ParameterizedType functionTestBaseType = (ParameterizedType) getClass().getGenericSuperclass();
        ParameterizedType naryFunctionType = (ParameterizedType) functionTestBaseType.getActualTypeArguments()[0];
        return naryFunctionType.getActualTypeArguments().length - 1;
    }

    @Test
    public void andThenThrowsExceptionGivenNullAfter() {
        assertThrows(NullPointerException.class, () -> naryFunctionAndThen(sumNaryFunction(), null));
    }

    @Test
    public void andThenAppliesAfterFunctionAfterMainFunction() {
        T sumTimes2 = naryFunctionAndThen(sumNaryFunction(), times2);

        Integer result = applyToFirstNNaturalNumbers(sumTimes2);

        assertThat(result, is(sumOfFirstNNaturalNumbers() * 2));
    }

    private int sumOfFirstNNaturalNumbers() {
        return (arity() + 1) * arity() / 2;
    }
}
