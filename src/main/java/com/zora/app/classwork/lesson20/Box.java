package com.zora.app.classwork.lesson20;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class Box<T extends Number> {
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }
    public <U extends Pair> U inspect (U u){
        System.out.println(u.getKey());
        return u;
    }

}
