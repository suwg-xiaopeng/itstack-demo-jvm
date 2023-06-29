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
        Object ref = slots[size].ref;
        slots[size].ref = null;
        return ref;
    }

    public void pushFloat(float val) {
        this.slots[this.size].num = (int) val;
        this.size++;
    }

    public float popFloat() {
        this.size--;
        return this.slots[this.size].num;
    }

    public void pushLong(long val) {
        this.slots[this.size].num = (int) val;
        this.slots[this.size + 1].num = (int) (val >> 32);
        this.size += 2;
    }

    public long popLong() {
        this.size -= 2;
        int low = this.slots[this.size].num;
        int high = this.slots[this.size + 1].num;
        return (long) (high) << 32 | (long) (low);
    }

    public void pushDouble(double val) {
        this.pushLong((long) val);
    }

    public double popDouble() {
        return this.popLong();
    }


    public void pushSlot(Slot slot) {
        this.slots[this.size] = slot;
        this.size++;
    }

    public Slot popSlot() {
        this.size--;
        return this.slots[this.size];
    }

    public Slot[] getSlots() {
        return slots;
    }
}