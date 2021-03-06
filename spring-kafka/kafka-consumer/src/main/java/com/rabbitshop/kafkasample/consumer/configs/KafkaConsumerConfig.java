package com.rabbitshop.kafkasample.consumer.configs;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;


/**
 * SPRING-KAFKA DEFAULT CONFIGS
 *
 * @EnableKafka annotation is required on the configuration class to enable detection of @KafkaListener annotation on spring managed beans.
 * <p>
 * For consuming messages, we need to configure a ConsumerFactory and a KafkaListenerContainerFactory. Once these beans are available in spring bean factory,
 * POJO based consumers can be configured using @KafkaListener annotation.
 */
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Configuration(value = "kafkaConsumerConfig")
@Order(10)
public class KafkaConsumerConfig {

	@Value(value = "${spring.kafka.bootstrap-servers}")
	List<String> bootstrapServers;

	@Value(value = "${spring.kafka.consumer.auto-offset-reset}")
	String autoOffsetReset;

	@Value(value = "${spring.kafka.client-id}")
	String clientId;

	@Value(value = "${spring.kafka.consumer.group-id}")
	String groupId;

	@Value(value = "${kafka.inventory.topic.id:}")
	String topicId;

	@Value(value = "${kafka.inventory.json.trusted.packages}")
	String jsonTrustedPackages;

	@Value(value = "${kafka.inventory.countdown.latch.seconds}")
	int countDownLatchSeconds;

}
