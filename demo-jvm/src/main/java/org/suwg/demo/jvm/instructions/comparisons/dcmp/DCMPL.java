package org.suwg.demo.jvm.instructions.comparisons.dcmp;

import org.suwg.demo.jvm.instructions.base.InstructionNoOperands;
import org.suwg.demo.jvm.rtda.Frame;

public class DCMPL extends InstructionNoOperands {

    //q:DCMPL指令是什么意思？
    //a:DCMPL指令是用来比较两个double类型的变量，
    // 当两个double类型的变量相等时，将int类型的0压入操作数栈，
    // 当第一个double类型的变量大于第二个double类型的变量时，将int类型的1压入操作数栈，
    // 当第一个double类型的变量小于第二个double类型的变量时，将int类型的-1压入操作数栈。
    @Override
    public void execute(Frame frame) {
        _dcmp(frame, false);
    }

}