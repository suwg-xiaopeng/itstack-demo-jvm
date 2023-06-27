package org.suwg.demo.jvm;

import org.suwg.demo.jvm.classpath.Classpath;

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
        Classpath cp = new Classpath(cmd.jre, cmd.classpath);
        System.out.printf("classpath:%s class:%s args:%s\n", cp, cmd.getMainClass(), cmd.getAppArgs());
        //获取className
        String className = cmd.getMainClass().replace(".", "/");
        //读取字节码
        try {
            byte[] classData = cp.readClass(className);

            System.out.println(Arrays.toString(classData));

            System.out.println("classData：");
            for (byte b : classData) {
                //16进制输出
                System.out.print(String.format("%02x", b & 0xff) + " ");
            }
        } catch (Exception e) {
            System.out.println("Could not find or load main class " + cmd.getMainClass());
            e.printStackTrace();
        }


    }


}
