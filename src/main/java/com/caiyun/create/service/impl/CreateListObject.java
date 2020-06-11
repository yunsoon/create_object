package com.caiyun.create.service.impl;

import com.caiyun.create.factory.CreateObjectFactory;
import com.caiyun.create.service.CreateObject;
import com.caiyun.create.util.CreateObjectUtil;

import java.util.ArrayList;
import java.util.List;

public class CreateListObject implements CreateObject {

    @Override
    public Object create(String type) {
        String classObj = type.substring(type.indexOf("<") + 1, type.indexOf(">"));
        CreateObject createObject = CreateObjectFactory.getCreatorByType(classObj);
        try {
            Class<?> clazz = Class.forName(classObj);
            List<Object> list = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                Object obj = null;
                if (createObject != null) {
                    obj = createObject.create();
                }else{
                    obj = CreateObjectUtil.createObject(clazz);
                }
                list.add(obj);
            }
            return list;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object create() {
        return new ArrayList<>(1);
    }
}
