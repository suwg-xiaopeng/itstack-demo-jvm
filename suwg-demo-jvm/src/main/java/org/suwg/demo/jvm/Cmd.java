package org.suwg.demo.jvm;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.List;

/**
 * 命令行参数解析工具类.
 *
 * @Author: suwg
 * @Date: 2023/6/27
 */
public class Cmd {

    /**
     * help命令.
     */
    @Parameter(names = {"-?", "-help"}, description = "print help message", order = 3, help = true)
    boolean helpFlag = false;

    /**
     * version命令.
     */
    @Parameter(names = "-version", description = "print version and exit", order = 2)
    boolean versionFlag = false;

    /**
     * classpath命令.
     */
    @Parameter(names = {"-cp", "-classpath"}, description = "classpath", order = 1)
    String classpath;

    /**
     * Xjre命令.
     */
    @Parameter(names = "-Xjre", description = "path to jre", order = 4)
    String jre;

    /**
     * main class and args命令.
     * 第一个元素为类型， 后续元素为参数.
     */
    @Parameter(description = "main class and args")
    List<String> mainClassAndArgs;

    boolean ok;

    /**
     * 获取main class.
     *
     * @return main class
     */
    String getMainClass() {
        return mainClassAndArgs != null && !mainClassAndArgs.isEmpty()
                ? mainClassAndArgs.get(0)
                : null;
    }

    /**
     * 获取main class的参数.
     *
     * @return main class的参数
     */
    List<String> getAppArgs() {
        return mainClassAndArgs != null && mainClassAndArgs.size() > 1
                ? mainClassAndArgs.subList(1, mainClassAndArgs.size())
                : null;
    }

    /**
     * 解析命令行参数.
     *
     * @param argv 命令行参数
     * @return Cmd
     */
    static Cmd parse(String[] argv) {
        Cmd args = new Cmd();
        JCommander cmd = JCommander.newBuilder().addObject(args).build();
        cmd.parse(argv);
        args.ok = true;
        return args;
    }
}
