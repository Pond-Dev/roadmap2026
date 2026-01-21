package co.th.roadmap2026.controller;

import co.th.roadmap2026.model.RoadmapTopic;
import co.th.roadmap2026.service.RoadmapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roadmaps")
public class RoadmapController {

    private final RoadmapService roadmapService;

    public RoadmapController(RoadmapService roadmapService) {
        this.roadmapService = roadmapService;
    }

    @GetMapping("/java")
    public RoadmapTopic getJavaRoadmap() {
        return roadmapService.getJavaRoadmap();
    }

    @GetMapping("/backend")
    public RoadmapTopic getBackendRoadmap() {
        return roadmapService.getBackendRoadmap();
    }

    @GetMapping("/{roadmapId}/structure")
    public RoadmapTopic getRoadmapStructure(@PathVariable String roadmapId) {
        return roadmapService.getRoadmapStructure(roadmapId);
    }

    @GetMapping("/{roadmapId}/topics/{topicId}")
    public RoadmapTopic getTopicContent(@PathVariable String roadmapId, @PathVariable String topicId) {
        return roadmapService.getTopicContent(roadmapId, topicId);
    }
}
