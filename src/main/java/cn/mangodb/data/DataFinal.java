 package cn.mangodb.data;

 /**
 * @author xiang
 * @date 2019/01/08
 */
public class DataFinal {
    public static byte[] getDataFinalNO1(){
        byte[] result=new byte[234];
        result[0]=0b00000001;
        //帧标识
        result[1]=0x3C;
        //MVB 模块工作状态 0x02：业务状态
        result[2]=0x02;
        //MVB 模块状态信息 MVB 模块工作在业务状态时：
        //bit0~bit1 表示发送状态：
        //0：表示正常发送状态；
        //bit0~bit1 表示发送状态：
        //0：表示正常发送状态；
        result[3]=0b00000000;
        //Byte4~Byte7 总帧数
        result[4]=0b00000000;
        result[5]=0b00000000;
        result[6]=0b00000000;
        result[7]=0b00000000;
        //Byte8~Byte9 总错误帧数
        result[8]=0b00000000;
        result[9]=0b00000000;
        //Byte10~Byte11 A 线错误帧数
        //Byte12~Byte13 B线错误帧数
        //Byte14~Byte15 预留
        //Byte16~Byte17 预留
        result[10]=0b00000000;
        result[11]=0b00000000;
        result[12]=0b00000000;
        result[13]=0b00000000;
        result[14]=0b00000000;
        result[15]=0b00000000;
        result[16]=0b00000000;
        result[17]=0b00000000;
        //第一个宿端口数据Byte18~Byte53
        byte[] dataHost1=DataHost.getDataHostNO1(DataTest.getDataNo3_1());
        for(int i=0;i<dataHost1.length;i++) {
            result[18+i]=dataHost1[i];
        }
        //Byte54~Byte89 第二个宿端口数据
        byte[] dataHost2=DataHost.getDataHostNO1(DataTest.getDataNo3_2());
        for(int i=0;i<dataHost2.length;i++) {
            result[54+i]=dataHost2[i];
        }
        //Byte90~Byte125 第三个宿端口数据
        byte[] dataHost3=DataHost.getDataHostNO1(DataTest.getDataNo3_3());
        for(int i=0;i<dataHost3.length;i++) {
            result[90+i]=dataHost3[i];
        }
        //Byte126~Byte161 第四个宿端口数据
        byte[] dataHost4=DataHost.getDataHostNO1(DataTest.getDataNo4_1());
        for(int i=0;i<dataHost4.length;i++) {
            result[126+i]=dataHost4[i];
        }
        
      //Byte162~Byte197 第五个宿端口数据
        byte[] dataHost5=DataHost.getDataHostNO1(DataTest.getDataNo4_2());
        for(int i=0;i<dataHost5.length;i++) {
            result[162+i]=dataHost5[i];
        }
      //Byte162~Byte197 第五个宿端口数据
        byte[] dataHost6=DataHost.getDataHostNO1(DataTest.getDataNo5_1());
        for(int i=0;i<dataHost6.length;i++) {
            result[198+i]=dataHost6[i];
        }

        return result;
    } 
}
