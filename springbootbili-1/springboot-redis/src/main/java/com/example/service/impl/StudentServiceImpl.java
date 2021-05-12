package com.example.service.impl;

import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }
}
