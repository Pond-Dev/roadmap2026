package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendDatabases {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("databases", "Databases", "ฐานข้อมูล")
                .withLevel("MID")
                .add(RoadmapTopic.create("relational", "Relational Databases", "SQL DBs")
                        .withLevel("MID")
                        .add(RoadmapTopic.create("postgresql", "PostgreSQL", "PostgreSQL").withLevel("MID"))
                        .add(RoadmapTopic.create("mysql", "MySQL", "MySQL").withLevel("MID")))
                .add(RoadmapTopic.create("nosql", "NoSQL Databases", "NoSQL")
                        .withLevel("MID")
                        .add(RoadmapTopic.create("mongodb", "MongoDB", "MongoDB").withLevel("MID"))
                        .add(RoadmapTopic.create("redis", "Redis", "Redis").withLevel("MID"))
                        .add(RoadmapTopic.create("elasticsearch", "Elasticsearch", "Search").withLevel("SENIOR")))
                .add(RoadmapTopic.create("orm", "ORMs", "ORM").withLevel("MID"))
                .add(RoadmapTopic.create("acid", "ACID", "ACID").withLevel("MID"))
                .add(RoadmapTopic.create("transactions", "Transactions", "Transactions").withLevel("MID"))
                .add(RoadmapTopic.create("n+1", "N+1 Problem", "N+1").withLevel("MID"))
                .add(RoadmapTopic.create("normalization", "Normalization", "Normalization").withLevel("MID"))
                .add(RoadmapTopic.create("indexes", "Indexes", "Indexes").withLevel("MID"))
                .add(RoadmapTopic.create("replication", "Replication", "Replication").withLevel("SENIOR"))
                .add(RoadmapTopic.create("sharding", "Sharding", "Sharding").withLevel("EXPERT"));
    }
}
