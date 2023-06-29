package org.suwg.demo.jvm.instructions.comparisons.if_acmp;

import org.suwg.demo.jvm.instructions.base.Instruction;
import org.suwg.demo.jvm.instructions.base.InstructionBranch;
import org.suwg.demo.jvm.rtda.Frame;

public class IF_ACMPEQ extends InstructionBranch {

    @Override
    public void execute(Frame frame) {
        if (_acmp(frame)) {
            Instruction.branch(frame, this.offset);
        }
    }

}
