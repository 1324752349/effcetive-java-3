package com.mafengwo.effcetive.tryFinally;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author chenminrui
 * @date 2020-05-15 2:44 下午
 */
public class tryWithResource {

    public static final String PATH = "/Users/maxray/Downloads/apps/陈敏锐-毕业论文（二审版） 20200511144634.doc";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            //do something
            String s = bufferedReader.readLine();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
