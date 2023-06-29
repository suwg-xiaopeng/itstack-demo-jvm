package org.suwg.demo.jvm.instructions.stores.dstore;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class DSTORE_3 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        _dstore(frame, 3);
    }

}
