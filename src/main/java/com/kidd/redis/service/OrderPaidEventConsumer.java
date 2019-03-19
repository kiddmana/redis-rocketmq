package com.kidd.redis.service;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import com.kidd.redis.domain.OrderPaidEvent;

/**
 * 
 * @author wangding
 * 时间：2019年3月19日 上午10:09:39
 * 传送对象的类
 */
@Service
@RocketMQMessageListener(topic = "${rocketmq.orderTopic}", consumerGroup = "order-paid-consumer")
public class OrderPaidEventConsumer implements RocketMQListener<OrderPaidEvent>{

  @Override
  public void onMessage(OrderPaidEvent message) {
    System.out.printf("------- OrderPaidEventConsumer received: %s \n", message);
  }

}
