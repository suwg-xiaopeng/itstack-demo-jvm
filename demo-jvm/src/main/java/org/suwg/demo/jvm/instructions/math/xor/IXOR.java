package org.suwg.demo.jvm.instructions.math.xor;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;

//boolean xor int
public class IXOR extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        int v1 = stack.popInt();
        int v2 = stack.popInt();
        int res = v1 ^ v2;
        stack.pushInt(res);
    }

}
