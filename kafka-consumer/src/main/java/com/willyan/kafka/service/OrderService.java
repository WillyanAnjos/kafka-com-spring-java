package com.willyan.kafka.service;

import com.willyan.kafka.record.OrderRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @KafkaListener(topicPartitions = @TopicPartition(topic = "willyan-order-processed", partitions = {"1"}), containerFactory = "orderKafkaListenerContainerFactory")
    public void orderListener(OrderRecord order) {
        System.out.println("Order received: " + order.name());
    }
}
