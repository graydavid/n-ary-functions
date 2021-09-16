/*
 * Copyright 2021 David Gray
 * 
 * SPDX-License-Identifier: Apache-2.0
 */

package io.github.graydavid.naryfunctions;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * 
 * Represents a function that accepts n arguments and produces a result. This is the n-arity
 * specialization/generalization of {@link Function}.
 * 
 * @param <T> the type of the arguments to the function
 * @param <R> the type of the result of the function
 * 
 * @apiNote The arguments list is typed (rather than a List<Object> or List<?>) in case all arguments are desired to be
 *          or should happen to be of the same type. If that's not the case, T can be bound to Object or ? as
 *          appropriate.
 */
@FunctionalInterface
public interface NAryFunction<T, R> {
    R apply(List<T> arguments);

    /**
     * Returns a composed function that first applies this function to its input, and then applies the {@code after}
     * function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the
     * composed function.
     * 
     * @param <S> the type of output of the {@code after} function, and of the composed function
     * @return a composed function that first applies this function and then applies the {@code after} function
     */
    default <S> NAryFunction<T, S> andThen(Function<? super R, ? extends S> after) {
        Objects.requireNonNull(after);
        return list -> after.apply(apply(list));
    }
}
