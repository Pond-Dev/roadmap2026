package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendInternet {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("internet", "Internet", "พื้นฐาน Internet")
                .withLevel("JUNIOR")
                .add(RoadmapTopic.create("how-internet-works", "How does the Internet work?", "Internet ทำงานยังไง").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("http", "HTTP", "HTTP Protocol").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("browsers", "What is a Browser?", "Browser").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("dns", "DNS", "DNS").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("domain", "Domain Name", "Domain").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("hosting", "Hosting", "Web Hosting").withLevel("JUNIOR"));
    }
}
