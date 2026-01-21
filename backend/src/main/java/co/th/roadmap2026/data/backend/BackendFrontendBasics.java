package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendFrontendBasics {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("frontend-basics", "Frontend Knowledge", "ความรู้ Frontend เบื้องต้น")
                .withLevel("JUNIOR")
                .add(RoadmapTopic.create("html", "HTML Basics", "HTML").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("css", "CSS Basics", "CSS").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("javascript", "JavaScript Basics", "JavaScript").withLevel("JUNIOR"));
    }
}
