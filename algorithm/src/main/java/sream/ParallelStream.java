package sream;

import java.util.Arrays;
import java.util.List;

/**
 * parallelStream背后的男人:ForkJoinPool
 */
public class ParallelStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //乱序
        numbers.parallelStream().forEach(System.out::print);
        //排序
        System.out.println("====line=====");
        numbers.parallelStream().forEachOrdered(System.out::print);
        System.out.println("====line=====");
        Integer[] arr = {1, 2, 3, 4};
        Arrays.stream(arr).forEachOrdered(System.out::print);

    }


}
