package org.suwg.demo.jvm.classpath.impl;

import org.suwg.demo.jvm.classpath.Entry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 目录形式的类路径.
 *
 * @Author: suwg
 * @Date: 2023/6/27
 */
public class DirEntry implements Entry {

    /**
     * 绝对路径.
     */
    private Path absolutePath;

    /**
     * 构造函数.
     *
     * @param path
     */
    public DirEntry(String path) {
        //获取绝对路径
        this.absolutePath = Paths.get(path).toAbsolutePath();
    }


    /**
     * 读取class文件.
     *
     * @param className
     * @return
     * @throws IOException
     */
    @Override
    public byte[] readClass(String className) throws IOException {
        return Files.readAllBytes(absolutePath.resolve(className));
    }

    /**
     * toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.absolutePath.toString();
    }
}
