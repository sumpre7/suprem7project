package com.supreme7.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2022/3/27 6:24 PM
 * @Description: 大文件读取类
 * 最大内存250MB ,时间消耗 2m35s
 */
public class BigFileUtilsByFileUtils {
    public static void main(String[] args) throws IOException {
        String path = "/Users/supreme7/Desktop/数据/qgis-macos-pr.dmg";

        LineIterator it = FileUtils.lineIterator(new File(path), "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println(line);
            }
        } finally {
            it.close();
            LineIterator.closeQuietly(it);
        }


    }
}
