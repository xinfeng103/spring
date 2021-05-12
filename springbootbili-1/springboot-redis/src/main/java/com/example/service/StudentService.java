package com.example.service;

public interface StudentService {
    /**
     * 将值存放到Redis中
     * @param key
     * @param value
     */
    void put(String key, String value) ;
}
