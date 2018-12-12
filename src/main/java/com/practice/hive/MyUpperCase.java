package com.practice.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

public class MyUpperCase extends UDF {

    public String evaluate(String s) {

        if(s != null && !"".equals(s)) {
            return s.toUpperCase();
        }
        return null;
    }
}
