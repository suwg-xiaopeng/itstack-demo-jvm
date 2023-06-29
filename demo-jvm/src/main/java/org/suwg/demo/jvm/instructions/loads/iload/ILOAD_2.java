package org.suwg.demo.jvm.instructions.loads.iload;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class ILOAD_2 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        int val = frame.localVars().getInt(2);
        frame.operandStack().pushInt(val);
    }
}
