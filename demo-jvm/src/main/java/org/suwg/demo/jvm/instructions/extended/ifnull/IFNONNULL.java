package org.suwg.demo.jvm.instructions.extended.ifnull;

import org.suwg.demo.jvm.instructions.base.Instruction;
import org.suwg.demo.jvm.instructions.base.InstructionBranch;
import org.suwg.demo.jvm.rtda.Frame;

public class IFNONNULL extends InstructionBranch {

    @Override
    public void execute(Frame frame) {
        Object ref = frame.operandStack().popRef();
        if (null != ref) {
            Instruction.branch(frame, this.offset);
        }
    }
}