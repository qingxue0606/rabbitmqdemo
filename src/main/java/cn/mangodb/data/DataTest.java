package cn.mangodb.data;

/**
* @author xiang
* @date 2019/01/07
*/
public class DataTest {
    // 重庆6号线TCMS与DCU的通信协议 - 故障
    public static byte[] getDataNo1() {
        byte[] bs = new byte[10];
        bs[0] = (byte)0b01011111;
        bs[1] = (byte)0b01000101;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b11111111;
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b00001111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b00001111;
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b00000011;
        return bs;
    }

    // 重庆6号线TCMS与PIS通信协议
    public static byte[] getDataNo2() {
        byte[] bs = new byte[22];
        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b11111101;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b11111111;
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b00001111;
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b11111111;
        bs[10] = (byte)0b11111111;
        bs[11] = (byte)0b11111111;
        bs[12] = (byte)0b11111111;
        bs[13] = (byte)0b11111111;
        bs[14] = (byte)0b11111111;
        bs[15] = (byte)0b11111111;
        bs[16] = (byte)0b11111111;
        bs[17] = (byte)0b11111111;
        bs[18] = (byte)0b11111111;
        bs[19] = (byte)0b11111111;
        bs[20] = (byte)0b11111111;
        bs[21] = (byte)0b11111111;
        return bs;
    }

    // 重庆6号线TCMS与车门通信协议1
    public static byte[] getDataNo3_1() {
        byte[] bs = new byte[32];
        // 1#门数据
        bs[0] = (byte)0b00000111;
        bs[1] = (byte)0b11111111;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b00000001;
        // 2#门数据
        bs[4] = (byte)0b00000111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b00000001;
        // 3#门数据
        bs[8] = (byte)0b00000111;
        bs[9] = (byte)0b11111111;
        bs[10] = (byte)0b11111111;
        bs[11] = (byte)0b00000001;
        // 4#门数据
        bs[12] = (byte)0b00000111;
        bs[13] = (byte)0b11111111;
        bs[14] = (byte)0b11111111;
        bs[15] = (byte)0b00000001;
        // 5#门数据
        bs[16] = (byte)0b00000111;
        bs[17] = (byte)0b11111111;
        bs[18] = (byte)0b11111111;
        bs[19] = (byte)0b00000001;
        // 6#门数据
        bs[20] = (byte)0b00000111;
        bs[21] = (byte)0b11111111;
        bs[22] = (byte)0b11111111;
        bs[23] = (byte)0b00000001;
        // 7#门数据
        bs[24] = (byte)0b00000111;
        bs[25] = (byte)0b11111111;
        bs[26] = (byte)0b11111111;
        bs[27] = (byte)0b00000001;
        // 8#门数据
        bs[28] = (byte)0b00000111;
        bs[29] = (byte)0b11111111;
        bs[30] = (byte)0b11111111;
        bs[31] = (byte)0b00000001;

        return bs;
    }

    // 重庆6号线TCMS与车门通信协议2
    public static byte[] getDataNo3_2() {
        byte[] bs = new byte[28];
        // 1#门数据
        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b00001111;
        // 2#门数据
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b00001111;
        // 3#门数据
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b00001111;
        // 4#门数据
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b00001111;
        // 5#门数据
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b00001111;
        // 6#门数据
        bs[10] = (byte)0b11111111;
        bs[11] = (byte)0b00001111;
        // 7#门数据
        bs[12] = (byte)0b11111111;
        bs[13] = (byte)0b00001111;
        // 8#门数据
        bs[14] = (byte)0b11111111;
        bs[15] = (byte)0b00001111;
        // 预留
        bs[16] = (byte)0b00000000;
        bs[17] = (byte)0b00000000;
        bs[18] = (byte)0b00000000;
        bs[19] = (byte)0b00000000;

        bs[20] = (byte)0b00000011;
        bs[21] = (byte)0b00000000;
        bs[22] = (byte)0b11111111;
        bs[23] = (byte)0b00000000;

        bs[24] = (byte)0b11111111;
        bs[25] = (byte)0b11111111;
        bs[26] = (byte)0b11111111;
        bs[27] = (byte)0b11111111;

        return bs;
    }

    // 重庆6号线TCMS与车门通信协议3
    public static byte[] getDataNo3_3() {
        byte[] bs = new byte[32];
        // 1#门数据
        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b11111111;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b11111111;

        // 2#门数据
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b11111111;
        // 3#门数据
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b11111111;
        bs[10] = (byte)0b11111111;
        bs[11] = (byte)0b11111111;

        // 4#门数据
        bs[12] = (byte)0b11111111;
        bs[13] = (byte)0b11111111;
        bs[14] = (byte)0b11111111;
        bs[15] = (byte)0b11111111;
        // 5#门数据
        bs[16] = (byte)0b11111111;
        bs[17] = (byte)0b11111111;
        bs[18] = (byte)0b11111111;
        bs[19] = (byte)0b11111111;
        // 6#门数据
        bs[20] = (byte)0b11111111;
        bs[21] = (byte)0b11111111;
        bs[22] = (byte)0b11111111;
        bs[23] = (byte)0b11111111;
        // 7#门数据
        bs[24] = (byte)0b11111111;
        bs[25] = (byte)0b11111111;
        bs[26] = (byte)0b11111111;
        bs[27] = (byte)0b11111111;
        // 8#门数据
        bs[28] = (byte)0b11111111;
        bs[29] = (byte)0b11111111;
        bs[30] = (byte)0b11111111;
        bs[31] = (byte)0b11111111;

        return bs;
    }

