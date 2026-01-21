package co.th.roadmap2026.service;

import co.th.roadmap2026.component.RoadmapDataLoader;
import co.th.roadmap2026.model.RoadmapTopic;
import org.springframework.stereotype.Service;

@Service
public class RoadmapService {

    private final RoadmapDataLoader roadmapDataLoader;

    public RoadmapService(RoadmapDataLoader roadmapDataLoader) {
        this.roadmapDataLoader = roadmapDataLoader;
    }

    public RoadmapTopic getJavaRoadmap() {
        return roadmapDataLoader.getRoadmap("java");
    }

    public RoadmapTopic getBackendRoadmap() {
        return roadmapDataLoader.getRoadmap("backend");
    }

    public RoadmapTopic getRoadmapStructure(String roadmapId) {
        RoadmapTopic roadmap = switch (roadmapId) {
            case "java" -> getJavaRoadmap();
            case "backend" -> getBackendRoadmap();
            default -> null;
        };
        return roadmap != null ? roadmap.toStructure() : null;
    }

    public RoadmapTopic getTopicContent(String roadmapId, String nodeId) {
        RoadmapTopic roadmap = switch (roadmapId) {
            case "java" -> getJavaRoadmap();
            case "backend" -> getBackendRoadmap();
            default -> null;
        };

        if (roadmap == null) return null;
        return findNode(roadmap, nodeId);
    }

    private RoadmapTopic findNode(RoadmapTopic current, String nodeId) {
        if (current.getId().equals(nodeId)) {
            return current;
        }
        for (RoadmapTopic child : current.getChildren()) {
            RoadmapTopic found = findNode(child, nodeId);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
}
