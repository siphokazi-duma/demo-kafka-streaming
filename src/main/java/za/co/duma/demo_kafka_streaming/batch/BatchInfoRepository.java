package za.co.duma.demo_kafka_streaming.batch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchInfoRepository extends JpaRepository<BatchInfo, Long> {
    BatchInfo findByBatchId(String batchId);
}
