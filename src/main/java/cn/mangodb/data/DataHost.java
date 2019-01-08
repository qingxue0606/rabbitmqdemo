 package cn.mangodb.data;

import java.util.Map;

/**
 * @author xiang
 * @date 2019/01/08
 */
 
public class DataHost {
    public static byte[] getDataHostNO1(Map<String, byte[]> dataTest){
        byte[] result=new byte[36];
        result[0]=dataTest.get("hostAddress")[0];
        result[1]=dataTest.get("hostAddress")[1];
        result[2]=0b00000000;
        result[3]=0b00000000;
        for(int i=0;i<dataTest.get("date").length;i++) {
            result[4+i]=dataTest.get("date")[i];
        }
        return result;
    } 
}
