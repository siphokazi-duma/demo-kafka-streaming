package za.co.duma.demo_kafka_streaming.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "input-topic", groupId = "za.co.duma")
    public void consume(String message,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID)List<Integer> partitions,
                        @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        LOGGER.info("Consumed message: {}", message);
        LOGGER.info("With partition-offset='{}'", partitions.get(0)+"-"+offsets.get(0));
    }
}
