package org.suwg.demo.jvm.instructions.loads.aload;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class ALOAD_3 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        Object ref = frame.localVars().getRef(3);
        frame.operandStack().pushRef(ref);
    }

}
