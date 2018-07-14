package com.asiainfo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ZhangPei on 2018/6/6.
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.err.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.err.println(format);

    }
}
