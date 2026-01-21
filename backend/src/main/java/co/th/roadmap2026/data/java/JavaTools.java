package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaTools {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("tools", "Developer Tools", "เครื่องมือ")
                .withLevel("MID")
                .add(RoadmapTopic.create("git", "Git", "Version Control").withLevel("JUNIOR")
                        .withContent("""
                                # Git
                                ## 🎯 คำสั่งพื้นฐาน
                                ```bash
                                git init              # สร้าง repo
                                git clone <url>       # Clone repo
                                git add .             # Stage changes
                                git commit -m "msg"   # Commit
                                git push              # Push to remote
                                git pull              # Pull updates
                                ```
                                
                                ## 📌 Branching
                                ```bash
                                git branch feature    # สร้าง branch
                                git checkout feature  # สลับ branch
                                git merge feature     # Merge branch
                                ```
                                """))
                .add(RoadmapTopic.create("docker", "Docker", "Containers").withLevel("MID")
                        .withContent("""
                                # Docker
                                ## 🎯 คืออะไร?
                                - รัน app ใน containers (แยกจาก host)
                                
                                ## 💡 คำสั่งพื้นฐาน
                                ```bash
                                docker build -t myapp .     # Build image
                                docker run -p 8080:8080 myapp  # Run container
                                docker ps                   # List containers
                                docker compose up           # Run with compose
                                ```
                                """))
                .add(RoadmapTopic.create("ide", "IDEs", "IDEs").withLevel("JUNIOR")
                        .withContent("""
                                # IDEs for Java
                                ## 🎯 แนะนำ
                                - **IntelliJ IDEA**: ยอดนิยม, ฉลาด, ฟีเจอร์เยอะ
                                - **Eclipse**: Open source, เก่าแก่, plugins เยอะ
                                - **VS Code**: เบา, ใช้ Extension Pack for Java
                                """))
                .add(RoadmapTopic.create("jira", "Jira", "Project Management").withLevel("JUNIOR")
                        .withContent("""
                                # Jira
                                ## 🎯 คืออะไร?
                                - เครื่องมือบริหารจัดการ Project (Agile/Scrum)
                                - Tracking tasks, bugs, features
                                """))
                .add(RoadmapTopic.create("linux", "Linux Basics", "Linux").withLevel("MID")
                        .withContent("""
                                # Linux Basics
                                ## 🎯 คำสั่งสำคัญ
                                ```bash
                                ls -la          # ดูไฟล์ทั้งหมด
                                cd /path        # เปลียน directory
                                grep "text" file # ค้นหาข้อความ
                                chmod +x file   # เปลี่ยน permission
                                ps aux          # ดู processes
                                kill <pid>      # ปิด process
                                ssh user@host   # Remote login
                                ```
                                """));
    }
}
