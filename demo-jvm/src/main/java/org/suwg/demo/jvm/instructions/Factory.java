package org.suwg.demo.jvm.instructions;

import org.suwg.demo.jvm.instructions.base.Instruction;
import org.suwg.demo.jvm.instructions.comparisons.dcmp.DCMPG;
import org.suwg.demo.jvm.instructions.comparisons.dcmp.DCMPL;
import org.suwg.demo.jvm.instructions.comparisons.fcmp.FCMPG;
import org.suwg.demo.jvm.instructions.comparisons.fcmp.FCMPL;
import org.suwg.demo.jvm.instructions.comparisons.if_acmp.IF_ACMPEQ;
import org.suwg.demo.jvm.instructions.comparisons.if_acmp.IF_ACMPNE;
import org.suwg.demo.jvm.instructions.comparisons.if_icmp.IF_ICMPEQ;
import org.suwg.demo.jvm.instructions.comparisons.if_icmp.IF_ICMPGE;
import org.suwg.demo.jvm.instructions.comparisons.if_icmp.IF_ICMPGT;
import org.suwg.demo.jvm.instructions.comparisons.if_icmp.IF_ICMPLE;
import org.suwg.demo.jvm.instructions.comparisons.if_icmp.IF_ICMPLT;
import org.suwg.demo.jvm.instructions.comparisons.if_icmp.IF_ICMPNE;
import org.suwg.demo.jvm.instructions.comparisons.ifcond.IFEQ;
import org.suwg.demo.jvm.instructions.comparisons.ifcond.IFGE;
import org.suwg.demo.jvm.instructions.comparisons.ifcond.IFGT;
import org.suwg.demo.jvm.instructions.comparisons.ifcond.IFLE;
import org.suwg.demo.jvm.instructions.comparisons.ifcond.IFLT;
import org.suwg.demo.jvm.instructions.comparisons.ifcond.IFNE;
import org.suwg.demo.jvm.instructions.comparisons.lcmp.LCMP;
import org.suwg.demo.jvm.instructions.constants.consts.ACONST_NULL;
import org.suwg.demo.jvm.instructions.constants.consts.DCONST_0;
import org.suwg.demo.jvm.instructions.constants.consts.DCONST_1;
import org.suwg.demo.jvm.instructions.constants.consts.FCONST_0;
import org.suwg.demo.jvm.instructions.constants.consts.FCONST_1;
import org.suwg.demo.jvm.instructions.constants.consts.FCONST_2;
import org.suwg.demo.jvm.instructions.constants.consts.ICONST_0;
import org.suwg.demo.jvm.instructions.constants.consts.ICONST_1;
import org.suwg.demo.jvm.instructions.constants.consts.ICONST_2;
import org.suwg.demo.jvm.instructions.constants.consts.ICONST_3;
import org.suwg.demo.jvm.instructions.constants.consts.ICONST_4;
import org.suwg.demo.jvm.instructions.constants.consts.ICONST_5;
import org.suwg.demo.jvm.instructions.constants.consts.ICONST_M1;
import org.suwg.demo.jvm.instructions.constants.consts.LCONST_0;
import org.suwg.demo.jvm.instructions.constants.consts.LCONST_1;
import org.suwg.demo.jvm.instructions.constants.ipush.BIPUSH;
import org.suwg.demo.jvm.instructions.constants.ipush.SIPUSH;
import org.suwg.demo.jvm.instructions.constants.nop.NOP;
import org.suwg.demo.jvm.instructions.control.GOTO;
import org.suwg.demo.jvm.instructions.control.LOOKUP_SWITCH;
import org.suwg.demo.jvm.instructions.control.TABLE_SWITCH;
import org.suwg.demo.jvm.instructions.conversions.d2x.D2F;
import org.suwg.demo.jvm.instructions.conversions.d2x.D2I;
import org.suwg.demo.jvm.instructions.conversions.d2x.D2L;
import org.suwg.demo.jvm.instructions.conversions.f2x.F2D;
import org.suwg.demo.jvm.instructions.conversions.f2x.F2I;
import org.suwg.demo.jvm.instructions.conversions.f2x.F2L;
import org.suwg.demo.jvm.instructions.conversions.i2x.I2B;
import org.suwg.demo.jvm.instructions.conversions.i2x.I2C;
import org.suwg.demo.jvm.instructions.conversions.i2x.I2D;
import org.suwg.demo.jvm.instructions.conversions.i2x.I2F;
import org.suwg.demo.jvm.instructions.conversions.i2x.I2L;
import org.suwg.demo.jvm.instructions.conversions.i2x.I2S;
import org.suwg.demo.jvm.instructions.conversions.l2x.L2D;
import org.suwg.demo.jvm.instructions.conversions.l2x.L2F;
import org.suwg.demo.jvm.instructions.conversions.l2x.L2I;
import org.suwg.demo.jvm.instructions.extended.GOTO_W;
import org.suwg.demo.jvm.instructions.extended.WIDE;
import org.suwg.demo.jvm.instructions.extended.ifnull.IFNONNULL;
import org.suwg.demo.jvm.instructions.extended.ifnull.IFNULL;
import org.suwg.demo.jvm.instructions.loads.aload.ALOAD;
import org.suwg.demo.jvm.instructions.loads.aload.ALOAD_0;
import org.suwg.demo.jvm.instructions.loads.aload.ALOAD_1;
import org.suwg.demo.jvm.instructions.loads.aload.ALOAD_2;
import org.suwg.demo.jvm.instructions.loads.aload.ALOAD_3;
import org.suwg.demo.jvm.instructions.loads.dload.DLOAD;
import org.suwg.demo.jvm.instructions.loads.dload.DLOAD_0;
import org.suwg.demo.jvm.instructions.loads.dload.DLOAD_1;
import org.suwg.demo.jvm.instructions.loads.dload.DLOAD_2;
import org.suwg.demo.jvm.instructions.loads.dload.DLOAD_3;
import org.suwg.demo.jvm.instructions.loads.fload.FLOAD;
import org.suwg.demo.jvm.instructions.loads.fload.FLOAD_0;
import org.suwg.demo.jvm.instructions.loads.fload.FLOAD_1;
import org.suwg.demo.jvm.instructions.loads.fload.FLOAD_2;
import org.suwg.demo.jvm.instructions.loads.fload.FLOAD_3;
import org.suwg.demo.jvm.instructions.loads.iload.ILOAD;
import org.suwg.demo.jvm.instructions.loads.iload.ILOAD_0;
import org.suwg.demo.jvm.instructions.loads.iload.ILOAD_1;
import org.suwg.demo.jvm.instructions.loads.iload.ILOAD_2;
import org.suwg.demo.jvm.instructions.loads.iload.ILOAD_3;
import org.suwg.demo.jvm.instructions.loads.lload.LLOAD;
import org.suwg.demo.jvm.instructions.loads.lload.LLOAD_0;
import org.suwg.demo.jvm.instructions.loads.lload.LLOAD_1;
import org.suwg.demo.jvm.instructions.loads.lload.LLOAD_2;
import org.suwg.demo.jvm.instructions.loads.lload.LLOAD_3;
import org.suwg.demo.jvm.instructions.math.add.DADD;
import org.suwg.demo.jvm.instructions.math.add.FADD;
import org.suwg.demo.jvm.instructions.math.add.IADD;
import org.suwg.demo.jvm.instructions.math.add.LADD;
import org.suwg.demo.jvm.instructions.math.and.IAND;
import org.suwg.demo.jvm.instructions.math.and.LAND;
import org.suwg.demo.jvm.instructions.math.div.DDIV;
import org.suwg.demo.jvm.instructions.math.div.FDIV;
import org.suwg.demo.jvm.instructions.math.div.IDIV;
import org.suwg.demo.jvm.instructions.math.div.LDIV;
import org.suwg.demo.jvm.instructions.math.iinc.IINC;
import org.suwg.demo.jvm.instructions.math.mul.DMUL;
import org.suwg.demo.jvm.instructions.math.mul.FMUL;
import org.suwg.demo.jvm.instructions.math.mul.IMUL;
import org.suwg.demo.jvm.instructions.math.mul.LMUL;
import org.suwg.demo.jvm.instructions.math.neg.DNEG;
import org.suwg.demo.jvm.instructions.math.neg.FNEG;
import org.suwg.demo.jvm.instructions.math.neg.INEG;
import org.suwg.demo.jvm.instructions.math.neg.LNEG;
import org.suwg.demo.jvm.instructions.math.or.IOR;
import org.suwg.demo.jvm.instructions.math.or.LOR;
import org.suwg.demo.jvm.instructions.math.rem.DREM;
import org.suwg.demo.jvm.instructions.math.rem.FREM;
import org.suwg.demo.jvm.instructions.math.rem.IREM;
import org.suwg.demo.jvm.instructions.math.rem.LREM;
import org.suwg.demo.jvm.instructions.math.sh.ISHL;
import org.suwg.demo.jvm.instructions.math.sh.ISHR;
import org.suwg.demo.jvm.instructions.math.sh.IUSHR;
import org.suwg.demo.jvm.instructions.math.sh.LSHL;
import org.suwg.demo.jvm.instructions.math.sh.LSHR;
import org.suwg.demo.jvm.instructions.math.sh.LUSHR;
import org.suwg.demo.jvm.instructions.math.sub.DSUB;
import org.suwg.demo.jvm.instructions.math.sub.FSUB;
import org.suwg.demo.jvm.instructions.math.sub.ISUB;
import org.suwg.demo.jvm.instructions.math.sub.LSUB;
import org.suwg.demo.jvm.instructions.math.xor.IXOR;
import org.suwg.demo.jvm.instructions.math.xor.LXOR;
import org.suwg.demo.jvm.instructions.stack.dup.DUP;
import org.suwg.demo.jvm.instructions.stack.dup.DUP2;
import org.suwg.demo.jvm.instructions.stack.dup.DUP2_X1;
import org.suwg.demo.jvm.instructions.stack.dup.DUP2_X2;
import org.suwg.demo.jvm.instructions.stack.dup.DUP_X1;
import org.suwg.demo.jvm.instructions.stack.dup.DUP_X2;
import org.suwg.demo.jvm.instructions.stack.pop.POP;
import org.suwg.demo.jvm.instructions.stack.pop.POP2;
import org.suwg.demo.jvm.instructions.stack.swap.SWAP;
import org.suwg.demo.jvm.instructions.stores.astore.ASTORE;
import org.suwg.demo.jvm.instructions.stores.astore.ASTORE_0;
import org.suwg.demo.jvm.instructions.stores.astore.ASTORE_1;
import org.suwg.demo.jvm.instructions.stores.astore.ASTORE_2;
import org.suwg.demo.jvm.instructions.stores.astore.ASTORE_3;
import org.suwg.demo.jvm.instructions.stores.dstore.DSTORE;
import org.suwg.demo.jvm.instructions.stores.dstore.DSTORE_0;
import org.suwg.demo.jvm.instructions.stores.dstore.DSTORE_1;
import org.suwg.demo.jvm.instructions.stores.dstore.DSTORE_2;
import org.suwg.demo.jvm.instructions.stores.dstore.DSTORE_3;
import org.suwg.demo.jvm.instructions.stores.fstore.FSTORE;
import org.suwg.demo.jvm.instructions.stores.fstore.FSTORE_0;
import org.suwg.demo.jvm.instructions.stores.fstore.FSTORE_1;
import org.suwg.demo.jvm.instructions.stores.fstore.FSTORE_2;
import org.suwg.demo.jvm.instructions.stores.fstore.FSTORE_3;
import org.suwg.demo.jvm.instructions.stores.istore.ISTORE;
import org.suwg.demo.jvm.instructions.stores.istore.ISTORE_0;
import org.suwg.demo.jvm.instructions.stores.istore.ISTORE_1;
import org.suwg.demo.jvm.instructions.stores.istore.ISTORE_2;
import org.suwg.demo.jvm.instructions.stores.istore.ISTORE_3;
import org.suwg.demo.jvm.instructions.stores.lstore.LSTORE;
import org.suwg.demo.jvm.instructions.stores.lstore.LSTORE_0;
import org.suwg.demo.jvm.instructions.stores.lstore.LSTORE_1;
import org.suwg.demo.jvm.instructions.stores.lstore.LSTORE_2;
import org.suwg.demo.jvm.instructions.stores.lstore.LSTORE_3;

