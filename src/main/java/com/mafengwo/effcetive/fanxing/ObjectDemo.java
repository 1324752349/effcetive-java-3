package com.mafengwo.effcetive.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenminrui
 * @date 2020-05-19 2:21 下午
 */
public class ObjectDemo {
    public static void main(String[] args) {
        List<Object> c = new ArrayList<>();
        c.add("kkk");
        c.add(123);
        c.forEach(System.out::println);
    }
}
