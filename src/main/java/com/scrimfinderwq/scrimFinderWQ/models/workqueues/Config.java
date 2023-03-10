package com.scrimfinderwq.scrimFinderWQ.models.workqueues;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scrimfinderwq.scrimFinderWQ.models.workqueues.Consumer;
import com.scrimfinderwq.scrimFinderWQ.models.workqueues.Producer;

@Configuration
public class Config {

    @Value("${queue.name}")
    private String queueName;

    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    public Producer producer() {
        return new Producer();
    }

    @Bean
    public Consumer consumer1() {
        return new Consumer(1);
    }

    @Bean
    public Consumer consumer2() {
        return new Consumer(2);
    }

}