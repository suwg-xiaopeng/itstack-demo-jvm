package org.suwg.demo.jvm.instructions.comparisons.ifcond;

import org.suwg.demo.jvm.instructions.base.Instruction;
import org.suwg.demo.jvm.instructions.base.InstructionBranch;
import org.suwg.demo.jvm.rtda.Frame;

public class IFEQ extends InstructionBranch {

    @Override
    public void execute(Frame frame) {
        int val = frame.operandStack().popInt();
        if (0 == val) {
            Instruction.branch(frame, this.offset);
        }
    }
}
