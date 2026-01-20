package co.th.roadmap2026.model;

import java.util.ArrayList;
import java.util.List;

public class RoadmapNode {
    private String id;
    private String label;
    private String description;
    private String status; // "LOCKED", "PENDING", "COMPLETED" - for future use
    private List<RoadmapNode> children = new ArrayList<>();

    public RoadmapNode(String id, String label, String description) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.status = "PENDING";
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public List<RoadmapNode> getChildren() { return children; }
    public void setChildren(List<RoadmapNode> children) { this.children = children; }
    
    public void addChild(RoadmapNode child) {
        this.children.add(child);
    }
}
