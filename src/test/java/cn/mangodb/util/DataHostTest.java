 package cn.mangodb.util;

import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

import cn.mangodb.data.DataHost;
import cn.mangodb.data.DataTest;

/**
 * @author xiang
 * @date 2019/01/08
 */
public class DataHostTest {
    @Test
    public void testgetDataHostNO1() {
        Map<String, byte[]> result2=DataTest.getDataNo3_2();
        byte[] result=DataHost.getDataHostNO1(result2);
        for (int i = 0; i < result.length; i++) {
            System.out.print("" + i + Arrays.toString(ByteUtil.getBooleanArray(result[i])) + " ");
        }
        System.out.println();
        
        
        for (int i = 0; i < result2.get("data").length; i++) {
            System.out.print("" + i + Arrays.toString(ByteUtil.getBooleanArray(result2.get("data")[i])) + " ");
        }
        System.out.println();
        
    }

    
}
