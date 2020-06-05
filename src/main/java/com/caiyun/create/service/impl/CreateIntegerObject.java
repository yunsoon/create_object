package com.caiyun.create.service.impl;

import com.caiyun.create.service.CreateObject;

import java.util.Random;

public class CreateIntegerObject implements CreateObject {
    @Override
    public Object create(String type) {
        return create();
    }

    @Override
    public Object create() {
        return new Random().nextInt(100);
    }
}
