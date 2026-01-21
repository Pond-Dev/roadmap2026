package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendArchitecture {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("architecture", "Architectural Patterns", "สถาปัตยกรรม")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("monolithic", "Monolithic Apps", "Monolith").withLevel("MID"))
                .add(RoadmapTopic.create("microservices", "Microservices", "Microservices").withLevel("SENIOR"))
                .add(RoadmapTopic.create("soa", "SOA", "SOA").withLevel("SENIOR"))
                .add(RoadmapTopic.create("serverless", "Serverless", "Serverless").withLevel("SENIOR"))
                .add(RoadmapTopic.create("service-mesh", "Service Mesh", "Istio/Linkerd").withLevel("EXPERT"));
    }
}
