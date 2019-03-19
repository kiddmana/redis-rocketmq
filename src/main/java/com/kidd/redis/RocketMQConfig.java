package com.kidd.redis;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RocketMQConfig {
  private String namesrvAddr;

  @Value("${spring.application.name}")
  private String consumerGroupName;

  
//  @Bean
//  public RocketMQTemplate rocketMQTemplate(){
//    DefaultMQProducer producer = new DefaultMQProducer();
//    producer.setNamesrvAddr(namesrvAddr);
//    producer.setInstanceName(instanceName);
//    producer.setVipChannelEnabled(false);
//  }
}
