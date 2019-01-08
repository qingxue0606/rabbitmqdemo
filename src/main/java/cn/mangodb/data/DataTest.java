package cn.mangodb.data;

import java.util.HashMap;
import java.util.Map;

/**
* @author xiang
* @date 2019/01/07
*/
public class DataTest {
    // 重庆6号线TCMS与DCU的通信协议 - 故障
    public static Map<String, byte[]> getDataNo1() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[10];
        date[0] = (byte)0b01011111;
        date[1] = (byte)0b01000101;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b00001111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b00001111;
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b00000011;
        map.put("date", date);
        
        
        byte[] hostAddress=new byte[2];
        //022
        hostAddress[0]=0X02;
        hostAddress[1]=(byte)0Xf2;
        map.put("hostAddress", hostAddress);
        return map;
    }

    // 重庆6号线TCMS与PIS通信协议
    public static Map<String, byte[]> getDataNo2_1() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[22];
        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111101;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b00001111;
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b11111111;
        date[10] = (byte)0b11111111;
        date[11] = (byte)0b11111111;
        date[12] = (byte)0b11111111;
        date[13] = (byte)0b11111111;
        date[14] = (byte)0b11111111;
        date[15] = (byte)0b11111111;
        date[16] = (byte)0b11111111;
        date[17] = (byte)0b11111111;
        date[18] = (byte)0b11111111;
        date[19] = (byte)0b11111111;
        date[20] = (byte)0b11111111;
        date[21] = (byte)0b11111111;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //501
        hostAddress[0]=0X50;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);
        return map;
    }
 // 重庆6号线TCMS与PIS通信协议
    public static Map<String, byte[]> getDataNo2_2() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[8];
        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b00000001;
        date[5] = (byte)0b00000000;
        date[6] = (byte)0b00000000;
        date[7] = (byte)0b00000000;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //511
        hostAddress[0]=0X51;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);
        return map;
    }

    // 重庆6号线TCMS与车门通信协议1
    public static Map<String, byte[]> getDataNo3_1() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[32];
        // 1#门数据
        date[0] = (byte)0b00000111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b00000001;
        // 2#门数据
        date[4] = (byte)0b00000111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b00000001;
        // 3#门数据
        date[8] = (byte)0b00000111;
        date[9] = (byte)0b11111111;
        date[10] = (byte)0b11111111;
        date[11] = (byte)0b00000001;
        // 4#门数据
        date[12] = (byte)0b00000111;
        date[13] = (byte)0b11111111;
        date[14] = (byte)0b11111111;
        date[15] = (byte)0b00000001;
        // 5#门数据
        date[16] = (byte)0b00000111;
        date[17] = (byte)0b11111111;
        date[18] = (byte)0b11111111;
        date[19] = (byte)0b00000001;
        // 6#门数据
        date[20] = (byte)0b00000111;
        date[21] = (byte)0b11111111;
        date[22] = (byte)0b11111111;
        date[23] = (byte)0b00000001;
        // 7#门数据
        date[24] = (byte)0b00000111;
        date[25] = (byte)0b11111111;
        date[26] = (byte)0b11111111;
        date[27] = (byte)0b00000001;
        // 8#门数据
        date[28] = (byte)0b00000111;
        date[29] = (byte)0b11111111;
        date[30] = (byte)0b11111111;
        date[31] = (byte)0b00000001;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //311
        hostAddress[0]=0X31;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);
        
        return map;
    }

    // 重庆6号线TCMS与车门通信协议2
    public static Map<String, byte[]> getDataNo3_2() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[28];
        // 1#门数据
        date[0] = (byte)0b11111111;
        date[1] = (byte)0b00001111;
        // 2#门数据
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b00001111;
        // 3#门数据
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b00001111;
        // 4#门数据
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b00001111;
        // 5#门数据
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b00001111;
        // 6#门数据
        date[10] = (byte)0b11111111;
        date[11] = (byte)0b00001111;
        // 7#门数据
        date[12] = (byte)0b11111111;
        date[13] = (byte)0b00001111;
        // 8#门数据
        date[14] = (byte)0b11111111;
        date[15] = (byte)0b00001111;
        // 预留
        date[16] = (byte)0b00000000;
        date[17] = (byte)0b00000000;
        date[18] = (byte)0b00000000;
        date[19] = (byte)0b00000000;

        date[20] = (byte)0b00000011;
        date[21] = (byte)0b00000000;
        date[22] = (byte)0b11111111;
        date[23] = (byte)0b00000000;

        date[24] = (byte)0b11111111;
        date[25] = (byte)0b11111111;
        date[26] = (byte)0b11111111;
        date[27] = (byte)0b11111111;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //331
        hostAddress[0]=0X33;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);
        
        
        
        return map;
    }

    // 重庆6号线TCMS与车门通信协议3
    public static Map<String, byte[]> getDataNo3_3() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[32];
        // 1#门数据
        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;

        // 2#门数据
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b11111111;
        // 3#门数据
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b11111111;
        date[10] = (byte)0b11111111;
        date[11] = (byte)0b11111111;

        // 4#门数据
        date[12] = (byte)0b11111111;
        date[13] = (byte)0b11111111;
        date[14] = (byte)0b11111111;
        date[15] = (byte)0b11111111;
        // 5#门数据
        date[16] = (byte)0b11111111;
        date[17] = (byte)0b11111111;
        date[18] = (byte)0b11111111;
        date[19] = (byte)0b11111111;
        // 6#门数据
        date[20] = (byte)0b11111111;
        date[21] = (byte)0b11111111;
        date[22] = (byte)0b11111111;
        date[23] = (byte)0b11111111;
        // 7#门数据
        date[24] = (byte)0b11111111;
        date[25] = (byte)0b11111111;
        date[26] = (byte)0b11111111;
        date[27] = (byte)0b11111111;
        // 8#门数据
        date[28] = (byte)0b11111111;
        date[29] = (byte)0b11111111;
        date[30] = (byte)0b11111111;
        date[31] = (byte)0b11111111;
        
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //351
        hostAddress[0]=0X35;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);

        return map;
    }

    // 重庆6号线TCMS与空调通信协议1
    public static Map<String, byte[]> getDataNo4_1() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[32];

        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b11111111;
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b11111111;
        date[10] = (byte)0b11111111;
        date[11] = (byte)0b11111111;
        date[12] = (byte)0b11111111;

        date[13] = (byte)0b01111111;
        date[14] = (byte)0b00111111;
        date[15] = (byte)0b00000000;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //401
        hostAddress[0]=0X40;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);

        return map;
    }

    // 重庆6号线TCMS与空调通信协议2
    public static Map<String, byte[]> getDataNo4_2() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[25];

        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b11111111;
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b11111111;
        date[10] = (byte)0b11111111;
        date[11] = (byte)0b11111111;
        date[12] = (byte)0b11111111;

        date[13] = (byte)0b00111111;
        date[14] = (byte)0b11001111;
        date[15] = (byte)0b11111111;
        date[16] = (byte)0b00001110;
        date[17] = (byte)0b00000111;
        date[18] = (byte)0b11111111;
        date[19] = (byte)0b11111111;
        date[20] = (byte)0b11000000;

        date[21] = (byte)0b11111111;
        date[22] = (byte)0b11011111;
        date[23] = (byte)0b11011111;
        date[24] = (byte)0b00111111;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //411
        hostAddress[0]=0X41;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);

        return map;
    }

    // 重庆6号线TCMS与铁科制动通信协议1
    public static Map<String, byte[]> getDataNo5_1() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[16];

        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b11111111;
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b11111111;
        date[10] = (byte)0b11011111;
        date[11] = (byte)0b00000111;
        date[12] = (byte)0b11111111;
        date[13] = (byte)0b11111111;

        date[14] = (byte)0b00000011;
        date[15] = (byte)0b00000000;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //201
        hostAddress[0]=0X20;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);

        return map;
    }

    // 重庆6号线TCMS与铁科制动通信协议2
    public static Map<String, byte[]> getDataNo5_2() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[32];

        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b11111111;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b11111111;
        date[8] = (byte)0b11111111;
        date[9] = (byte)0b11111111;

        date[10] = (byte)0b10110011;
        date[11] = (byte)0b11110111;
        date[12] = (byte)0b10011111;
        date[13] = (byte)0b11101111;

        date[14] = (byte)0b00000000;

        date[15] = (byte)0b11111111;
        date[16] = (byte)0b11111111;
        date[17] = (byte)0b11111111;
        date[18] = (byte)0b11111111;
        date[19] = (byte)0b11111111;
        date[20] = (byte)0b11111111;
        date[21] = (byte)0b11111111;
        date[22] = (byte)0b11111111;
        date[23] = (byte)0b11111111;
        date[24] = (byte)0b11111111;
        date[25] = (byte)0b11111111;
        date[26] = (byte)0b10001111;
        date[27] = (byte)0b11111001;
        date[28] = (byte)0b00000000;
        date[29] = (byte)0b00010000;
        date[30] = (byte)0b11111111;
        date[31] = (byte)0b11111111;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //211
        hostAddress[0]=0X21;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);

        return map;
    }

    // 重庆6号线TCMS与铁科制动通信协议3
    public static Map<String, byte[]> getDataNo5_3() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[8];

        date[0] = (byte)0b10010011;
        date[1] = (byte)0b00111111;
        date[2] = (byte)0b10000000;
        date[3] = (byte)0b11111111;
        date[4] = (byte)0b11111111;
        date[5] = (byte)0b11111111;
        date[6] = (byte)0b11111111;
        date[7] = (byte)0b00000000;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //221
        hostAddress[0]=0X22;
        hostAddress[1]=(byte)0Xf1;
        map.put("hostAddress", hostAddress);

        return map;
    }
 // 重庆6号线TCMS与铁科制动通信协议4
    public static Map<String, byte[]> getDataNo5_4() {
        Map<String, byte[]> map=new HashMap<>();
        byte[] date = new byte[4];
        date[0] = (byte)0b11111111;
        date[1] = (byte)0b11111111;
        date[2] = (byte)0b00000011;
        date[3] = (byte)0b00000000;
        map.put("date", date);
        byte[] hostAddress=new byte[2];
        //232
        hostAddress[0]=0X23;
        hostAddress[1]=(byte)0Xf2;
        map.put("hostAddress", hostAddress);

        return map;
    }

}
