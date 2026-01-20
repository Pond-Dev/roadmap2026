package co.th.roadmap2026.service;

import co.th.roadmap2026.model.RoadmapNode;
import org.springframework.stereotype.Service;

@Service
public class RoadmapService {

    public RoadmapNode getJavaRoadmap() {
        // Root Node
        RoadmapNode root = new RoadmapNode("java", "Java Developer", "The ultimate guide to becoming a Java Developer.");

        // 1. Basics
        RoadmapNode basics = new RoadmapNode("basics", "Java Basics", "Learn the syntax and basic concepts.");
        basics.addChild(new RoadmapNode("variables", "Variables", "Containers for storing data values."));
        basics.addChild(new RoadmapNode("datatypes", "Data Types", "int, double, boolean, etc."));
        basics.addChild(new RoadmapNode("control-flow", "Control Flow", "if/else, loops, switch."));
        root.addChild(basics);

        // 2. OOP
        RoadmapNode oop = new RoadmapNode("oop", "Object Oriented Programming", "The core paradigm of Java.");
        oop.addChild(new RoadmapNode("classes", "Classes & Objects", "Blueprints and instances."));
        oop.addChild(new RoadmapNode("inheritance", "Inheritance", "Reusing code from parent classes."));
        oop.addChild(new RoadmapNode("interfaces", "Interfaces", "Contracts for classes."));
        root.addChild(oop);

        // 3. Advanced
        RoadmapNode advanced = new RoadmapNode("advanced", "Advanced Java", "Mastering the language.");
        advanced.addChild(new RoadmapNode("collections", "Collections Framework", "List, Set, Map."));
        advanced.addChild(new RoadmapNode("streams", "Streams API", "Functional-style operations on streams of elements."));
        advanced.addChild(new RoadmapNode("concurrency", "Concurrency", "Threads and capitalization."));
        root.addChild(advanced);

        return root;
    }
}
