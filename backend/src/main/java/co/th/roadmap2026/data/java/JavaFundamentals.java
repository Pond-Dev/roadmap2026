package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaFundamentals {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("fundamentals", "Learn the Fundamentals", "พื้นฐาน Java")
                .withLevel("JUNIOR")
                .add(RoadmapTopic.create("syntax", "Basic Syntax", "Syntax พื้นฐาน").withLevel("JUNIOR")
                        .withContent("""
                                # Basic Syntax
                                ## 📋 Prerequisites: None
                                ## 🎯 Topics
                                - Structure of Java program
                                - main() method
                                - Comments (single, multi, Javadoc)
                                - Naming conventions
                                """))
                .add(RoadmapTopic.create("datatypes", "Data Types", "ชนิดข้อมูล").withLevel("JUNIOR")
                        .withContent("""
                                # Data Types
                                ## 🎯 Topics
                                - Primitive: byte, short, int, long, float, double, boolean, char
                                - Reference: String, Arrays, Objects
                                - Wrapper Classes: Integer, Double, etc.
                                - Type Casting
                                """))
                .add(RoadmapTopic.create("variables", "Variables", "ตัวแปร").withLevel("JUNIOR")
                        .withContent("""
                                # Variables (ตัวแปร)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **การประกาศตัวแปร**: int age = 25;
                                - **Scope**: Local, Instance, Static variable
                                - **Final keyword**: ค่าคงที่ที่แก้ไขไม่ได้
                                - **Variable Naming**: camelCase convention
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                int number = 10;        // Local variable
                                final double PI = 3.14; // Constant
                                String name = "Java";   // Reference type
                                ```
                                
                                ## 📚 แหล่งเรียนรู้
                                - Oracle Java Tutorials
                                - W3Schools Java Variables
                                """))
                .add(RoadmapTopic.create("conditionals", "Conditionals", "เงื่อนไข").withLevel("JUNIOR")
                        .withContent("""
                                # Conditionals
                                - if / else / else if
                                - switch statements
                                - switch expressions (Java 14+)
                                - Ternary operator
                                """))
                .add(RoadmapTopic.create("loops", "Loops", "การวนซ้ำ").withLevel("JUNIOR")
                        .withContent("""
                                # Loops (การวนซ้ำ)
                                ## 🎯 ประเภทของ Loop
                                - **for loop**: วนซ้ำจำนวนครั้งที่รู้แน่นอน
                                - **while loop**: วนซ้ำตามเงื่อนไข
                                - **do-while**: ทำก่อนแล้วค่อยเช็คเงื่อนไข
                                - **for-each**: วนซ้ำผ่าน Array/Collection
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                // for loop
                                for (int i = 0; i < 5; i++) { }
                                
                                // for-each
                                for (String item : items) { }
                                
                                // while
                                while (condition) { }
                                ```
                                
                                ## ⚡ Keywords สำคัญ
                                - **break**: หยุดการวนซ้ำทันที
                                - **continue**: ข้ามไปรอบถัดไป
                                """))
                .add(RoadmapTopic.create("functions", "Functions", "ฟังก์ชัน").withLevel("JUNIOR")
                        .withContent("""
                                # Functions / Methods (ฟังก์ชัน)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **Method Declaration**: การประกาศ method
                                - **Parameters**: ค่าที่ส่งเข้า method
                                - **Return Type**: ชนิดข้อมูลที่ return
                                - **Method Overloading**: method ชื่อเดียวกัน parameter ต่างกัน
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                // Method ที่ return ค่า
                                public int add(int a, int b) {
                                    return a + b;
                                }
                                
                                // Method ที่ไม่ return (void)
                                public void printHello() {
                                    System.out.println("Hello");
                                }
                                ```
                                
                                ## 📌 Access Modifiers
                                - public, private, protected, default
                                """))
                .add(RoadmapTopic.create("exceptions", "Exception Handling", "การจัดการ Exceptions").withLevel("JUNIOR")
                        .withContent("""
                                # Exception Handling
                                - try / catch / finally
                                - throw / throws
                                - Checked vs Unchecked
                                - Custom Exceptions
                                """));
    }
}
