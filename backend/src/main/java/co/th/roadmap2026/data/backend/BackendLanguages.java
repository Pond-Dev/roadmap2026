package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendLanguages {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("languages", "Programming Languages", "ภาษาโปรแกรม")
                .withLevel("JUNIOR")
                .add(RoadmapTopic.create("java", "Java", "Java").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("python", "Python", "Python").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("javascript-be", "JavaScript / Node.js", "Node.js").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("go", "Go", "Golang").withLevel("MID"))
                .add(RoadmapTopic.create("rust", "Rust", "Rust").withLevel("SENIOR"));
    }
}
