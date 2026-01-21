package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendOS {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("os", "OS and General Knowledge", "ระบบปฏิบัติการ")
                .withLevel("JUNIOR")
                .add(RoadmapTopic.create("terminal", "Terminal Usage", "Terminal").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("os-works", "How OSs work", "OS").withLevel("JUNIOR"))
                .add(RoadmapTopic.create("process", "Process Management", "Process").withLevel("MID"))
                .add(RoadmapTopic.create("threads-os", "Threads & Concurrency", "Threads").withLevel("MID"))
                .add(RoadmapTopic.create("memory-os", "Memory Management", "Memory").withLevel("MID"))
                .add(RoadmapTopic.create("io", "I/O Management", "I/O").withLevel("MID"))
                .add(RoadmapTopic.create("posix", "POSIX Basics", "POSIX").withLevel("MID"))
                .add(RoadmapTopic.create("networking", "Networking Concepts", "Networking").withLevel("MID"));
    }
}
