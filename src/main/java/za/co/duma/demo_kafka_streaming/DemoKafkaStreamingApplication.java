package za.co.duma.demo_kafka_streaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class DemoKafkaStreamingApplication implements CommandLineRunner {
	private static final String TOPIC= "input-topic";

	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoKafkaStreamingApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		for(int i = 1; i<11; i++){
			kafkaTemplate.send(TOPIC,"Message-"+ i);
		}
	}
}
