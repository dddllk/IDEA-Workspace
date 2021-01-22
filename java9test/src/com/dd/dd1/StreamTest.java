package com.dd.dd1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    //jdk9 中针对Stream新添加了4个方法

    //1.takeWhile()
    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(12,22,33,44,77,66,99,100);

        Stream<Integer> stream = list.stream();

        stream.takeWhile(x -> x < 70).forEach(System.out::println);
        System.out.println();

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().takeWhile(x -> x < 5).forEach(System.out::println);

    }

    //2.dropWhile() 与takeWhile()正好相反
    @Test
    public void test2(){
        List<Integer> list = Arrays.asList(12,22,33,44,77,66,99,100);

        Stream<Integer> stream = list.stream();

        stream.dropWhile(x -> x < 70).forEach(System.out::println);
        System.out.println();

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().dropWhile(x -> x < 5).forEach(System.out::println);
    }

    //ofNullable();
    @Test
    public void test3() {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, null);
        stream1.forEach(System.out::println);

        System.out.println();

        Stream<Object> stream2 = Stream.of(null);

        stream2.forEach(System.out::println);

        //jdk 9 :新增的方法
        Stream<String> stream3 = Stream.ofNullable("tom");
        System.out.println(stream3.count());

        Stream<String> stream4 = Stream.ofNullable(null);
        System.out.println(stream4.count());


    }
        //4.iterator()重载的方法
        @Test
        public void test4(){
            //复习：Stream的实例化 ①通过集合的stream() ②通过数组工具类：Arrays
            //      ③Stream中的静态方法；
            //      ④iterate()
            Stream.iterate(0,x -> x + 1).forEach(System.out::println);

            System.out.println();

            Stream.iterate(0,x -> x < 10,x -> x + 1).forEach(System.out::println );
    }
    }
