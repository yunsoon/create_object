package org.zhangcaiyun;

import org.zhangcaiyun.vo.School;

import com.alibaba.fastjson.JSON;
import com.caiyun.create.util.CreateObjectUtil;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        School school = CreateObjectUtil.createObject(School.class);
        System.out.println(JSON.toJSONString(school));
	}
}
