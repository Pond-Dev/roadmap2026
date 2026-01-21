package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaAlgorithms {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("algorithms", "Algorithms", "อัลกอริทึม")
                .withLevel("MID")
                .add(RoadmapTopic.create("sorting", "Sorting", "การเรียงลำดับ").withLevel("MID")
                        .withContent("""
                                # Sorting Algorithms
                                - Bubble Sort
                                - Selection Sort
                                - Insertion Sort
                                - Merge Sort
                                - Quick Sort
                                """))
                .add(RoadmapTopic.create("searching", "Searching", "การค้นหา").withLevel("MID")
                        .withContent("""
                                # Searching Algorithms
                                - Linear Search
                                - Binary Search
                                """))
                .add(RoadmapTopic.create("recursion", "Recursion", "การเรียกซ้ำ").withLevel("MID")
                        .withContent("""
                                # Recursion (การเรียกซ้ำ)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **คืออะไร**: ฟังก์ชันที่เรียกตัวเอง
                                - **Base Case**: เงื่อนไขหยุดการเรียกซ้ำ
                                - **Recursive Case**: เรียกตัวเองและลดขนาดปัญหา
                                
                                ## 💡 ตัวอย่าง: Factorial
                                ```java
                                // 5! = 5 × 4 × 3 × 2 × 1 = 120
                                public int factorial(int n) {
                                    // Base case
                                    if (n <= 1) return 1;
                                    
                                    // Recursive case
                                    return n * factorial(n - 1);
                                }
                                ```
                                
                                ## 💡 ตัวอย่าง: Fibonacci
                                ```java
                                // 0, 1, 1, 2, 3, 5, 8, 13...
                                public int fibonacci(int n) {
                                    if (n <= 1) return n;
                                    return fibonacci(n - 1) + fibonacci(n - 2);
                                }
                                ```
                                
                                ## ⚠️ ข้อควรระวัง
                                - **Stack Overflow**: เมื่อเรียกลึกเกินไป
                                - ต้องมี Base Case เสมอ!
                                
                                ## 📌 Use Cases
                                - Tree/Graph traversal
                                - Divide and Conquer algorithms
                                - Backtracking problems
                                """));
    }
}
