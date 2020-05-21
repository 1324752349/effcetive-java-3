package com.mafengwo.effcetive.lambda;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * @author chenminrui
 * @date 2020-05-21 2:54 下午
 */
public class StreamPrime {
    /**
     * 拿到2的p次方的数据集
     * @return
     */
    static Stream<BigInteger> primes() {
        return Stream.iterate(new BigInteger(String.valueOf(2)), BigInteger::nextProbablePrime);
    }

    public static void main(String[] args) {
        //算出2的p次方减一  然后过滤，然后限制数量为5，然后打印
        primes().map(p -> BigInteger.valueOf(2).pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(mer -> mer.isProbablePrime(50))
                .limit(5)
                .forEach(System.out::println);
    }

}
