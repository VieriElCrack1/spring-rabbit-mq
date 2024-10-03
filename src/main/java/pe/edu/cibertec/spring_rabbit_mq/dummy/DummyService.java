package pe.edu.cibertec.spring_rabbit_mq.dummy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.spring_rabbit_mq.publisher.Publisher;

@Slf4j
@Service
public class DummyService {

    @Autowired
    private Publisher publisher;

    public void sendToRabbit(String message) {
        //Data d = new Data(12, message);
        log.info("Message '{}' will be send ", message);
        publisher.send(message);
    }

}
