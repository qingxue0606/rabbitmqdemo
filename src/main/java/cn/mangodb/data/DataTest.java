 package cn.mangodb.data;

 /**
 * @author xiang
 * @date 2019/01/07
 */
public class DataTest {
    //重庆6号线TCMS与DCU的通信协议 - 故障
    public static byte[] getDataNo1() {
        byte[] bs=new byte[10];
        bs[0]=(byte)0b01011111;
        bs[1]=(byte)0b01000101;
        bs[2]=(byte)0b11111111;
        bs[3]=(byte)0b11111111;
        bs[4]=(byte)0b11111111;
        bs[5]=(byte)0b00001111;
        bs[6]=(byte)0b11111111;
        bs[7]=(byte)0b00001111;
        bs[8]=(byte)0b11111111;
        bs[9]=(byte)0b00000011;
        return bs;
    }
    //重庆6号线TCMS与PIS通信协议
    public static byte[] getDataNo2() {
        byte[] bs=new byte[22];
        bs[0]=(byte)0b11111111;
        bs[1]=(byte)0b11111101;
        bs[2]=(byte)0b11111111;
        bs[3]=(byte)0b11111111;
        bs[4]=(byte)0b11111111;
        bs[5]=(byte)0b11111111;
        bs[6]=(byte)0b11111111;
        bs[7]=(byte)0b00001111;
        bs[8]=(byte)0b11111111;
        bs[9]=(byte)0b11111111;
        bs[10]=(byte)0b11111111;
        bs[11]=(byte)0b11111111;
        bs[12]=(byte)0b11111111;
        bs[13]=(byte)0b11111111;
        bs[14]=(byte)0b11111111;
        bs[15]=(byte)0b11111111;
        bs[16]=(byte)0b11111111;
        bs[17]=(byte)0b11111111;
        bs[18]=(byte)0b11111111;
        bs[19]=(byte)0b11111111;
        bs[20]=(byte)0b11111111;
        bs[21]=(byte)0b11111111;
        return bs;
    }
    
}
