package com.mafengwo.effcetive.lambda;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author chenminrui
 * @date 2020-05-21 11:38 上午
 */
public class Merge {

    /**
     * 字段排序
     * 避免使用Stream来处理chars
     * 因为这样他会打出int数值
     */
    static String alphe(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        //输出是一串数字
        s.chars().forEach(System.out::println);
        return  new String(chars);
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = Maps.newHashMap();
        /**
         * merge表示一个key如果存在 就自增 ，如何不存在就设置为1
         * since 1.8
         */
        map.merge("key",1, Integer::sum);
        map.merge("key",1, Integer::sum);
        System.out.println(map);

        String chenminrui = alphe("chenminrui");
        System.out.println(chenminrui);
    }
}
