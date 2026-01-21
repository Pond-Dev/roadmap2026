package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendCICD {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("cicd", "CI/CD", "Continuous Integration/Deployment")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("github-actions", "GitHub Actions", "GitHub Actions").withLevel("MID"))
                .add(RoadmapTopic.create("jenkins", "Jenkins", "Jenkins").withLevel("SENIOR"))
                .add(RoadmapTopic.create("gitlab-ci", "GitLab CI", "GitLab CI").withLevel("SENIOR"))
                .add(RoadmapTopic.create("circle-ci", "CircleCI", "CircleCI").withLevel("SENIOR"));
    }
}
