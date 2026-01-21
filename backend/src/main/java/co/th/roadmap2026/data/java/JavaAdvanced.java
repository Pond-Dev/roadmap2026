package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaAdvanced {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("advanced", "Advanced Java", "Java ขั้นสูง")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("generics", "Generics", "Generics").withLevel("SENIOR")
                        .withContent("""
                                # Generics
                                - Type Parameters
                                - Bounded Types
                                - Wildcards (?, extends, super)
                                """))
                .add(RoadmapTopic.create("collections", "Collections Framework", "Collections").withLevel("SENIOR")
                        .withContent("""
                                # Collections Framework
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **คืออะไร**: ชุดของ Interfaces และ Classes สำหรับจัดการข้อมูล
                                
                                ## 📌 หมวดหมู่หลัก
                                ### List Interface
                                - ArrayList, LinkedList, Vector
                                
                                ### Set Interface
                                - HashSet, TreeSet, LinkedHashSet
                                
                                ### Map Interface
                                - HashMap, TreeMap, LinkedHashMap
                                
                                ### Queue Interface
                                - LinkedList, PriorityQueue, ArrayDeque
                                
                                ## 💡 เลือกใช้ยังไง?
                                | ความต้องการ | ใช้ |
                                |---------|-----|
                                | เรียงลำดับ + ซ้ำได้ | ArrayList |
                                | ไม่ซ้ำ + เร็ว | HashSet |
                                | Key-Value | HashMap |
                                | เรียงลำดับ + ไม่ซ้ำ | TreeSet |
                                """))
                .add(RoadmapTopic.create("streams", "Streams API", "Streams").withLevel("SENIOR")
                        .withContent("""
                                # Streams API
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **คืออะไร**: วิธีประมวลผลข้อมูลแบบ functional
                                - **Lazy Evaluation**: ทำงานเมื่อถึง terminal operation
                                - **Immutable**: ไม่แก้ไข source data
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                List<Integer> numbers = List.of(1, 2, 3, 4, 5);
                                
                                // Filter + Map + Collect
                                List<Integer> doubled = numbers.stream()
                                    .filter(n -> n % 2 == 0)  // เอาเฉพาะคู่
                                    .map(n -> n * 2)          // คูณ 2
                                    .collect(Collectors.toList());
                                
                                // Sum, Average
                                int sum = numbers.stream().mapToInt(n -> n).sum();
                                ```
                                
                                ## 📌 Operations สำคัญ
                                **Intermediate**: filter, map, sorted, distinct
                                **Terminal**: collect, forEach, reduce, count
                                """))
                .add(RoadmapTopic.create("lambdas", "Lambda Expressions", "Lambdas").withLevel("SENIOR")
                        .withContent("""
                                # Lambda Expressions
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **คืออะไร**: Anonymous function แบบสั้น
                                - **Syntax**: (parameters) -> expression
                                - **Functional Interface**: Interface ที่มี method เดียว
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                // แบบเดิม (Anonymous Class)
                                Runnable r1 = new Runnable() {
                                    @Override
                                    public void run() {
                                        System.out.println("Hello");
                                    }
                                };
                                
                                // แบบ Lambda
                                Runnable r2 = () -> System.out.println("Hello");
                                
                                // กับ Collection
                                List<String> names = Arrays.asList("A", "B", "C");
                                names.forEach(name -> System.out.println(name));
                                
                                // Method Reference
                                names.forEach(System.out::println);
                                ```
                                
                                ## 📌 Built-in Functional Interfaces
                                - Predicate<T>: T -> boolean
                                - Function<T,R>: T -> R
                                - Consumer<T>: T -> void
                                - Supplier<T>: () -> T
                                """))
                .add(RoadmapTopic.create("optionals", "Optionals", "Optional").withLevel("SENIOR")
                        .withContent("""
                                # Optional<T>
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **คืออะไร**: Container ที่อาจมีหรือไม่มีค่า
                                - **ป้องกัน NullPointerException**: จัดการ null อย่างปลอดภัย
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                Optional<String> name = Optional.ofNullable(null);
                                
                                // เช็คว่ามีค่าไหม
                                if (name.isPresent()) {
                                    System.out.println(name.get());
                                }
                                
                                // ดีกว่า: ifPresent
                                name.ifPresent(System.out::println);
                                
                                // Default value
                                String result = name.orElse("Unknown");
                                String result2 = name.orElseGet(() -> "Default");
                                
                                // Throw Exception
                                String result3 = name.orElseThrow();
                                ```
                                """));
    }
}
