package org.suwg.demo.jvm.instructions.math.add;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;

//add long
public class LADD extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        long v2 = stack.popLong();
        long v1 = stack.popLong();
        long res = v1 + v2;
        stack.pushLong(res);
    }
}
