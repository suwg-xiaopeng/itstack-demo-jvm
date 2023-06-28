package org.suwg.demo.jvm;

import org.suwg.demo.jvm.classfile.ClassFile;
import org.suwg.demo.jvm.classfile.MemberInfo;
import org.suwg.demo.jvm.classpath.Classpath;
import org.suwg.demo.jvm.rtda.Frame;
import org.suwg.demo.jvm.rtda.LocalVars;
import org.suwg.demo.jvm.rtda.OperandStack;

import java.util.Arrays;

/**
 * 主类，启动类.
 * program arguments for windows：-Xjre "C:\Program Files\Java\jdk1.8.0_161\jre" E:\itstack\git\istack-demo\itstack-demo-jvm\itstack-demo-jvm-02\target\test-classes\org\itstack\demo\test\HelloWorld
 * program arguments for mac：-Xjre /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home/jre /Users/suweibo/workplace/java-jvm/itstack-demo-jvm/suwg-demo-jvm/target/test-classes/org/suwg/demo/test/HelloWorld
 *
 * @Author: suwg
 * @Date: 2023/6/27
 */
public class Main {

    public static void main(String[] args) {
        Cmd cmd = Cmd.parse(args);
        if (!cmd.ok || cmd.helpFlag) {
            System.out.println("Usage: <main class> [-options] class [args...]");
            return;
        }
        if (cmd.versionFlag) {
            System.out.println("java version \"1.8.0\"");
            return;
        }
        startJVM(cmd);
    }

    private static void startJVM(Cmd cmd) {
        //Classpath cp = new Classpath(cmd.jre, cmd.classpath);
        //System.out.printf("classpath:%s class:%s args:%s\n", cp, cmd.getMainClass(), cmd.getAppArgs());
        ////获取className
        //String className = cmd.getMainClass().replace(".", "/");
        ////读取字节码
        //ClassFile classFile = loadClass(className, cp);
        //assert classFile != null;
        //printClassInfo(classFile);


        //第四章  运行时数据区.
        Frame frame = new Frame(100, 100);
        testLocalVars(frame.localVars());
        testOperandStack(frame.operandStack());


    }

    private static void testLocalVars(LocalVars vars) {
        vars.setInt(0, 100);
        vars.setInt(1, -100);
        System.out.println(vars.getInt(0));
        System.out.println(vars.getInt(1));
    }

    private static void testOperandStack(OperandStack ops) {
        ops.pushInt(100);
        ops.pushInt(-100);
        ops.pushRef(null);
        System.out.println(ops.popRef());
        System.out.println(ops.popInt());
    }

    private static ClassFile loadClass(String className, Classpath cp) {
        try {
            byte[] classData = cp.readClass(className);
            return new ClassFile(classData);
        } catch (Exception e) {
            System.out.println("Could not find or load main class " + className);
            return null;
        }
    }

    private static void printClassInfo(ClassFile cf) {
        System.out.println("version: " + cf.majorVersion() + "." + cf.minorVersion());
        System.out.println("constants count：" + cf.constantPool().getSiz());
        System.out.format("access flags：0x%x\n", cf.accessFlags());
        System.out.println("this class：" + cf.className());
        System.out.println("super class：" + cf.superClassName());
        System.out.println("interfaces：" + Arrays.toString(cf.interfaceNames()));
        System.out.println("fields count：" + cf.fields().length);
        for (MemberInfo memberInfo : cf.fields()) {
            System.out.format("  %s\n", memberInfo.name());
        }
        System.out.println("methods count: " + cf.methods().length);
        for (MemberInfo memberInfo : cf.methods()) {
            System.out.format("  %s\n", memberInfo.name());
        }


    }


}
