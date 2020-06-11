package org.zhangcaiyun;

import org.zhangcaiyun.vo.School;

import com.alibaba.fastjson.JSON;
import com.caiyun.create.util.CreateObjectUtil;
import org.zhangcaiyun.vo.TestObjVo;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        TestObjVo school = CreateObjectUtil.createObject(TestObjVo.class);
        System.out.println(JSON.toJSONString(school));
	}
}
