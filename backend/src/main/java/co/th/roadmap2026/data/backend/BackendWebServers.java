package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendWebServers {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("webservers", "Web Servers", "Web Server")
                .withLevel("MID")
                .add(RoadmapTopic.create("nginx", "Nginx", "Nginx").withLevel("MID"))
                .add(RoadmapTopic.create("apache", "Apache", "Apache").withLevel("MID"))
                .add(RoadmapTopic.create("caddy", "Caddy", "Caddy").withLevel("MID"));
    }
}
