package pe.edu.cibertec.spring_rabbit_mq.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("test")
public class DummyController {

    @Autowired
    private DummyService service;

    @GetMapping
    public void testSendMessage() {
        String message = "Message #" + ThreadLocalRandom.current().nextInt();
        service.sendToRabbit(message);
    }

}
