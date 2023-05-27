package io.github.n7m.single.core.util;

import org.springframework.boot.system.ApplicationHome;

import java.io.File;
import java.util.regex.Matcher;

public class Path {

    public static String getAbsolutePath() {
        return getAbsolutePath("");
    }

    public static String getAbsolutePath(String path) {
        ApplicationHome home = new ApplicationHome();
        String rootPath = home.getDir().getAbsolutePath();
        if (!"".equals(path)) {
            if (!path.endsWith(File.separator)) {
                path += File.separator;
            }
            rootPath = rootPath + File.separator + path.replaceAll("/", Matcher.quoteReplacement(File.separator));
        }
        return rootPath.endsWith(File.separator) ? rootPath : rootPath + File.separator;
    }

    public static String convertSeparator(String path) {
        return path.replaceAll("/", Matcher.quoteReplacement(File.separator));
    }

}
