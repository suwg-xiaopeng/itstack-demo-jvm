package org.suwg.demo.jvm.instructions.conversions.f2x;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;

//convert float to int
public class F2I extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        float f = stack.popFloat();
        int i = (int) f;
        stack.pushInt(i);
    }
}
