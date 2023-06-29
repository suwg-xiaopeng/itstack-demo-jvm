package org.suwg.demo.jvm.instructions.stores.fstore;

import org.suwg.demo.jvm.instructions.base.InstructionIndex8;
import org.suwg.demo.jvm.rtda.Frame;

public class FSTORE extends InstructionIndex8 {

    @Override
    public void execute(Frame frame) {
        _fstore(frame, this.idx);
    }

}
