package com.zora.app.classwork.lesson20;

/**
 * Created by Kateryna Zora  on 30.05.2017.
 */
public class OrderPair<K, V> implements Pair {
    private K key;
    private V value;

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
