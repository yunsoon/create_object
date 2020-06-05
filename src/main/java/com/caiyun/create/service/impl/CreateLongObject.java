package com.caiyun.create.service.impl;

import com.caiyun.create.service.CreateObject;

import java.util.Random;

public class CreateLongObject implements CreateObject {

    @Override
    public Long create(String type) {
        return create();
    }

    @Override
    public Long create() {
        return new Random().nextLong();
    }
}
