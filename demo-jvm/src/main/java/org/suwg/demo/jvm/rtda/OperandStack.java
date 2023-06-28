package org.suwg.demo.jvm.rtda;

/**
 * 操作数栈.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */
public class OperandStack {

    private int size = 0;

    private Slot[] slots;

    /**
     * 创建一个指定槽数量的栈.
     *
     * @param maxStack
     */
    public OperandStack(int maxStack) {
        if (maxStack > 0) {
            slots = new Slot[maxStack];
            for (int i = 0; i < maxStack; i++) {
                slots[i] = new Slot();
            }
        }
    }


    /**
     * 向栈中压入一个int值.
     *
     * @param val
     */
    public void pushInt(int val) {
        slots[size].num = val;
        size++;
    }

    /**
     * 从栈中弹出一个int值.
     *
     * @return
     */
    public int popInt() {
        size--;
        return slots[size].num;
    }

    /**
     * 向栈中压入一个引用值.
     *
     * @param ref
     */
    public void pushRef(Object ref) {
        slots[size].ref = ref;
        size++;
    }

    /**
     * 从栈中弹出一个引用值.
     *
     * @return
     */
    public Object popRef() {
        size--;
        return slots[size].ref;
    }
}