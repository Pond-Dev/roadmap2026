package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaJVM {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("jvm", "JVM Internals", "JVM")
                .withLevel("EXPERT")
                .add(RoadmapTopic.create("memory", "Memory Management", "Memory").withLevel("EXPERT")
                        .withContent("""
                                # JVM Memory Management
                                ## 🎯 Memory Areas
                                - **Heap**: เก็บ objects (Young Gen, Old Gen)
                                - **Stack**: เก็บ local variables, method calls
                                - **Metaspace**: เก็บ class metadata (Java 8+)
                                
                                ## 💡 Heap Structure
                                ```
                                Heap
                                ├── Young Generation
                                │   ├── Eden Space (new objects)
                                │   ├── Survivor 0
                                │   └── Survivor 1
                                └── Old Generation
                                ```
                                
                                ## 📌 JVM Options
                                - `-Xms`: Initial heap size
                                - `-Xmx`: Max heap size
                                - `-XX:MetaspaceSize`: Metaspace size
                                """))
                .add(RoadmapTopic.create("gc", "Garbage Collection", "GC").withLevel("EXPERT")
                        .withContent("""
                                # Garbage Collection
                                ## 🎯 คืออะไร?
                                - กระบวนการลบ objects ที่ไม่ได้ใช้แล้วอัตโนมัติ
                                
                                ## 📌 GC Types
                                - **Serial GC**: Single thread, เหมาะกับ app เล็ก
                                - **Parallel GC**: Multi-thread, default ใน Java 8
                                - **G1 GC**: Low latency, default Java 9+
                                - **ZGC**: Ultra-low latency, Java 11+
                                
                                ## 💡 GC Tuning Options
                                ```bash
                                -XX:+UseG1GC           # ใช้ G1 GC
                                -XX:MaxGCPauseMillis=200
                                -XX:+PrintGCDetails    # Debug
                                ```
                                """))
                .add(RoadmapTopic.create("classloader", "ClassLoader", "ClassLoader").withLevel("EXPERT")
                        .withContent("""
                                # ClassLoader
                                ## 🎯 คืออะไร?
                                - โหลด .class files เข้า JVM
                                
                                ## 📌 ClassLoader Hierarchy
                                ```
                                Bootstrap ClassLoader (JRE classes)
                                └── Platform ClassLoader (Java 9+)
                                    └── Application ClassLoader (your code)
                                        └── Custom ClassLoaders
                                ```
                                
                                ## 💡 Delegation Model
                                - ถาม parent ก่อน, ถ้า parent โหลดไม่ได้ค่อยโหลดเอง
                                """))
                .add(RoadmapTopic.create("jit", "JIT Compiler", "JIT").withLevel("EXPERT")
                        .withContent("""
                                # JIT Compiler
                                ## 🎯 คืออะไร?
                                - Just-In-Time: คอมไพล์ bytecode เป็น native code ขณะรัน
                                
                                ## 📌 ทำไมต้อง JIT?
                                - Bytecode ช้า → JIT แปลงเป็น native code เร็วขึ้น
                                - Hot spots: code ที่ถูกเรียกบ่อยจะถูก optimize
                                
                                ## 💡 Tiered Compilation
                                - Level 0: Interpreter
                                - Level 1-3: C1 Compiler (fast compile)
                                - Level 4: C2 Compiler (optimized)
                                
                                ## 📌 JVM Options
                                ```bash
                                -XX:+TieredCompilation  # default
                                -XX:CompileThreshold=10000
                                ```
                                """));
    }
}
