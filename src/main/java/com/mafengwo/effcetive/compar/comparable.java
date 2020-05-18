package com.mafengwo.effcetive.compar;

import java.util.Comparator;

/**
 * @author chenminrui
 * @date 2020-05-18 10:40 上午
 */
public class comparable {


    public static void main(String[] args) {
        PhoneNumber pp = new PhoneNumber(187,027,07503);
        PhoneNumber po = new PhoneNumber(186,027,07504);
        System.out.println(pp.compareTo(po));
    }
}
