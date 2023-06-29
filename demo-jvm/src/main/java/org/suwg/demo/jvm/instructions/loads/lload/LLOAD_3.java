package org.suwg.demo.jvm.instructions.loads.lload;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class LLOAD_3 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        Long val = frame.localVars().getLong(3);
        frame.operandStack().pushLong(val);
    }

}
