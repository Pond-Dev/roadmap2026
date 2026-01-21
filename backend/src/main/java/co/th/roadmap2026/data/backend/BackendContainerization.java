package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendContainerization {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("containerization", "Containerization", "Containers")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("docker", "Docker", "Docker").withLevel("MID"))
                .add(RoadmapTopic.create("kubernetes", "Kubernetes", "K8s").withLevel("SENIOR"))
                .add(RoadmapTopic.create("lxc", "LXC", "LXC").withLevel("EXPERT"));
    }
}
