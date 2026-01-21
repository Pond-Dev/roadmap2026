package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendScaling {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("scaling", "Building for Scale", "การ Scale")
                .withLevel("EXPERT")
                .add(RoadmapTopic.create("mitigation", "Mitigation Strategies", "Mitigation").withLevel("SENIOR"))
                .add(RoadmapTopic.create("horizontal", "Horizontal Scaling", "Horizontal").withLevel("SENIOR"))
                .add(RoadmapTopic.create("vertical", "Vertical Scaling", "Vertical").withLevel("SENIOR"))
                .add(RoadmapTopic.create("observability", "Observability", "Monitoring").withLevel("SENIOR")
                        .add(RoadmapTopic.create("logging", "Logging", "Logs").withLevel("SENIOR"))
                        .add(RoadmapTopic.create("monitoring", "Monitoring", "Metrics").withLevel("SENIOR"))
                        .add(RoadmapTopic.create("tracing", "Tracing", "Tracing").withLevel("SENIOR")));
    }
}
