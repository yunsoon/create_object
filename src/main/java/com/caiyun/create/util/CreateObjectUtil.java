package com.caiyun.create.util;

import com.caiyun.create.factory.CreateObjectFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CreateObjectUtil {

    private static int jvm_version;

    static {
        String version = System.getProperties().getProperty("java.vm.version");
        String versionNum = version.substring(0, version.indexOf("."));
        jvm_version = Integer.parseInt(versionNum);
    }

    @SuppressWarnings("deprecation")
	public static <T> T createObject(Class<T> clazz) {

        Field[] fields = clazz.getDeclaredFields();

        T obj = null;
        try {

        	// 为了支持java1.8 及以下版本
            if (jvm_version < 9) {
                obj = clazz.newInstance();
            } else {
                obj = clazz.getDeclaredConstructor().newInstance();
            }
            for (Field field : fields) {
                if (field.getName().equals("serialVersionUID")) continue;
                String type = field.getGenericType().getTypeName();
                field.setAccessible(true);
                field.set(obj, CreateObjectFactory.getCreatorByType(type).create(type));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
