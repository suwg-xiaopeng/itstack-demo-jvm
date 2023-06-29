package org.suwg.demo.jvm.instructions.base;

import org.suwg.demo.jvm.rtda.Frame;

/**
 * 指令接口.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */
public interface Instruction {

    void fetchOperands(BytecodeReader reader);

    void execute(Frame frame);

    /**
     * 跳转指令.
     *
     * @param frame
     * @param offset
     */
    static void branch(Frame frame, int offset) {
        int pc = frame.thread().pc();
        int nextPC = pc + offset;
        frame.setNextPC(nextPC);
    }
}
