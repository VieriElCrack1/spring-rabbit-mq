package pe.edu.cibertec.spring_rabbit_mq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @RabbitListener(queues = {"${vieri.queue.name}"})
    public void recive(@Payload String message) {
        log.info("Received message {} ", message);
        makeSlow();
    }

    private void makeSlow() {
        try{
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
