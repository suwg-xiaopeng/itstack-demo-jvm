package org.suwg.demo.jvm.instructions.extended;

import org.suwg.demo.jvm.instructions.base.BytecodeReader;
import org.suwg.demo.jvm.instructions.base.Instruction;
import org.suwg.demo.jvm.rtda.Frame;

//branch always(wide index)
public class GOTO_W implements Instruction {

    private int offset;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.offset = reader.readInt();
    }

    @Override
    public void execute(Frame frame) {
        Instruction.branch(frame, this.offset);
    }

}
