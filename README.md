# N-Ary-Functions

N-Ary-Functions is a simple java library that extends java-function definitions to three arguments and more.

Java already has definitions for 0-, 1-, and 2-argument functions in the Supplier, Function, and BiFunction interfaces. N-Ary provides 3-, 4-, 5-, etc.-argument and function definitions, including generic, n-argument functions. (Currently, N-Ary-Functions does not have support for consumers (like Java's 0- and 1-argument consumer interfaces Consumer and BiConsumer), which can be viewed as functions that return nothing, but that's more due to a lack of necessity rather than a deliberate exclusion.)

## Adding this project to your build

This project follows [semantic versioning](https://semver.org/). It's currently available via the Maven snapshot repository only as version 0.0.1-SNAPSHOT. The "0.0.1" part is because it's still in development, waiting for feedback or sufficient usage until its first official release. The "SNAPSHOT" part is because no one has requested a stable, non-SNAPSHOT development version. If you need a non-SNAPSHOT development version, feel free to reach out, and I can build this project into the Maven central repository.

## Usage

This project requires JDK version 11 or higher.

Below is a simple example of how to use one of the definitions. The general pattern for interface names is `[ArgumentCount]AryFunction`, where `[ArgumentCount]` is `Three`, `Four`, `Five`, etc. for the number of arguments to the function. (This naming pattern deliberately avoids the Latin-based arity names like `Ternary`, `Quaternary`, `Quinary`, etc.. My feeling is that the Latin-based names are esoteric to even native English speakers, which reduces their usability; just using the standard number names is much friendlier.)

```java
ThreeAryFunction<Double, Integer, Boolean, String> function = (d, i, b) -> d.toString() + i + b;
String result = function.apply(5.0, 3, false);
System.out.println(result); // Prints "5.03false"
```

## Contributions

Contributions are welcome! See the [graydavid-parent](https://github.com/graydavid/graydavid-parent) project for details.