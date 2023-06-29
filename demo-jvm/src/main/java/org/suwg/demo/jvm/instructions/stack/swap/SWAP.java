package org.suwg.demo.jvm.instructions.stack.swap;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.OperandStack;
import org.suwg.demo.jvm.rtda.Slot;

//Swap the top two operand stack values
/*
bottom -> top
[...][c][b][a]
          \/
          /\
         V  V
[...][c][a][b]
*/
public class SWAP extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        Slot slot1 = stack.popSlot();
        Slot slot2 = stack.popSlot();
        stack.pushSlot(slot1);
        stack.pushSlot(slot2);
    }
}
