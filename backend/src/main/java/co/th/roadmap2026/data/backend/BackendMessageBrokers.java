package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendMessageBrokers {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("message-brokers", "Message Brokers", "Message Queue")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("rabbitmq", "RabbitMQ", "RabbitMQ").withLevel("SENIOR"))
                .add(RoadmapTopic.create("kafka", "Kafka", "Kafka").withLevel("SENIOR"))
                .add(RoadmapTopic.create("sqs", "AWS SQS", "SQS").withLevel("SENIOR"));
    }
}
