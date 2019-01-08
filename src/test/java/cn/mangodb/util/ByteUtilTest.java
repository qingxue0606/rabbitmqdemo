 package cn.mangodb.util;

import java.util.Arrays;
import org.junit.Test;

/**
 * @author xiang
 * @date 2019/01/08
 */
public class ByteUtilTest {
    @Test
    public void test() {
        byte[] array=new byte[2];
        array[0]=2;
        array[1]=0;
        byte[] result= ByteUtil.inverseArray(array);
        System.out.println(Arrays.toString(result));
    }
}
