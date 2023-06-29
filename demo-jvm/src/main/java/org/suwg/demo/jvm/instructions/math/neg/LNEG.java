package org.suwg.demo.jvm.instructions.math.neg;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;

//negate long
public class LNEG extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        long val = stack.popLong();
        stack.pushLong(-val);
    }

}
