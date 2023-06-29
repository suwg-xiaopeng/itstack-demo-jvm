package org.suwg.demo.jvm.instructions.stores.astore;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class ASTORE_0 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        _astore(frame, 0);
    }

}
