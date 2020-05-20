package com.mafengwo.effcetive.enumT;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chenminrui
 * @date 2020-05-20 3:18 下午
 */
public enum Operation {

    /**
     * + - * /
     * 进行表示加减乘除
     */
    PLUS("+") {@Override public double baseApply(double x, double y) { return x + y; }},
    MINUS("-") {@Override public double baseApply(double x, double y) { return x - y; }},
    TIMES("*") {@Override public double baseApply(double x, double y) { return x * y; }},
    DIVIDE("/") {@Override public double baseApply(double x, double y) { return x / y; }};

    /**
     *  must override this method
     *  if add a Enum type
     *  we can override this method to computer a result
     */
    /**
     * if every enum has small action
     * a  abstract method is a good choice
     */
    public abstract double baseApply(double x, double y);
    private final String symbol;
    Operation(String symbol){
        this.symbol=symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    /**
     * 静态初始化一个枚举类型
     */
    private static  final Map<String,Operation> STRING_TO_ENUM = Stream.of(values()).collect(Collectors.toMap(Object::toString, e -> e));

    /**
     * 字符串转枚举
     * @param sym 字符串
     * @return 对应枚举类型
     */
    public static Operation stringToEnum(String sym){
        return STRING_TO_ENUM.get(sym);
    }

}
