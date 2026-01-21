package co.th.roadmap2026.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoadmapTopic {
    private String id;
    private String label;
    private String description;
    private String content;
    private String status;
    private String level; 
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
        for (RoadmapTopic child : this.children) {
            structure.addChild(child.toStructure());
        }
        return structure;
    }
}
