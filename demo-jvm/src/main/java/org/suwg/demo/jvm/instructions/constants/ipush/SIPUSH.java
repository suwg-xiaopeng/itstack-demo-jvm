package org.suwg.demo.jvm.instructions.constants.ipush;

import org.suwg.demo.jvm.instructions.base.BytecodeReader;
import org.suwg.demo.jvm.instructions.base.Instruction;
import org.suwg.demo.jvm.rtda.Frame;

//sipush指令从操作数中获取一个short型整数，扩展成int型，然后推入栈顶。
public class SIPUSH implements Instruction {

    private short val;

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.val = reader.readShort();
    }

    @Override
    public void execute(Frame frame) {
        frame.operandStack().pushInt(val);
    }
}
