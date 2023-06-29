package org.suwg.demo.jvm.instructions.constants.consts;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

// push double
public class DCONST_0 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        frame.operandStack().pushDouble(0.0);
    }

}
