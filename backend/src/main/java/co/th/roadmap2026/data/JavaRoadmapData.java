package co.th.roadmap2026.data;

import co.th.roadmap2026.data.java.*;
import co.th.roadmap2026.model.RoadmapTopic;

public class JavaRoadmapData {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("java", "Java Developer", "Complete Java Developer Roadmap 2026")
                .add(JavaFundamentals.get())
                .add(JavaOOP.get())
                .add(JavaDataStructures.get())
                .add(JavaAlgorithms.get())
                .add(JavaAdvanced.get())
                .add(JavaConcurrency.get())
                .add(JavaJVM.get())
                .add(JavaBuildTools.get())
                .add(JavaTesting.get())
                .add(JavaFrameworks.get())
                .add(JavaDatabases.get())
                .add(JavaTools.get());
    }
}
