package org.suwg.demo.jvm.classfile;

import java.math.BigInteger;

/**
 * class文件读取器.
 * <p>
 * java虚拟机定义了u1、u2、u4三种数据类型来表示；1字节、2字节、4字节，无符号整数。
 * * 在如下实现中，用增位方式表示无符号类型：
 * * u1、u2可以用int类型存储，因为int类型是4字节
 * * u4 需要用long类型存储，因为long类型是8字节
 *
 * @Author: suwg
 * @Date: 2023/6/27
 */
public class ClassReader {

    /**
     * 数据内容.
     */
    private byte[] data;

    public ClassReader(byte[] data) {
        this.data = data;
    }

    /**
     * 读取1字节 u1.
     *
     * @return 1字节
     */
    public int readUint8() {
        byte[] val = readByte(1);
        return byte2int(val);
    }

    //u2
    public int readUint16() {
        byte[] val = readByte(2);
        return byte2int(val);
    }

    //u4
    public long readUint32() {
        byte[] val = readByte(4);
        String str_hex = new BigInteger(1, val).toString(16);
        return Long.parseLong(str_hex, 16);
    }

    public int readUint32TInteger() {
        byte[] val = readByte(4);
        return new BigInteger(1, val).intValue();
    }

    public float readUint64TFloat() {
        byte[] val = readByte(8);
        return new BigInteger(1, val).floatValue();
    }

    public long readUint64TLong() {
        byte[] val = readByte(8);
        return new BigInteger(1, val).longValue();
    }

    public double readUint64TDouble() {
        byte[] val = readByte(8);
        return new BigInteger(1, val).doubleValue();
    }

    public int[] readUint16s() {
        int n = this.readUint16();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = this.readUint16();
        }
        return s;
    }

    /**
     * 读取n字节.
     *
     * @param n
     * @return
     */
    public byte[] readBytes(int n) {
        return readByte(n);
    }

    /**
     * 读取字节.
     *
     * @param length
     * @return
     */
    private byte[] readByte(int length) {
        byte[] copy = new byte[length];
        System.arraycopy(data, 0, copy, 0, length);
        System.arraycopy(data, length, data, 0, data.length - length);
        return copy;
    }

    /**
     * 字节转int.
     *
     * @param val
     * @return
     */
    private int byte2int(byte[] val) {
        String str_hex = new BigInteger(1, val).toString(16);
        return Integer.parseInt(str_hex, 16);
    }
}
