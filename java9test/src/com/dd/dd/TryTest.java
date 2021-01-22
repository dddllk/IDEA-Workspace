package com.dd.dd;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryTest {
    @Test
    public void testTry(){
        InputStreamReader reader = new InputStreamReader(System.in);
        try(reader) {
            //读取数据的过程
            reader.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
