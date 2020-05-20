package com.mafengwo.effcetive.fanxing;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author chenminrui
 * @date 2020-05-19 2:48 下午
 */
public class Random {
    public static void main(String[] args) {
        //get random Integer
        ThreadLocalRandom current = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            System.out.println(current.nextInt(5));
        }
    }
}
