 package cn.mangodb.util;

 /**
 * @author xiang
 * @date 2019/01/07
 */
public class ByteUtil {
    /**
     * 将byte转换为一个长度为8的byte数组，数组每个值代表bit
     */
     public static byte[] getBooleanArray(byte b) {
         byte[] array = new byte[8];
         for (int i = 7; i >= 0; i--) {
             array[i] = (byte)(b & 1);
             b = (byte)(b >> 1);
         }
         return array;
     }
     /**
     * 把byte转为字符串的bit
     */
     public static String byteToBit(byte b) {
     return ""
     + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)
     + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)
     + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)
     + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);
     }
     /**
      * 工具用来把传进来的byte[]数组，
      * 进行非运算后，返回对应的数组
      * @param array 数组
      * @return 返回结果的数组
      */
     public static byte[] inverseArray(byte[] array) {
        byte[] result=new byte[array.length];
        for(int i=0;i<array.length;i++) {
            result[i]=(byte)~array[i];
        }
         return result;
    }

}
