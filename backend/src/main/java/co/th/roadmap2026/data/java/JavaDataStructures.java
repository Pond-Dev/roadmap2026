package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaDataStructures {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("data-structures", "Data Structures", "โครงสร้างข้อมูล")
                .withLevel("MID")
                .add(RoadmapTopic.create("arrays", "Arrays", "อาร์เรย์").withLevel("MID")
                        .withContent("""
                                # Arrays (อาร์เรย์)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **คืออะไร**: โครงสร้างเก็บข้อมูลชนิดเดียวกันขนาดคงที่
                                - **Fixed size**: ขนาดคงที่ แก้ไขไม่ได้
                                - **Index เริ่มที่ 0**: ตัวแรกคือ index 0
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                // ประกาศ Array
                                int[] numbers = new int[5];
                                String[] names = {"A", "B", "C"};
                                
                                // เข้าถึงและแก้ไข
                                numbers[0] = 10;
                                System.out.println(names[1]); // "B"
                                
                                // วนซ้ำผ่าน Array
                                for (String name : names) {
                                    System.out.println(name);
                                }
                                ```
                                
                                ## 📌 เมื่อไหร่ควรใช้?
                                - ขนาดคงที่ ไม่เปลี่ยนแปลง
                                - ต้องการ performance สูงสุด
                                """))
                .add(RoadmapTopic.create("arraylist", "ArrayList", "ArrayList").withLevel("MID")
                        .withContent("""
                                # ArrayList
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **Dynamic Array**: ขยายขนาดได้อัตโนมัติ
                                - **เข้าถึงเร็ว**: O(1) สำหรับ get โดย index
                                - **แทรกช้า**: O(n) เมื่อ insert กลาง
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                import java.util.ArrayList;
                                
                                ArrayList<String> list = new ArrayList<>();
                                
                                // เพิ่มข้อมูล
                                list.add("แอปเปิ้ล");
                                list.add("กล้วย");
                                
                                // เข้าถึงข้อมูล
                                String fruit = list.get(0); // "แอปเปิ้ล"
                                
                                // ลบข้อมูล
                                list.remove(1);
                                
                                // เช็คขนาด
                                int size = list.size();
                                ```
                                
                                ## 📌 เมื่อไหร่ควรใช้?
                                - ขนาดไม่แน่นอน
                                - เข้าถึงโดย index บ่อย
                                """))
                .add(RoadmapTopic.create("linkedlist", "LinkedList", "LinkedList").withLevel("MID")
                        .withContent("""
                                # LinkedList
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **โครงสร้าง**: Node ที่เชื่อมต่อกัน
                                - **แทรกเร็ว**: O(1) สำหรับ insert/delete ต้น/ท้าย
                                - **เข้าถึงช้า**: O(n) สำหรับ get โดย index
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                import java.util.LinkedList;
                                
                                LinkedList<String> list = new LinkedList<>();
                                
                                // เพิ่มต้น/ท้าย (เร็ว!)
                                list.addFirst("แรก");
                                list.addLast("สุดท้าย");
                                
                                // ดึงข้อมูลต้น/ท้าย
                                String first = list.getFirst();
                                String last = list.getLast();
                                
                                // ลบต้น/ท้าย
                                list.removeFirst();
                                list.removeLast();
                                ```
                                
                                ## 📌 เมื่อไหร่ควรใช้?
                                - Insert/Delete บ่อย โดยเฉพาะต้น/ท้าย
                                - ใช้เป็น Queue หรือ Stack
                                """))
                .add(RoadmapTopic.create("hashmap", "HashMap", "HashMap").withLevel("MID")
                        .withContent("""
                                # HashMap
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **เก็บ Key-Value pairs**: เข้าถึง value ด้วย key
                                - **เร็วมาก**: O(1) สำหรับ get/put/remove
                                - **ไม่เรียงลำดับ**: ไม่รับประกันลำดับ
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                import java.util.HashMap;
                                
                                HashMap<String, Integer> scores = new HashMap<>();
                                
                                // เพิ่มข้อมูล
                                scores.put("สมชาย", 85);
                                scores.put("สมศรี", 92);
                                
                                // ดึงข้อมูล
                                int score = scores.get("สมชาย"); // 85
                                
                                // เช็คว่ามี key หรือไม่
                                boolean exists = scores.containsKey("สมชาย");
                                
                                // วนซ้ำผ่าน entries
                                for (var entry : scores.entrySet()) {
                                    System.out.println(entry.getKey() + ": " + entry.getValue());
                                }
                                ```
                                
                                ## 📌 เมื่อไหร่ควรใช้?
                                - ต้องการ lookup เร็วด้วย key
                                - เก็บความสัมพันธ์ของข้อมูล
                                """))
                .add(RoadmapTopic.create("hashset", "HashSet", "HashSet").withLevel("MID")
                        .withContent("""
                                # HashSet
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **เก็บข้อมูลไม่ซ้ำกัน**: ไม่ยอมให้ duplicate
                                - **เร็วมาก**: O(1) สำหรับ add/remove/contains
                                - **ไม่เรียงลำดับ**: ไม่รับประกันลำดับ
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                import java.util.HashSet;
                                
                                HashSet<String> fruits = new HashSet<>();
                                
                                // เพิ่มข้อมูล
                                fruits.add("แอปเปิ้ล");
                                fruits.add("กล้วย");
                                fruits.add("แอปเปิ้ล");  // ไม่ถูกเพิ่ม (ซ้ำ!)
                                
                                // เช็คว่ามีหรือไม่
                                boolean exists = fruits.contains("แอปเปิ้ล"); // true
                                
                                // ลบข้อมูล
                                fruits.remove("กล้วย");
                                
                                // ขนาด
                                int size = fruits.size(); // 1
                                ```
                                
                                ## 📌 เมื่อไหร่ควรใช้?
                                - เก็บข้อมูลที่ไม่ซ้ำกัน
                                - เช็คการมีอยู่เร็ว
                                """))
                .add(RoadmapTopic.create("stack", "Stack", "Stack").withLevel("MID")
                        .withContent("""
                                # Stack (สแต็ก)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **LIFO**: Last In, First Out (เข้าหลังออกก่อน)
                                - **push**: เพิ่มข้อมูลบนสุด
                                - **pop**: ดึงข้อมูลบนสุดออก
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                import java.util.Stack;
                                
                                Stack<String> stack = new Stack<>();
                                
                                // Push - เพิ่มบนสุด
                                stack.push("แรก");
                                stack.push("ที่สอง");
                                stack.push("ที่สาม");
                                
                                // Pop - ดึงบนสุดออก
                                String top = stack.pop(); // "ที่สาม"
                                
                                // Peek - ดูบนสุด (ไม่ดึงออก)
                                String peek = stack.peek(); // "ที่สอง"
                                
                                // เช็คว่างหรือไม่
                                boolean empty = stack.isEmpty();
                                ```
                                
                                ## 📌 Use Cases
                                - Undo/Redo operations
                                - จัดการวงเล็บ
                                - Browser back button
                                """))
                .add(RoadmapTopic.create("queue", "Queue", "Queue").withLevel("MID")
                        .withContent("""
                                # Queue (คิว)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **FIFO**: First In, First Out (เข้าก่อนออกก่อน)
                                - **offer/add**: เพิ่มท้ายคิว
                                - **poll/remove**: ดึงหัวคิวออก
                                
                                ## 💡 ตัวอย่าง
                                ```java
                                import java.util.LinkedList;
                                import java.util.Queue;
                                
                                Queue<String> queue = new LinkedList<>();
                                
                                // Offer - เพิ่มท้ายคิว
                                queue.offer("คนที่ 1");
                                queue.offer("คนที่ 2");
                                queue.offer("คนที่ 3");
                                
                                // Poll - ดึงหัวคิวออก
                                String first = queue.poll(); // "คนที่ 1"
                                
                                // Peek - ดูหัวคิว (ไม่ดึงออก)
                                String peek = queue.peek(); // "คนที่ 2"
                                ```
                                
                                ## 📌 Use Cases
                                - Task scheduling
                                - จัดคิวงาน (BFS)
                                - Message queue
                                """))
                .add(RoadmapTopic.create("tree", "Tree", "Tree").withLevel("SENIOR")
                        .withContent("""
                                # Tree (ต้นไม้)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **โครงสร้างแบบลำดับชั้น**: Root → Children → Leaves
                                - **Binary Tree**: แต่ละ node มีลูกได้ ไม่เกิน 2 ตัว
                                - **BST (Binary Search Tree)**: ซ้าย < parent < ขวา
                                
                                ## 💡 โครงสร้าง Node
                                ```java
                                class TreeNode {
                                    int value;
                                    TreeNode left;
                                    TreeNode right;
                                    
                                    TreeNode(int value) {
                                        this.value = value;
                                    }
                                }
                                ```
                                
                                ## 📌 Tree Traversal
                                - **Inorder**: left → root → right
                                - **Preorder**: root → left → right
                                - **Postorder**: left → right → root
                                - **Level order**: BFS
                                
                                ## ⚡ Time Complexity (BST)
                                - Search: O(log n) average, O(n) worst
                                - Insert: O(log n) average
                                """))
                .add(RoadmapTopic.create("graph", "Graph", "Graph").withLevel("SENIOR")
                        .withContent("""
                                # Graph (กราฟ)
                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                - **Vertices (Nodes)**: จุดยอด
                                - **Edges**: เส้นเชื่อมระหว่าง vertices
                                - **Directed vs Undirected**: มีทิศทาง vs ไม่มีทิศทาง
                                
                                ## 📌 วิธีเก็บข้อมูล
                                ### Adjacency Matrix
                                ```java
                                int[][] graph = new int[n][n];
                                graph[0][1] = 1; // edge from 0 to 1
                                ```
                                
                                ### Adjacency List
                                ```java
                                List<List<Integer>> graph = new ArrayList<>();
                                for (int i = 0; i < n; i++) {
                                    graph.add(new ArrayList<>());
                                }
                                graph.get(0).add(1); // edge from 0 to 1
                                ```
                                
                                ## ⚡ Algorithms สำคัญ
                                - **BFS**: Breadth-First Search (Queue)
                                - **DFS**: Depth-First Search (Stack/Recursion)
                                - **Dijkstra**: Shortest path
                                
                                ## 📌 Use Cases
                                - Social networks
                                - Maps/Navigation
                                - Recommendation systems
                                """));
    }
}
