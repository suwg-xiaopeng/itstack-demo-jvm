package org.suwg.demo.jvm.rtda;

/**
 * 栈帧.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */
public class Frame {

    /**
     * 下一个栈帧.
     */
    Frame lower;

    /**
     * 局部变量表.
     */
    private LocalVars localVars;

    /**
     * 操作数栈.
     */
    private OperandStack operandStack;

    /**
     * 线程.
     *
     * @param maxLocals
     * @param maxStack
     */
    private Thread thread;

    private int nextPC;


    public Frame(Thread thread, int maxLocals, int maxStack) {
        this.thread = thread;
        this.localVars = new LocalVars(maxLocals);
        this.operandStack = new OperandStack(maxStack);
    }

    public LocalVars localVars() {
        return localVars;
    }

    public OperandStack operandStack() {
        return operandStack;
    }

    public Thread thread() {
        return this.thread;
    }

    public int nextPC() {
        return this.nextPC;
    }

    public void setNextPC(int nextPC) {
        this.nextPC = nextPC;
    }

}
