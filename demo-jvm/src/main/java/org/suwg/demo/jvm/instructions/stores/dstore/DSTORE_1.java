package org.suwg.demo.jvm.instructions.stores.dstore;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class DSTORE_1 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        _dstore(frame, 1);
    }

}
