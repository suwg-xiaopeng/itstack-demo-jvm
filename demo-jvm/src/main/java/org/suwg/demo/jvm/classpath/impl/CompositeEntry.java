package org.suwg.demo.jvm.classpath.impl;

import org.suwg.demo.jvm.classpath.Entry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 类路径解析.
 *
 * @Author: suwg
 * @Date: 2023/6/27
 */
public class CompositeEntry implements Entry {

    /**
     * 类路径集合.
     */
    private final List<Entry> entryList = new ArrayList<>();

    /**
     * 构造函数.
     *
     * @param pathList
     */
    public CompositeEntry(String pathList) {
        String[] paths = pathList.split(File.pathSeparator);
        for (String path : paths) {
            entryList.add(Entry.create(path));
        }
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
        for (Entry entry : entryList) {
            try {
                return entry.readClass(className);
            } catch (Exception e) {
                // ignored
            }
        }
        throw new IOException("class not found " + className);
    }

    /**
     * toString.
     *
     * @return
     */
    @Override
    public String toString() {
        String[] strs = new String[entryList.size()];
        for (int i = 0; i < entryList.size(); i++) {
            strs[i] = entryList.get(i).toString();
        }
        return String.join(File.pathSeparator, strs);
    }

}
