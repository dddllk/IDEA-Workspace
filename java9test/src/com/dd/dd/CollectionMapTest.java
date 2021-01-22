package com.dd.dd;

import org.junit.Test;

import java.util.*;

public class CollectionMapTest {

    //创建一个只读特点的集合
    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        list.add("dd");
        list.add("ll");
        list.add("ee");

        //调用Collections中的方法，将list变为只读的
        final List<String> newList = Collections.unmodifiableList(list);

        // newList.add("gg");  //不能执行，否则报异常
        newList.forEach(System.out::println);//jdk8
    }

    @Test
    public void test2(){
        //jdk8创建
        //list
        List<Object> list = Collections.unmodifiableList(Arrays.asList(1,2,3));
        //set
        Set<Integer> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(3, 2, 1)));
        //set.add(4);
        set.forEach(System.out::println);

        //Map
        Map<Object, Object> map = Collections.unmodifiableMap(new HashMap<>(){
            {
                put("dd",12);
                put("ll",13);
            }
        });
        map.forEach((k,v) ->System.out.println(k + " " + v));
    }
    //jdk9创建只读集合
    @Test
    public void test3(){
        List<Integer> list = List.of(1, 2, 3);
        //list.add(4);
        list.forEach(System.out::println);

        Set<Integer> set = Set.of(3, 3, 3);
        set.add(6);

        //Map:
        //创建只读集合的方式一：
        Map<String, Integer> map = Map.of("Tim", 23, "he", 24, "ll", 55);

        map.put("oo",1);

        //创建只读集合的方式二：
        Map.ofEntries(Map.entry("tom",21),Map.entry("pom",18));

        //map.put("st",12);
    }
}
