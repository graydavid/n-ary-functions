/*
 * Copyright 2021 David Gray
 * 
 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.graydavid.naryfunctions;

import java.util.Objects;
import java.util.function.Function;

/**
 * Represents a function that accepts ten arguments and produces a result. This is the ten-arity specialization of
 * {@link Function}.
 * 
 * @param <A> the type of the first argument to the function
 * @param <B> the type of the second argument to the function
 * @param <C> the type of the third argument to the function
 * @param <D> the type of the fourth argument to the function
 * @param <E> the type of the fifth argument to the function
 * @param <F> the type of the sixth argument to the function
 * @param <G> the type of the seventh argument to the function
 * @param <H> the type of the eighth argument to the function
 * @param <I> the type of the ninth argument to the function
 * @param <J> the type of the tenth argument to the function
 * @param <R> the type of the result of the function
 */
@FunctionalInterface
public interface TenAryFunction<A, B, C, D, E, F, G, H, I, J, R> {

    /** Applies this function to the given arguments. */
    R apply(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j);

    /**
     * Returns a composed function that first applies this function to its input, and then applies the {@code after}
     * function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the
     * composed function.
     * 
     * @param <S> the type of output of the {@code after} function, and of the composed function
     * @return a composed function that first applies this function and then applies the {@code after} function
     */
    default <S> TenAryFunction<A, B, C, D, E, F, G, H, I, J, S> andThen(Function<? super R, ? extends S> after) {
        Objects.requireNonNull(after);
        return (a, b, c, d, e, f, g, h, i, j) -> after.apply(apply(a, b, c, d, e, f, g, h, i, j));
    }
}
