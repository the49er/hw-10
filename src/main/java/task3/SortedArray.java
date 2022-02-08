package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArray {

    public static void main(String[] args) {

        String[] arr = new String[] {"1, 2, 0", "4, 5"};
        //String[] arr = new String[] {"1, 2, 0", "4, 5", "10, 12, 11", "20, 101, 999"};
        StringBuilder sb = new StringBuilder();

        Arrays.stream(arr)
                .map(s -> s.replace("\s", ""))
                .forEachOrdered(s -> sb.append(s +","));


        List<Integer> listOfSortedInteger =
                List.of(sb.substring(0, sb.length() - 1).split(","))
                .stream()
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("listOfSortedInteger = " + listOfSortedInteger);


    }
}
