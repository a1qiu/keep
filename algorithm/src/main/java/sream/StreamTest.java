package sream;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingInt;

/**
 * @author mawei
 * @date 4/28/21
 */
public class StreamTest {
    @Test
    public void test() {
        // predicate.test 方法
        Predicate<Integer> predicate = x -> x > 185;
        Student student = new Student("9龙", 23, 175);
        System.out.println(predicate.test(student.getTail()));

        //consume 输出一个值
        Consumer<String> consumer = System.out::println;
        consumer.accept("just test stream");

        Supplier<Integer> supplier = () -> Integer.valueOf(BigDecimal.TEN.toString());
        System.out.println(supplier.get());

        //一元操作
        UnaryOperator<Integer> operator = t -> t * 2;
        System.out.println(operator.apply(8));

        //二元操作
        BinaryOperator<Integer> operator1 = (x, y) -> x * y;
        System.out.println(operator1.apply(5, 6));
    }

    @Test
    public void testList() {
        //惰性求值
        List<Student> studentList = Stream.of(new Student("hah", 1, 1)
                , new Student("hah", 2, 2)
                , new Student("heihei", 3, 3)).collect(Collectors.toList());

        //filter 内部是 predicate
        //  System.out.println(studentList.stream().filter(stu -> stu.getAge() > 2).collect(Collectors.toList()));

        //map 转换功能 内部是function
        List<String> nameList = studentList.stream().map(Student::getName).collect(Collectors.toList());
        String name = nameList.stream().collect(Collectors.joining(","));
        Map<String, List<Student>> stuMap = studentList.stream().collect(Collectors.groupingBy(Student::getName));

        //flatMap 将多个stream 合并成一个  交集 并集  差集  合并多个  stream contains
        List<String> strs = Arrays.asList("好,好,学", "习,天,天", "向,上");
        //  System.out.println(strs.stream().map(str -> str.split(",")).flatMap(Arrays::stream).collect(Collectors.toList()));

        //Optional<Student> stu = studentList.stream().max(Comparator.comparing(student -> student.getAge()));
        Optional<Student> stu = studentList.stream().max(Comparator.comparing(Student::getAge));
        System.out.println(stu);

        //根据拦截器获取个数
        long ageCount = studentList.stream().filter(student -> student.getAge() < 6).count();
        // System.out.println(ageCount);

        //reduce 递归操作 可以实现从一组值从生成一个值
        Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, (acc, x) -> acc + x);
        System.out.println("我是递归操作的最后值" + reduce);

    }

    @Test
    public void testHight() {
        //high 抽象方法
        List<Student> studentList = Stream.of(new Student("hha", 1, 1), new Student("heh", 2, 2)).collect(Collectors.toList());
        System.out.println(averageAge(studentList));

        //high 转换成块

    }

    //获取集合某属性的平均值
    private static double averageAge(List<Student> students) {
        return students.stream().collect(averagingInt(Student::getAge));
    }

    @Test
    public void testMaxBy() {
        //求集合中的最大值maxBy    minBy
        Stream<Integer> stream = Stream.of(2, 6, 9, 13, 13);
        Optional<Integer> op = stream.collect(Collectors.maxBy(Integer::compareTo));
        if (op.isPresent()) {
            System.out.println(op.get());
        }
    }

    @Test
    public void testDeb() {
        Object[] objects = Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter(i -> i % 2 == 0).filter(i -> i > 3).toArray();
        System.out.println(Arrays.toString(objects));
    }

    @Test
    public void sub() {
        //将复杂的表达式结果放进一个临时变量，来表达用途
        String platform = "", browser = "";
        if (platform.toUpperCase().indexOf("MAC") > -1 && browser.toUpperCase().indexOf("IE") > -1) {
            return;
        }
        //just sub
        boolean isMacOs = platform.toUpperCase().indexOf("MAC") > 1;
        boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > 1;
        if (isMacOs && isIEBrowser) {
            return;
        }
    }

@Test
    public void t(){
  if(  BigDecimal.valueOf(0).compareTo( BigDecimal.valueOf(0.00)) == 0){
      System.out.println("111");
  }
}
}

