package com.dd.dd;

import org.junit.Test;

import java.util.HashSet;

public class DiamondTest {
    @Test
    public void testdiamondOperator(){
        diamondOperator();
    }
    public void diamondOperator(){
        HashSet set = new HashSet<>(){};
        set.add("MM");
        set.add("dd");
        set.add("ll");
        set.add("kk");
        for(Object s : set){
            System.out.println(s);
        }
    }
}
