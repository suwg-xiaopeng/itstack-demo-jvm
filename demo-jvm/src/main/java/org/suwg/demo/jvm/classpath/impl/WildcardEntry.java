package org.suwg.demo.jvm.classpath.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @Author: suwg
 * @Date: 2023/6/27
 */
public class WildcardEntry extends CompositeEntry {

    public WildcardEntry(String path) {
        super(toPathList(path));
    }

    private static String toPathList(String wildcardPath) {
        String baseDir = wildcardPath.replace("*", ""); // remove *
        try {
            return Files.walk(Paths.get(baseDir))
                    .filter(Files::isRegularFile)
                    .map(Path::toString)
                    .filter(p -> p.endsWith(".jar") || p.endsWith(".JAR"))
                    .collect(Collectors.joining(File.pathSeparator));
        } catch (IOException e) {
            return "";
        }
    }
}
