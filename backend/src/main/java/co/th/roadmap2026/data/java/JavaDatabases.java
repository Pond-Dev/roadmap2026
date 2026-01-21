package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaDatabases {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("databases", "Databases", "ฐานข้อมูล")
                .withLevel("MID")
                .add(RoadmapTopic.create("jdbc", "JDBC", "JDBC").withLevel("MID")
                        .withContent("""
                                # JDBC
                                ## 🎯 Low-level Database Access
                                ```java
                                Connection conn = DriverManager.getConnection(url);
                                PreparedStatement ps = conn.prepareStatement(
                                    "SELECT * FROM users WHERE id = ?");
                                ps.setLong(1, userId);
                                ResultSet rs = ps.executeQuery();
                                ```
                                """))
                .add(RoadmapTopic.create("postgres", "PostgreSQL", "PostgreSQL").withLevel("MID")
                        .withContent("""
                                # PostgreSQL
                                ## 🎯 ทำไมเลือก?
                                - Open-source, แข็งแกร่ง, มาตรฐานสูง
                                - ACID compliant
                                - JSON support (JSONB)
                                - Full-text search
                                """))
                .add(RoadmapTopic.create("mysql", "MySQL", "MySQL").withLevel("MID")
                        .withContent("""
                                # MySQL
                                ## 🎯 ทำไมเลือก?
                                - นิยมสูงที่สุด, ใช้ง่าย
                                - เหมาะกับงาน read-heavy
                                - Community ใหญ่
                                """))
                .add(RoadmapTopic.create("mongodb", "MongoDB", "MongoDB").withLevel("SENIOR")
                        .withContent("""
                                # MongoDB
                                ## 🎯 NoSQL Document Database
                                - เก็บเป็น JSON documents
                                - Schema flexible
                                - เหมาะกับข้อมูลที่โครงสร้างเปลี่ยนบ่อย
                                """))
                .add(RoadmapTopic.create("redis", "Redis", "Redis").withLevel("SENIOR")
                        .withContent("""
                                # Redis
                                ## 🎯 In-Memory Data Store
                                - เร็วมาก! (microseconds)
                                
                                ## 📌 ใช้ทำอะไร?
                                - Caching
                                - Session storage
                                - Rate limiting
                                - Pub/Sub messaging
                                """));
    }
}
