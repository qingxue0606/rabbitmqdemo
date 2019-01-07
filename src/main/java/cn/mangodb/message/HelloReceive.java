package cn.mangodb.message;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import cn.mangodb.entity.Boy;

/**
* @author xiang
* @date 2019/01/04
*/
@Component
public class HelloReceive {
    //@RabbitListener(queues = "xiangQueue") // 监听器监听指定的Queue
    public void process(String str) {

        System.out.println("Receive:" + str);
    }
    
    //@RabbitListener(queues = "xiangQueue") // 监听器监听指定的Queue
    public void processBites(byte[] bytes) {
        System.out.println("HelloReceive.processBites()");
        System.out.println(Arrays.toString(bytes));
    }
    
    
    public void processCObjcet(byte[] bytes) throws Exception {
        System.out.println(bytes);
      //字节码转化为对象
        Boy boy1=(Boy) getObjectFromBytes(bytes);
        System.out.println(boy1);
        System.out.println("messages ："+boy1.toString());
        System.out.println(Thread.currentThread().getName()+"接收到来自topic.message队列的消息: "+boy1);

        
    }
  //字节码转化为对象
    public  Object getObjectFromBytes(byte[] objBytes) throws Exception {
        if (objBytes == null || objBytes.length == 0) {
            return null;
        }
        ByteArrayInputStream bi = new ByteArrayInputStream(objBytes);
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }

    
    
    
    
}
