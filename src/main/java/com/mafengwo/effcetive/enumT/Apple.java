package com.mafengwo.effcetive.enumT;

/**
 * @author chenminrui
 * @date 2020-05-20 2:40 下午
 */
public enum Apple {
    /**
     * 枚举类型排列顺序
     * 实质为一个int枚举类型，
     * 从上至下 0 1 2 ..
     * 因此枚举类型在使用中是一个优化后的Object类型，实现了Comparable和Serializable接口。
     * 可以进行排序和序列化
     */
    LARGE,
    MIDDLE,
    SMALL
}
