package com.dd.dd1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

    //Optional类提供了转换为Stream的方法，stream()
    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        list.add("dd");
        list.add("ll");
        list.add("00");

        Optional<List<String>> optional = Optional.ofNullable(list);

        Stream<String> stream = optional.stream().flatMap(x -> x.stream());
        System.out.println(stream.count());
        stream.forEach(System.out::println);
        
    }
}
