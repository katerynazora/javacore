package com.zora.app.classwork.lesson20;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class CompareData<K> implements Compare {
    private K key;

    public CompareData(K key) {
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }
}
