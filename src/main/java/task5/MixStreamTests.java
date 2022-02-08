package task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MixStreamTests<T> {
    public static void main(String[] args) {

        Stream<String> first = Stream.of("a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8");
        Stream<String> second = Stream.of("b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8", "b9", "b10");

        System.out.println(zip(first, second).collect(Collectors.toList()));

    }

    public static <T> Stream<T> zip(Stream<T> streamFirst, Stream<T> streamSecond) {
        float time = System.currentTimeMillis();
        //List<T> streamFirstItems = streamFirst.collect(Collectors.toList());
        //List<T> streamSecondItems = streamSecond.collect(Collectors.toList());
        //int min = Math.min(streamFirstItems.size(), streamSecondItems.size());
        Iterator <T> streamFirstIterator = streamFirst.iterator();
        Iterator <T> streamSecondIterator = streamSecond.iterator();
//
        List<T> result = new ArrayList<T>();
        //for (int i = 0; i < min; i++) {
        while (streamFirstIterator.hasNext() && streamSecondIterator.hasNext()){
            result.add(streamFirstIterator.next());
            result.add(streamSecondIterator.next());
        }
        System.out.println((System.currentTimeMillis() - time) / 1000);
        return result.stream();
    }
}
