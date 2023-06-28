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

    public Frame(int maxLocals, int maxStack) {
        this.localVars = new LocalVars(maxLocals);
        this.operandStack = new OperandStack(maxStack);
    }


    public LocalVars localVars() {
        return this.localVars;
    }

    public OperandStack operandStack() {
        return this.operandStack;
    }

}
