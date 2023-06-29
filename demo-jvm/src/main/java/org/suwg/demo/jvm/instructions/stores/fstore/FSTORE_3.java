package org.suwg.demo.jvm.instructions.stores.fstore;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class FSTORE_3 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        _fstore(frame, 3);
    }

}
