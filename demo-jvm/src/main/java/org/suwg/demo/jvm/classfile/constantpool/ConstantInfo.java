package org.suwg.demo.jvm.classfile.constantpool;

import org.suwg.demo.jvm.classfile.ClassReader;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantClassInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantDoubleInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantFieldRefInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantFloatInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantIntegerInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantInterfaceMethodRefInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantInvokeDynamicInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantLongInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantMethodHandleInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantMethodRefInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantMethodTypeInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantNameAndTypeInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantStringInfo;
import org.suwg.demo.jvm.classfile.constantpool.impl.ConstantUtf8Info;

/**
 * http://www.itstack.org
 * create by fuzhengwei on 2019/4/26
 */
public interface ConstantInfo {

    int CONSTANT_TAG_CLASS = 7;
    int CONSTANT_TAG_FIELDREF = 9;
    int CONSTANT_TAG_METHODREF = 10;
    int CONSTANT_TAG_INTERFACEMETHODREF = 11;
    int CONSTANT_TAG_STRING = 8;
    int CONSTANT_TAG_INTEGER = 3;
    int CONSTANT_TAG_FLOAT = 4;
    int CONSTANT_TAG_LONG = 5;
    int CONSTANT_TAG_DOUBLE = 6;
    int CONSTANT_TAG_NAMEANDTYPE = 12;
    int CONSTANT_TAG_UTF8 = 1;
    int CONSTANT_TAG_METHODHANDLE = 15;
    int CONSTANT_TAG_METHODTYPE = 16;
    int CONSTANT_TAG_INVOKEDYNAMIC = 18;

    void readInfo(ClassReader reader);

    int tag();

    static ConstantInfo readConstantInfo(ClassReader reader, ConstantPool constantPool) {
        int tag = reader.readUint8();
        ConstantInfo constantInfo = newConstantInfo(tag, constantPool);
        constantInfo.readInfo(reader);
        return constantInfo;
    }

    static ConstantInfo newConstantInfo(int tag, ConstantPool constantPool) {
        switch (tag) {
            case CONSTANT_TAG_INTEGER:
                return new ConstantIntegerInfo();
            case CONSTANT_TAG_FLOAT:
                return new ConstantFloatInfo();
            case CONSTANT_TAG_LONG:
                return new ConstantLongInfo();
            case CONSTANT_TAG_DOUBLE:
                return new ConstantDoubleInfo();
            case CONSTANT_TAG_UTF8:
                return new ConstantUtf8Info();
            case CONSTANT_TAG_STRING:
                return new ConstantStringInfo(constantPool);
            case CONSTANT_TAG_CLASS:
                return new ConstantClassInfo(constantPool);
            case CONSTANT_TAG_FIELDREF:
                return new ConstantFieldRefInfo(constantPool);
            case CONSTANT_TAG_METHODREF:
                return new ConstantMethodRefInfo(constantPool);
            case CONSTANT_TAG_INTERFACEMETHODREF:
                return new ConstantInterfaceMethodRefInfo(constantPool);
            case CONSTANT_TAG_NAMEANDTYPE:
                return new ConstantNameAndTypeInfo();
            case CONSTANT_TAG_METHODTYPE:
                return new ConstantMethodTypeInfo();
            case CONSTANT_TAG_METHODHANDLE:
                return new ConstantMethodHandleInfo();
            case CONSTANT_TAG_INVOKEDYNAMIC:
                return new ConstantInvokeDynamicInfo();
            default:
                throw new ClassFormatError("constant pool tag");
        }
    }
}