package com.willyan.kafka.service;

import com.willyan.kafka.record.OrderRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OrderService {

    private final KafkaTemplate<String, OrderRecord> kafkaTemplateOrder;


    public OrderService(KafkaTemplate<String, OrderRecord> kafkaTemplateOrder) {
        this.kafkaTemplateOrder = kafkaTemplateOrder;
    }

    @SuppressWarnings("null")
    public void sendMessageOrder(OrderRecord order) {
        kafkaTemplateOrder.send("willyan-order-processed", 1,null, order);
    }
}
