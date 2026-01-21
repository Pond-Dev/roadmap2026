package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendTesting {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("testing", "Testing", "การทดสอบ")
                .withLevel("MID")
                .add(RoadmapTopic.create("unit", "Unit Testing", "Unit").withLevel("MID"))
                .add(RoadmapTopic.create("integration", "Integration Testing", "Integration").withLevel("MID"))
                .add(RoadmapTopic.create("functional", "Functional Testing", "Functional").withLevel("SENIOR"))
                .add(RoadmapTopic.create("e2e", "E2E Testing", "E2E").withLevel("SENIOR"));
    }
}
