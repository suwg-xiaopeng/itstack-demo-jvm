package org.suwg.demo.jvm.instructions.constants.nop;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class NOP extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        //really do nothing
    }

}
