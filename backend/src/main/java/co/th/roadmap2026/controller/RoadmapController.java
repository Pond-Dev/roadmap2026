package co.th.roadmap2026.controller;

import co.th.roadmap2026.model.RoadmapNode;
import co.th.roadmap2026.service.RoadmapService;
import org.springframework.web.bind.annotation.GetMapping;
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
    public RoadmapNode getJavaRoadmap() {
        return roadmapService.getJavaRoadmap();
    }
}