/**
 * 指令集.
 *
 * @Author: suwg
 * @Date: 2023/6/28
 */
public class Factory {

    //q: NOP指令是什么？
    //a: NOP指令是一个空指令，什么也不做，可以用来作为其他指令的占位符。

    public static Instruction newInstruction(byte opcode) {
        switch (opcode) {
            case 0x00:
                //q: NOP指令是什么？
                //a: NOP指令是一个空指令，什么也不做，可以用来作为其他指令的占位符。
                return new NOP();
            case 0x01:
                //q: ACONST_NULL指令是什么？
                //a: ACONST_NULL指令把null引用推入操作数栈顶。
                return new ACONST_NULL();
            case 0x02:
                //q: ICONST_M1指令是什么？
                //a: ICONST_M1指令把int型-1推入操作数栈顶。
                return new ICONST_M1();
            case 0x03:
                //q: ICONST_0指令是什么？
                //a: ICONST_0指令把int型0推入操作数栈顶。
                return new ICONST_0();
            case 0x04:
                // q: ICONST_1指令是什么？
                // a: ICONST_1指令把int型1推入操作数栈顶。
                return new ICONST_1();
            case 0x05:
                // q: ICONST_2指令是什么？
                // a: ICONST_2指令把int型2推入操作数栈顶。
                return new ICONST_2();
            case 0x06:
                // q: ICONST_3指令是什么？
                // a: ICONST_3指令把int型3推入操作数栈顶。
                return new ICONST_3();
            case 0x07:
                // q: ICONST_4指令是什么？
                // a: ICONST_4指令把int型4推入操作数栈顶。
                return new ICONST_4();
            case 0x08:
                // q: ICONST_5指令是什么？
                // a: ICONST_5指令把int型5推入操作数栈顶。
                return new ICONST_5();
            case 0x09:
                // q: LCONST_0指令是什么？
                // a: LCONST_0指令把long型0推入操作数栈顶。
                return new LCONST_0();
            case 0x0a:
                // q: LCONST_1指令是什么？
                // a: LCONST_1指令把long型1推入操作数栈顶。
                return new LCONST_1();
            case 0x0b:
                // q: FCONST_0指令是什么？
                // a: FCONST_0指令把float型0推入操作数栈顶。
                return new FCONST_0();
            case 0x0c:
                return new FCONST_1();
            case 0x0d:
                return new FCONST_2();
            case 0x0e:
                return new DCONST_0();
            case 0x0f:
                return new DCONST_1();
            case 0x10:
                return new BIPUSH();
            case 0x11:
                return new SIPUSH();
            // case 0x12:
            // 	return &LDC{}
            // case 0x13:
            // 	return &LDC_W{}
            // case 0x14:
            // 	return &LDC2_W{}
            case 0x15:
                return new ILOAD();
            case 0x16:
                return new LLOAD();
            case 0x17:
                return new FLOAD();
            case 0x18:
                return new DLOAD();
            case 0x19:
                return new ALOAD();
            case 0x1a:
                return new ILOAD_0();
            case 0x1b:
                return new ILOAD_1();
            case 0x1c:
                return new ILOAD_2();
            case 0x1d:
                return new ILOAD_3();
            case 0x1e:
                return new LLOAD_0();
            case 0x1f:
                return new LLOAD_1();
            case 0x20:
                return new LLOAD_2();
            case 0x21:
                return new LLOAD_3();
            case 0x22:
                return new FLOAD_0();
            case 0x23:
                return new FLOAD_1();
            case 0x24:
                return new FLOAD_2();
            case 0x25:
                return new FLOAD_3();
            case 0x26:
                return new DLOAD_0();
            case 0x27:
                return new DLOAD_1();
            case 0x28:
                return new DLOAD_2();
            case 0x29:
                return new DLOAD_3();
            case 0x2a:
                return new ALOAD_0();
            case 0x2b:
                return new ALOAD_1();
            case 0x2c:
                return new ALOAD_2();
            case 0x2d:
                return new ALOAD_3();
            // case 0x2e:
            // 	return iaload
            // case 0x2f:
            // 	return laload
            // case 0x30:
            // 	return faload
            // case 0x31:
            // 	return daload
            // case 0x32:
            // 	return aaload
            // case 0x33:
            // 	return baload
            // case 0x34:
            // 	return caload
            // case 0x35:
            // 	return saload
            case 0x36:
                return new ISTORE();
            case 0x37:
                return new LSTORE();
            case 0x38:
                return new FSTORE();
            case 0x39:
                return new DSTORE();
            case 0x3a:
                return new ASTORE();
            case 0x3b:
                return new ISTORE_0();
            case 0x3c:
                return new ISTORE_1();
            case 0x3d:
                return new ISTORE_2();
            case 0x3e:
                return new ISTORE_3();
            case 0x3f:
                return new LSTORE_0();
            case 0x40:
                return new LSTORE_1();
            case 0x41:
                return new LSTORE_2();
            case 0x42:
                return new LSTORE_3();
            case 0x43:
                return new FSTORE_0();
            case 0x44:
                return new FSTORE_1();
            case 0x45:
                return new FSTORE_2();
            case 0x46:
                return new FSTORE_3();
            case 0x47:
                return new DSTORE_0();
            case 0x48:
                return new DSTORE_1();
            case 0x49:
                return new DSTORE_2();
            case 0x4a:
                return new DSTORE_3();
            case 0x4b:
                return new ASTORE_0();
            case 0x4c:
                return new ASTORE_1();
            case 0x4d:
                return new ASTORE_2();
            case 0x4e:
                return new ASTORE_3();
            // case 0x4f:
            // 	return iastore
            // case 0x50:
            // 	return lastore
            // case 0x51:
            // 	return fastore
            // case 0x52:
            // 	return dastore
            // case 0x53:
            // 	return aastore
            // case 0x54:
            // 	return bastore
            // case 0x55:
            // 	return castore
            // case 0x56:
            // 	return sastore
            case 0x57:
                return new POP();
            case 0x58:
                return new POP2();
            case 0x59:
                return new DUP();
            case 0x5a:
                return new DUP_X1();
            case 0x5b:
                return new DUP_X2();
            case 0x5c:
                return new DUP2();
            case 0x5d:
                return new DUP2_X1();
            case 0x5e:
                return new DUP2_X2();
            case 0x5f:
                return new SWAP();
            case 0x60:
                return new IADD();
            case 0x61:
                return new LADD();
            case 0x62:
                return new FADD();
            case 0x63:
                return new DADD();
            case 0x64:
                return new ISUB();
            case 0x65:
                return new LSUB();
            case 0x66:
                return new FSUB();
            case 0x67:
                return new DSUB();
            case 0x68:
                return new IMUL();
            case 0x69:
                return new LMUL();
            case 0x6a:
                return new FMUL();
            case 0x6b:
                return new DMUL();
            case 0x6c:
                return new IDIV();
            case 0x6d:
                return new LDIV();
            case 0x6e:
                return new FDIV();
            case 0x6f:
                return new DDIV();
            case 0x70:
                return new IREM();
            case 0x71:
                return new LREM();
            case 0x72:
                return new FREM();
            case 0x73:
                return new DREM();
            case 0x74:
                return new INEG();
            case 0x75:
                return new LNEG();
            case 0x76:
                return new FNEG();
            case 0x77:
                return new DNEG();
            case 0x78:
                return new ISHL();
            case 0x79:
                return new LSHL();
            case 0x7a:
                return new ISHR();
            case 0x7b:
                return new LSHR();
            case 0x7c:
                return new IUSHR();
            case 0x7d:
                return new LUSHR();
            case 0x7e:
                return new IAND();
            case 0x7f:
                return new LAND();
            case (byte) 0x80:
                return new IOR();
            case (byte) 0x81:
                return new LOR();
            case (byte) 0x82:
                return new IXOR();
            case (byte) 0x83:
                return new LXOR();
            case (byte) 0x84:
                return new IINC();
            case (byte) 0x85:
                return new I2L();
            case (byte) 0x86:
                return new I2F();
            case (byte) 0x87:
                return new I2D();
            case (byte) 0x88:
                return new L2I();
            case (byte) 0x89:
                return new L2F();
            case (byte) 0x8a:
                return new L2D();
            case (byte) 0x8b:
                return new F2I();
            case (byte) 0x8c:
                return new F2L();
            case (byte) 0x8d:
                return new F2D();
            case (byte) 0x8e:
                return new D2I();
            case (byte) 0x8f:
                return new D2L();
            case (byte) 0x90:
                return new D2F();
            case (byte) 0x91:
                return new I2B();
            case (byte) 0x92:
                return new I2C();
            case (byte) 0x93:
                return new I2S();
            case (byte) 0x94:
                return new LCMP();
            case (byte) 0x95:
                return new FCMPL();
            case (byte) 0x96:
                return new FCMPG();
            case (byte) 0x97:
                return new DCMPL();
            case (byte) 0x98:
                return new DCMPG();
            case (byte) 0x99:
                return new IFEQ();
            case (byte) 0x9a:
                return new IFNE();
            case (byte) 0x9b:
                return new IFLT();
            case (byte) 0x9c:
                return new IFGE();
            case (byte) 0x9d:
                return new IFGT();
            case (byte) 0x9e:
                return new IFLE();
            case (byte) 0x9f:
                return new IF_ICMPEQ();
            case (byte) 0xa0:
                return new IF_ICMPNE();
            case (byte) 0xa1:
                return new IF_ICMPLT();
            case (byte) 0xa2:
                return new IF_ICMPGE();
            case (byte) 0xa3:
                return new IF_ICMPGT();
            case (byte) 0xa4:
                return new IF_ICMPLE();
            case (byte) 0xa5:
                return new IF_ACMPEQ();
            case (byte) 0xa6:
                return new IF_ACMPNE();
            case (byte) 0xa7:
                return new GOTO();
            // case 0xa8:
            // 	return &JSR{}
            // case 0xa9:
            // 	return &RET{}
            case (byte) 0xaa:
                return new TABLE_SWITCH();
            case (byte) 0xab:
                return new LOOKUP_SWITCH();
            // case 0xac:
            // 	return ireturn
            // case 0xad:
            // 	return lreturn
            // case 0xae:
            // 	return freturn
            // case 0xaf:
            // 	return dreturn
            // case 0xb0:
            // 	return areturn
            // case 0xb1:
            // 	return _return
            //	case 0xb2:
            //		return &GET_STATIC{}
            // case 0xb3:
            // 	return &PUT_STATIC{}
            // case 0xb4:
            // 	return &GET_FIELD{}
            // case 0xb5:
            // 	return &PUT_FIELD{}
            //	case 0xb6:
            //		return &INVOKE_VIRTUAL{}
            // case 0xb7:
            // 	return &INVOKE_SPECIAL{}
            // case 0xb8:
            // 	return &INVOKE_STATIC{}
            // case 0xb9:
            // 	return &INVOKE_INTERFACE{}
            // case 0xba:
            // 	return &INVOKE_DYNAMIC{}
            // case 0xbb:
            // 	return &NEW{}
            // case 0xbc:
            // 	return &NEW_ARRAY{}
            // case 0xbd:
            // 	return &ANEW_ARRAY{}
            // case 0xbe:
            // 	return arraylength
            // case 0xbf:
            // 	return athrow
            // case 0xc0:
            // 	return &CHECK_CAST{}
            // case 0xc1:
            // 	return &INSTANCE_OF{}
            // case 0xc2:
            // 	return monitorenter
            // case 0xc3:
            // 	return monitorexit
            case (byte) 0xc4:
                return new WIDE();
            // case 0xc5:
            // 	return &MULTI_ANEW_ARRAY{}
            case (byte) 0xc6:
                return new IFNULL();
            case (byte) 0xc7:
                return new IFNONNULL();
            case (byte) 0xc8:
                return new GOTO_W();
            // case 0xc9:
            // 	return &JSR_W{}
            // case 0xca: breakpoint
            // case 0xfe: impdep1
            // case 0xff: impdep2
            default:
                return null;

        }
    }


}
