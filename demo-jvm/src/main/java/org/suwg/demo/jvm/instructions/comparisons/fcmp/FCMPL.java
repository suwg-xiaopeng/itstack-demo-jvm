package org.suwg.demo.jvm.instructions.comparisons.fcmp;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class FCMPL extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        _fcmp(frame, false);
    }

}
