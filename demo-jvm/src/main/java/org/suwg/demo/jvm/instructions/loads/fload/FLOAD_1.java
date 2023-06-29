package org.suwg.demo.jvm.instructions.loads.fload;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class FLOAD_1 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        Float val = frame.localVars().getFloat(1);
        frame.operandStack().pushFloat(val);
    }

}
