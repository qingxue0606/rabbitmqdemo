package cn.mangodb.message;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.rabbitmq.client.Channel;
import cn.mangodb.data.DataTest;
import cn.mangodb.util.ByteUtil;

/**
 * @author xiang
 * @date 2019/01/07
 */
@Component
@EnableScheduling
public class SendAndRecevice {
    @Autowired
    private AmqpTemplate template;

    @Scheduled(fixedDelay = 2000, initialDelay = 2000)
    public void sendArray() {
        // (数据类型)(最小值+Math.random()*(最大值-最小值+1))
        byte[] bytes = DataTest.getDataNo1().get("data");

        for (int i = 0; i < bytes.length; i++) {
            System.out.print("" + i + Arrays.toString(ByteUtil.getBooleanArray(bytes[i])) + " ");
        }
        System.out.println();
        template.convertAndSend("xiang", "xiang.123", bytes);

    }

    @RabbitListener(queues = "xiangQueue") // 监听器监听指定的Queue
    public void receiveArray(byte[] bytes, @Headers Map<String, Object> headers, Channel channel) throws IOException {

        System.out.println(Arrays.toString(bytes));
        Long deliveryTag = (Long)headers.get(AmqpHeaders.DELIVERY_TAG);
        // 手动签收
        channel.basicAck(deliveryTag, false);
        // 手动拒绝
        // channel.basicReject(deliveryTag, true);
    }

}
