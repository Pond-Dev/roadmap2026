package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendVCS {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("vcs", "Version Control", "Version Control")
                .withLevel("JUNIOR")
                .add(RoadmapTopic.create("git", "Git", "Git").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("github", "GitHub", "GitHub").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("gitlab", "GitLab", "GitLab").withLevel("JUNIOR"));
    }
}
