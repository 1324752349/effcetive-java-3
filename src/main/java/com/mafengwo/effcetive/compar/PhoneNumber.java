package com.mafengwo.effcetive.compar;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

/**
 * @author chenminrui
 * @date 2020-05-18 11:26 上午
 */
@Data
@AllArgsConstructor
public class PhoneNumber implements Comparable<PhoneNumber> {
    int prefix;
    int addr;
    int last;

    /**
     *    compare a PhoneNumber order: prefix - addr - last ;
     */
    private static  final Comparator<PhoneNumber> CONPARTO = Comparator.comparingInt((PhoneNumber pn)-> pn.prefix)
            .thenComparingInt(pn -> pn.addr ).thenComparingInt(pn -> pn.last);

    @Override
    public int compareTo(PhoneNumber o) {
        return CONPARTO.compare(this,o);
    }
}
