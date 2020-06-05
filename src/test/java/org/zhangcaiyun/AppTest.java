package org.zhangcaiyun;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSON;
import com.caiyun.create.util.CreateObjectUtil;
import org.junit.Test;
import org.zhangcaiyun.vo.School;

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
