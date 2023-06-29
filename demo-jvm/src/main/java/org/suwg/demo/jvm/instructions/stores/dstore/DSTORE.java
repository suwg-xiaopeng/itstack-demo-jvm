package org.suwg.demo.jvm.instructions.stores.dstore;

import org.suwg.demo.jvm.instructions.base.InstructionIndex8;
import org.suwg.demo.jvm.rtda.Frame;

public class DSTORE extends InstructionIndex8 {

    @Override
    public void execute(Frame frame) {
        _astore(frame, this.idx);
    }

}
