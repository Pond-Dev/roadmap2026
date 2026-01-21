package co.th.roadmap2026.component;

import co.th.roadmap2026.model.RoadmapTopic;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class RoadmapDataLoader {

    private final ObjectMapper objectMapper;
    private final Map<String, RoadmapTopic> roadmaps = new HashMap<>();

    public RoadmapDataLoader() {
        this.objectMapper = new ObjectMapper();
    }

    @PostConstruct
    public void loadData() {
        try {
            // Load Java Roadmap
            ClassPathResource javaResource = new ClassPathResource("roadmaps/java.json");
            if (javaResource.exists()) {
                RoadmapTopic javaRoadmap = objectMapper.readValue(javaResource.getInputStream(), RoadmapTopic.class);
                roadmaps.put("java", javaRoadmap);
                System.out.println("Loaded roadmap: java");
            }

            // Load Backend Roadmap
            ClassPathResource backendResource = new ClassPathResource("roadmaps/backend.json");
            if (backendResource.exists()) {
                RoadmapTopic backendRoadmap = objectMapper.readValue(backendResource.getInputStream(), RoadmapTopic.class);
                roadmaps.put("backend", backendRoadmap);
                System.out.println("Loaded roadmap: backend");
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load roadmap data", e);
        }
    }

    public RoadmapTopic getRoadmap(String id) {
        return roadmaps.get(id);
    }
}
