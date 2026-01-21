package co.th.roadmap2026.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class RoadmapTopic {
    private String id;
    private String label;
    private String description;
    private String content;
    private String status;
    private String level; // JUNIOR, MID, SENIOR, EXPERT
    private List<RoadmapTopic> children = new ArrayList<>();

    public RoadmapTopic(String id, String label, String description) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.content = "";
        this.status = "PENDING";
        this.level = "JUNIOR";
    }

    public static RoadmapTopic create(String id, String label, String description) {
        return new RoadmapTopic(id, label, description);
    }

    public RoadmapTopic add(RoadmapTopic child) {
        this.children.add(child);
        return this;
    }

    public RoadmapTopic withContent(String content) {
        this.content = content;
        return this;
    }

    public RoadmapTopic withLevel(String level) {
        this.level = level;
        return this;
    }

    public void addChild(RoadmapTopic child) {
        this.children.add(child);
    }

    public RoadmapTopic toStructure() {
        RoadmapTopic structure = new RoadmapTopic(this.id, this.label, this.description);
        structure.setStatus(this.status);
        structure.setLevel(this.level);
        // Do not copy content
        for (RoadmapTopic child : this.children) {
            structure.addChild(child.toStructure());
        }
        return structure;
    }
}
