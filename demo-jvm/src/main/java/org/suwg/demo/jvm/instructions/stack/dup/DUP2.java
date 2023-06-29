package org.suwg.demo.jvm.instructions.stack.dup;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;
import org.suwg.demo.jvm.rtda.Slot;

// Duplicate the top one or two operand stack values
/*
bottom -> top
[...][c][b][a]____
          \____   |
               |  |
               V  V
[...][c][b][a][b][a]
*/
public class DUP2 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        Slot slot1 = stack.popSlot();
        Slot slot2 = stack.popSlot();
        stack.pushSlot(slot2);
        stack.pushSlot(slot1);
        stack.pushSlot(slot2);
        stack.pushSlot(slot1);

    }

}
