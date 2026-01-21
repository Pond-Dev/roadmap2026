package co.th.roadmap2026.data;

import co.th.roadmap2026.data.backend.*;
import co.th.roadmap2026.model.RoadmapTopic;

public class BackendRoadmapData {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("backend", "Backend Developer", "Complete Backend Developer Roadmap 2026")
                .add(BackendInternet.get())
                .add(BackendFrontendBasics.get())
                .add(BackendOS.get())
                .add(BackendLanguages.get())
                .add(BackendVCS.get())
                .add(BackendDatabases.get())
                .add(BackendAPIs.get())
                .add(BackendCaching.get())
                .add(BackendSecurity.get())
                .add(BackendAuth.get())
                .add(BackendTesting.get())
                .add(BackendCICD.get())
                .add(BackendDesignPatterns.get())
                .add(BackendArchitecture.get())
                .add(BackendMessageBrokers.get())
                .add(BackendContainerization.get())
                .add(BackendWebServers.get())
                .add(BackendScaling.get());
    }
}
