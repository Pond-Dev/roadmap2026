package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaBuildTools {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("build-tools", "Build Tools", "Build Tools")
                .withLevel("MID")
                .add(RoadmapTopic.create("maven", "Maven", "Maven").withLevel("MID")
                        .withContent("""
                                # Maven
                                - pom.xml structure
                                - Dependencies
                                - Lifecycle phases
                                - Plugins
                                """))
                .add(RoadmapTopic.create("gradle", "Gradle", "Gradle").withLevel("MID")
                        .withContent("""
                                # Gradle
                                ## 🎯 คืออะไร?
                                - Build tool ใช้ Groovy/Kotlin DSL
                                - เร็วกว่า Maven (incremental builds)
                                
                                ## 💡 build.gradle
                                ```groovy
                                plugins {
                                    id 'java'
                                    id 'org.springframework.boot' version '3.0.0'
                                }
                                
                                dependencies {
                                    implementation 'org.springframework.boot:spring-boot-starter-web'
                                    testImplementation 'junit:junit:5.9.0'
                                }
                                ```
                                
                                ## 📌 คำสั่งพื้นฐาน
                                ```bash
                                gradle build     # Build project
                                gradle test      # Run tests
                                gradle run       # Run app
                                gradle clean     # Clean build
                                ```
                                """));
    }
}
