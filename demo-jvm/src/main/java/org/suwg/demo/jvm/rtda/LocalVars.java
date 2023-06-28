package org.suwg.demo.jvm.rtda;

/**
 * 局部变量表.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */
public class LocalVars {

    private Slot[] slots;

    /**
     * 创建一个带n个局部变量的局部变量表.
     *
     * @param maxLocals
     */
    public LocalVars(int maxLocals) {
        if (maxLocals > 0) {
            slots = new Slot[maxLocals];
            for (int i = 0; i < maxLocals; i++) {
                slots[i] = new Slot();
            }
        }
    }

    /**
     * 向局部变量表中存放一个int值.
     *
     * @param index
     * @param val
     */
    public void setInt(int index, int val) {
        slots[index].num = val;
    }

    /**
     * 从局部变量表中获取一个int值.
     *
     * @param index
     * @return
     */
    public int getInt(int index) {
        return slots[index].num;
    }

    /**
     * 从局部变量表中获取一个Float值.
     */
    public float getFloat(int index) {
        return Float.intBitsToFloat(slots[index].num);
    }

    /**
     * 向局部变量表中存放一个Float值.
     */
    public void setFloat(int index, float val) {
        slots[index].num = Float.floatToIntBits(val);
    }

    /**
     * 向局部变量表中存放一个long值.
     *
     * @param idx
     * @param val
     */
    public void setLong(int idx, long val) {
        this.slots[idx].num = (int) val;
        this.slots[idx + 1].num = (int) (val >> 32);
    }

    /**
     * 从局部变量表中获取一个long值.
     *
     * @param idx
     * @return
     */
    public Long getLong(int idx) {
        int low = this.slots[idx].num;
        int high = this.slots[idx + 1].num;
        return ((long) high << 32) | (long) low;
    }

    /**
     * 向局部变量表中存放一个double值.
     *
     * @param idx
     * @param val
     */
    public void setDouble(int idx, double val) {
        setLong(idx, (long) val);
    }

    /**
     * 从局部变量表中获取一个double值.
     *
     * @param idx
     * @return
     */
    public Double getDouble(int idx) {
        return Double.valueOf(getLong(idx));
    }
    
    /**
     * 向局部变量表中存放一个引用值.
     *
     * @param index
     * @param ref
     */
    public void setRef(int index, Object ref) {
        slots[index].ref = ref;
    }

    /**
     * 从局部变量表中获取一个引用值.
     *
     * @param index
     * @return
     */
    public Object getRef(int index) {
        return slots[index].ref;
    }

}
