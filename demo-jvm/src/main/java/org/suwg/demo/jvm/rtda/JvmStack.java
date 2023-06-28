package org.suwg.demo.jvm.rtda;

/**
 * 虚拟机栈.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */
public class JvmStack {

    /**
     * 栈容量.
     */
    private int maxSize;

    /**
     * 当前栈大小.
     */
    private int size;

    /**
     * 栈顶.
     */
    private Frame _top;

    /**
     * 创建一个指定大小的栈.
     *
     * @param maxSize
     */
    public JvmStack(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * 向栈中压入一个栈帧.
     *
     * @param frame
     */
    public void push(Frame frame) {
        if (size >= maxSize) {
            throw new RuntimeException("java.lang.StackOverflowError");
        }
        if (_top != null) {
            frame.lower = this._top;
        }
        this._top = frame;
        this.size++;
    }

    /**
     * 从栈中弹出一个栈帧.
     *
     * @return
     */
    public Frame pop() {
        if (this._top == null) {
            throw new RuntimeException("jvm stack is empty");
        }
        Frame top = this._top;
        _top = top.lower;
        top.lower = null;
        this.size--;
        return top;
    }

    /**
     * 获取栈顶.
     *
     * @return
     */
    public Frame top() {
        if (this._top == null) {
            throw new RuntimeException("jvm stack is empty");
        }
        return this._top;
    }


}
