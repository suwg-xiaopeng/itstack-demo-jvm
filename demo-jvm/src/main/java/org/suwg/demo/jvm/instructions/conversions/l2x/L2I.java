package org.suwg.demo.jvm.instructions.conversions.l2x;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;

//convert long to int
public class L2I extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        long l = stack.popLong();
        int i = (int) l;
        stack.pushInt(i);
    }
}
