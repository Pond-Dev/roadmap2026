package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendCaching {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("caching", "Caching", "การ Cache")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("cdn", "CDN", "CDN").withLevel("SENIOR"))
                .add(RoadmapTopic.create("server-side", "Server-side Caching", "Server Cache").withLevel("SENIOR"))
                .add(RoadmapTopic.create("redis-cache", "Redis", "Redis").withLevel("SENIOR"))
                .add(RoadmapTopic.create("memcached", "Memcached", "Memcached").withLevel("SENIOR"));
    }
}
