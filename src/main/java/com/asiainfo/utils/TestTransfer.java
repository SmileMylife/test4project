package com.asiainfo.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangPei on 2018/6/7.
 */
public class TestTransfer {
    public static void main(String[] args) throws Exception {
        /*Map<String, Object> map = new HashMap<>();
        map.put("num", 2);
        map.put("num2", "2");*/
        /*if(map.get("num") == 2) {
            System.err.println("相等");
        }
        if (map.get("num2") == 2) {
            System.err.println("********相等");
        }*/

        /*Object obj = map.get("num2");
        System.err.println(obj == 2);*/
        int i = testString(3);
        System.err.println(i);

    }

    public static int testString(int num) throws Exception {
        int i = 0;
        if (num == 5) {
            i = 3;
            return i;
        }else {
            throw new Exception("你好");
        }
    }

}
