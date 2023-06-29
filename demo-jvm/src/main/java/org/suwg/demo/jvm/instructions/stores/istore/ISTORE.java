package org.suwg.demo.jvm.instructions.stores.istore;

import org.suwg.demo.jvm.instructions.base.InstructionIndex8;
import org.suwg.demo.jvm.rtda.Frame;

public class ISTORE extends InstructionIndex8 {

    @Override
    public void execute(Frame frame) {
        _istore(frame, this.idx);
    }

}