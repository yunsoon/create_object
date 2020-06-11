package com.caiyun.create.factory;

import com.caiyun.create.service.CreateObject;
import com.caiyun.create.service.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CreateObjectFactory {
    private static Map<String,CreateObject> createMap = new HashMap<>();
    private static Map<String,String> typeMap = new HashMap<>();
    static {
        createMap.put("java.lang.Long",new CreateLongObject());
        createMap.put("java.lang.String",new CreateStringObject());
        createMap.put("java.lang.Integer",new CreateIntegerObject());
        createMap.put("java.util.List",new CreateListObject());
        createMap.put("java.lang.Float",new CreateFloatObject());

        typeMap.put("int","java.lang.Integer");
        typeMap.put("long","java.lang.Long");
        typeMap.put("double","java.lang.Double");
        typeMap.put("float","java.lang.Float");
    }


    public static CreateObject getCreatorByType(String type){
        type = getObjTypeString(type);
        return createMap.get(type);
    }

    private static String getObjTypeString(String type){
        type = type.substring(0,type.indexOf("<") > 0?type.indexOf("<"):type.length());
        String result = typeMap.get(type);
        if(result == null || "".equals(result)){
            return type;
        }else{
            return result;
        }
    }
}
