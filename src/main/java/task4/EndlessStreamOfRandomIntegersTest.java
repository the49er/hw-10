package task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EndlessStreamOfRandomIntegersTest {
    public static void main(String[] args) {
        // values for test:
        double a = 25214903917d;
        double m = Math.pow(2, 48);
        int c = 11;

        long seed = 10;

        EndlessStreamOfRandomIntegers est =
                new EndlessStreamOfRandomIntegers(a, m, c);


        Stream<Long> stream =
                Stream.iterate(seed, n -> est.random(n).next());

        stream
                .limit(25)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
