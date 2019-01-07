package cn.mangodb.message;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.mangodb.entity.Boy;
import cn.mangodb.util.ByteUtil;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * @author xiang
 * @date 2019/01/04
 */
@Component
@EnableScheduling
public class HelloSender {
    @Autowired
    private AmqpTemplate template;
    
    //@Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        template.convertAndSend("xiang","xiang.123", "hello,rabbit~");
    }
    
    //@Scheduled(fixedDelay = 2000, initialDelay = 2000)
    public void sendArray()   {
        //(数据类型)(最小值+Math.random()*(最大值-最小值+1))
        byte[] bytes=new byte[10];
        for(int i=0;i<bytes.length;i++) {
            byte b=(byte)(-128+Math.random()*(127+128+1));
            bytes[i]=b;
            System.out.print(""+i+ Arrays.toString(ByteUtil.getBooleanArray(b)) +" ");
        }
        
        System.out.println();

        template.convertAndSend("xiang","xiang.123", bytes);
    }
    
    //@Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void sendObject() throws Exception {
        Boy boy=new Boy(15,"tom");
        byte[] bytes=getBytesFromObject(boy);
        System.out.println(bytes);
        template.convertAndSend("xiang","xiang.123", bytes);
    }
    
  //对象转化为字节码
    public  byte[] getBytesFromObject(Serializable obj) throws Exception {
        if (obj == null) {
            return null;
        }
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(obj);
        return bo.toByteArray();
    }


}