    // 重庆6号线TCMS与空调通信协议1
    public static byte[] getDataNo4_1() {
        byte[] bs = new byte[32];

        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b11111111;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b11111111;
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b11111111;
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b11111111;
        bs[10] = (byte)0b11111111;
        bs[11] = (byte)0b11111111;
        bs[12] = (byte)0b11111111;

        bs[13] = (byte)0b01111111;
        bs[14] = (byte)0b00111111;
        bs[15] = (byte)0b00000000;
        return bs;
    }

    // 重庆6号线TCMS与空调通信协议2
    public static byte[] getDataNo4_2() {
        byte[] bs = new byte[25];

        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b11111111;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b11111111;
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b11111111;
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b11111111;
        bs[10] = (byte)0b11111111;
        bs[11] = (byte)0b11111111;
        bs[12] = (byte)0b11111111;

        bs[13] = (byte)0b00111111;
        bs[14] = (byte)0b11001111;
        bs[15] = (byte)0b11111111;
        bs[16] = (byte)0b00001110;
        bs[17] = (byte)0b00000111;
        bs[18] = (byte)0b11111111;
        bs[19] = (byte)0b11111111;
        bs[20] = (byte)0b11000000;

        bs[21] = (byte)0b11111111;
        bs[22] = (byte)0b11011111;
        bs[23] = (byte)0b11011111;
        bs[24] = (byte)0b00111111;
        return bs;
    }

    // 重庆6号线TCMS与铁科制动通信协议1
    public static byte[] getDataNo5_1() {
        byte[] bs = new byte[16];

        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b11111111;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b11111111;
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b11111111;
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b11111111;
        bs[10] = (byte)0b11011111;
        bs[11] = (byte)0b00000111;
        bs[12] = (byte)0b11111111;
        bs[13] = (byte)0b11111111;

        bs[14] = (byte)0b00000011;
        bs[15] = (byte)0b00000000;
        return bs;
    }

    // 重庆6号线TCMS与铁科制动通信协议2
    public static byte[] getDataNo5_2() {
        byte[] bs = new byte[32];

        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b11111111;
        bs[2] = (byte)0b11111111;
        bs[3] = (byte)0b11111111;
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b11111111;
        bs[8] = (byte)0b11111111;
        bs[9] = (byte)0b11111111;

        bs[10] = (byte)0b10110011;
        bs[11] = (byte)0b11110111;
        bs[12] = (byte)0b10011111;
        bs[13] = (byte)0b11101111;

        bs[14] = (byte)0b00000000;

        bs[15] = (byte)0b11111111;
        bs[16] = (byte)0b11111111;
        bs[17] = (byte)0b11111111;
        bs[18] = (byte)0b11111111;
        bs[19] = (byte)0b11111111;
        bs[20] = (byte)0b11111111;
        bs[21] = (byte)0b11111111;
        bs[22] = (byte)0b11111111;
        bs[23] = (byte)0b11111111;
        bs[24] = (byte)0b11111111;
        bs[25] = (byte)0b11111111;
        bs[26] = (byte)0b10001111;
        bs[27] = (byte)0b11111001;
        bs[28] = (byte)0b00000000;
        bs[29] = (byte)0b00010000;
        bs[30] = (byte)0b11111111;
        bs[31] = (byte)0b11111111;
        return bs;
    }

    // 重庆6号线TCMS与铁科制动通信协议3
    public static byte[] getDataNo5_3() {
        byte[] bs = new byte[8];

        bs[0] = (byte)0b10010011;
        bs[1] = (byte)0b00111111;
        bs[2] = (byte)0b10000000;
        bs[3] = (byte)0b11111111;
        bs[4] = (byte)0b11111111;
        bs[5] = (byte)0b11111111;
        bs[6] = (byte)0b11111111;
        bs[7] = (byte)0b00000000;
        return bs;
    }
 // 重庆6号线TCMS与铁科制动通信协议4
    public static byte[] getDataNo5_4() {
        byte[] bs = new byte[4];
        bs[0] = (byte)0b11111111;
        bs[1] = (byte)0b11111111;
        bs[2] = (byte)0b00000011;
        bs[3] = (byte)0b00000000;
        return bs;
    }

}
