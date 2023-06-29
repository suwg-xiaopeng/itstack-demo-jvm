package org.suwg.demo.jvm.instructions.stores.lstore;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class LSTORE_0 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        _lstore(frame, 0);
    }

}
