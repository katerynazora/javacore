package com.zora.app.classwork.lesson20;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "{" +
                "val=" + val +
                '}';
    }


}
