package org.suwg.demo.jvm.instructions.stores.lstore;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class LSTORE_2 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        _lstore(frame, 2);
    }

}
