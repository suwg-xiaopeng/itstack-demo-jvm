package org.suwg.demo.jvm.instructions.constants.consts;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

//push int constant
public class ICONST_M1 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        frame.operandStack().pushInt(-1);
    }

}
