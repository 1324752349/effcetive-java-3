package com.mafengwo.effcetive.enumT;

import java.util.Arrays;

/**
 * @author chenminrui
 * @date 2020-05-20 2:41 下午
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Apple.values()));
        System.out.println(Apple.MIDDLE.toString());
        System.out.println(Apple.LARGE.getClass());
        System.out.println(Apple.LARGE.compareTo(Apple.MIDDLE));

        for(Operation p : Operation.values()){
            double v = p.baseApply(2, 4);
            System.out.println("2"+p+"4"+"="+v);
        }
        Operation operation = Operation.stringToEnum("*");
        System.out.println(operation);
    }
}
