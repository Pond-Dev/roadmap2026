package co.th.roadmap2026.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class RoadmapNode {
    private String id;
    private String label;
    private String description;
    private String content;
    private String status;
    private String level; // JUNIOR, MID, SENIOR, EXPERT
    private List<RoadmapNode> children = new ArrayList<>();

    public RoadmapNode(String id, String label, String description) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.content = "";
        this.status = "PENDING";
        this.level = "JUNIOR";
    }

    public static RoadmapNode create(String id, String label, String description) {
        return new RoadmapNode(id, label, description);
    }

    public RoadmapNode add(RoadmapNode child) {
        this.children.add(child);
        return this;
    }

    public RoadmapNode withContent(String content) {
        this.content = content;
        return this;
    }

    public RoadmapNode withLevel(String level) {
        this.level = level;
        return this;
    }

    public void addChild(RoadmapNode child) {
        this.children.add(child);
    }
}

