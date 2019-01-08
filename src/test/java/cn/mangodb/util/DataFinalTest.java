 package cn.mangodb.util;

import java.util.Arrays;
import org.junit.Test;
import cn.mangodb.data.DataFinal;

/**
 * @author xiang
 * @date 2019/01/08
 */
public class DataFinalTest {
    @Test
    public void testgetDataFinalNO1() {
        byte[]result=DataFinal.getDataFinalNO1();
        for (int i = 0; i < result.length; i++) {
            System.out.print("" + i + Arrays.toString(ByteUtil.getBooleanArray(result[i])) + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}
