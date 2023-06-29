package org.suwg.demo.jvm.instructions.math.neg;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;

//negate int
public class INEG extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        int val = stack.popInt();
        stack.pushDouble(-val);
    }

}

