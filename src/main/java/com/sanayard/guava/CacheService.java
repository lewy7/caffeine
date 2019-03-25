package com.sanayard.guava;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @CacheEvict(cacheNames = "tableCache",allEntries=true)
    public void refresh(){
        System.out.println("fresh cache");
    }
}
