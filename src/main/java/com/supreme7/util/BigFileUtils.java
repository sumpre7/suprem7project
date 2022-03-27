package com.supreme7.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2022/3/27 6:24 PM
 * @Description: 大文件读取类
 * 最大使用内存 1250MB ,时间消耗 4m26s
 */
public class BigFileUtils {
    public static void main(String[] args) throws IOException {
        String path = "/Users/supreme7/Desktop/数据/qgis-macos-pr.dmg";

        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(path);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }

    }
}
