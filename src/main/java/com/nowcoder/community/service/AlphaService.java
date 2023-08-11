package com.nowcoder.community.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class AlphaService {
    public AlphaService(){
        System.out.println("shilihua AlphaService");
    }
    @PostConstruct
    public void init(){
        System.out.println("chushihua AlphaService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("xiaohui AlphaService");
    }
}
