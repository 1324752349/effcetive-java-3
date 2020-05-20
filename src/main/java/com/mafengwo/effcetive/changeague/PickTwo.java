package com.mafengwo.effcetive.changeague;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author chenminrui
 * @date 2020-05-20 11:41 上午
 * <p>
 *     has error
 * </p>
 */
public class PickTwo {

    @SafeVarargs
    static <T> String[] toArray(T ... args){
        return (String[]) args;
    }

    static <T> String[] pickTwo(T a, T b, T c) throws Exception {
        switch (ThreadLocalRandom.current().nextInt(3)){
            case 0: return toArray(a,b);
            case 1: return toArray(a,c);
            case 2: return toArray(b,c);
        }
        throw new Exception("until here");
    }

    public static void main(String[] args) throws Exception {
       String[]  array= pickTwo("chen","min","rui");
       System.out.println(Arrays.toString(array));
    }
}
