package org.suwg.demo.jvm.rtda;

/**
 * 数据槽.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */

public class Slot {
    //q: 数据槽是什么？
    // a: 数据槽是局部变量表的最小单位，一个数据槽可以存放一个int值或者一个引用值。

    /**
     * 存放整数.
     */
    int num;
    /**
     * 存放引用.
     */
    Object ref;
}
