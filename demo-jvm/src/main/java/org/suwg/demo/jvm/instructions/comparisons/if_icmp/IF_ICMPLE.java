package org.suwg.demo.jvm.instructions.comparisons.if_icmp;

import org.suwg.demo.jvm.instructions.base.Instruction;
import org.suwg.demo.jvm.instructions.base.InstructionBranch;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;

public class IF_ICMPLE extends InstructionBranch {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        int val2 = stack.popInt();
        int val1 = stack.popInt();
        if (val1 <= val2) {
            Instruction.branch(frame, this.offset);
        }
    }

}