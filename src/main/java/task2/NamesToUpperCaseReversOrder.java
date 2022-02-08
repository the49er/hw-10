package task2;

import names.NamesGenerator;

import java.util.Comparator;
import java.util.List;

public class NamesToUpperCaseReversOrder {
    public static void main(String[] args) {
        NamesGenerator namesGenerator = new NamesGenerator();

        namesGenerator
                .generator(10)
                .stream()
                .map(s -> s.getName().toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
