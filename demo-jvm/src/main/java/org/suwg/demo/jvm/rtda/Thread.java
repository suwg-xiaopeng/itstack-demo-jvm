package org.suwg.demo.jvm.rtda;

/**
 * 线程.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */
public class Thread {

    //Program Counter  寄存器.
    private int pc;

    //虚拟机栈.
    private JvmStack stack;

    public Thread() {
        this.stack = new JvmStack(1024);
    }

    /**
     * 获取当前的寄存器的值.
     *
     * @return
     */
    public int pc() {
        return this.pc;
    }

    /**
     * 设置寄存器的值.
     *
     * @param pc
     */
    public void setPc(int pc) {
        this.pc = pc;
    }

    /**
     * 写入一个栈帧.
     *
     * @return
     */
    public void pushFrame(Frame frame) {
        this.stack.push(frame);
    }

    /**
     * 弹出一个栈帧.
     */
    public Frame popFrame() {
        return this.stack.pop();
    }

    /**
     * 获取当前的栈帧.
     *
     * @return
     */
    public Frame currentFrame() {
        return this.stack.top();
    }

}
