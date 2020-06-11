package com.caiyun.create.service.impl;

import com.caiyun.create.service.CreateObject;

import java.util.Random;

public class CreateStringObject implements CreateObject {
    char[] squence = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    @Override
    public Object create(String type) {
        Random random = new Random();
        int length = random.nextInt(10);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append(squence[random.nextInt(51)]);
        }
        return sb.toString();
    }


    @Override
    public Object create() {
        return create("");
    }
}
