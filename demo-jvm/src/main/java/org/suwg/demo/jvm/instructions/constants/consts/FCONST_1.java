package org.suwg.demo.jvm.instructions.constants.consts;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class FCONST_1 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        frame.operandStack().pushFloat(1);
    }
}
