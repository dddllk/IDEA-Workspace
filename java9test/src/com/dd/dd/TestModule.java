package com.dd.dd;

import com.dd.bean.Person;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;


class TestModule {
    private static final Logger LOGGER = Logger.getLogger("dd");
    public static void main(String[] args) {
        Person p = new Person("tim",11);
        System.out.println(p);
    //    User u = new User();
          LOGGER.info("aaa");
    }
    @Test
    public void test1(){
        try {
            URL url = new URL("http://www.baidu.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
