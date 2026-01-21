package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendDesignPatterns {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("patterns", "Design & Development Principles", "หลักการออกแบบ")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("solid", "SOLID", "SOLID").withLevel("SENIOR"))
                .add(RoadmapTopic.create("kiss", "KISS", "Keep It Simple").withLevel("MID"))
                .add(RoadmapTopic.create("yagni", "YAGNI", "You Aren't Gonna Need It").withLevel("MID"))
                .add(RoadmapTopic.create("dry", "DRY", "Don't Repeat Yourself").withLevel("MID"))
                .add(RoadmapTopic.create("gof", "GoF Design Patterns", "Design Patterns").withLevel("SENIOR"))
                .add(RoadmapTopic.create("ddd", "Domain-Driven Design", "DDD").withLevel("EXPERT"))
                .add(RoadmapTopic.create("tdd", "Test-Driven Development", "TDD").withLevel("SENIOR"));
    }
}
