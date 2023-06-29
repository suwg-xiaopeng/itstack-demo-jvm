package org.suwg.demo.jvm.instructions.loads.dload;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class DLOAD_1 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        double val = frame.localVars().getDouble(1);
        frame.operandStack().pushRef(val);
    }

}
