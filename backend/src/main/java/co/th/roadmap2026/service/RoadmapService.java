package co.th.roadmap2026.service;

import co.th.roadmap2026.model.RoadmapNode;
import org.springframework.stereotype.Service;

@Service
public class RoadmapService {

    public RoadmapNode getJavaRoadmap() {
        return RoadmapNode.create("java", "Java Developer", "Complete Java Developer Roadmap 2026")

                // ============ FUNDAMENTALS ============
                .add(RoadmapNode.create("fundamentals", "Learn the Fundamentals", "พื้นฐาน Java")
                        .withLevel("JUNIOR")
                        .add(RoadmapNode.create("syntax", "Basic Syntax", "Syntax พื้นฐาน").withLevel("JUNIOR")
                                .withContent("""
                                        # Basic Syntax
                                        ## 📋 Prerequisites: None
                                        ## 🎯 Topics
                                        - Structure of Java program
                                        - main() method
                                        - Comments (single, multi, Javadoc)
                                        - Naming conventions
                                        """))
                        .add(RoadmapNode.create("datatypes", "Data Types", "ชนิดข้อมูล").withLevel("JUNIOR")
                                .withContent("""
                                        # Data Types
                                        ## 🎯 Topics
                                        - Primitive: byte, short, int, long, float, double, boolean, char
                                        - Reference: String, Arrays, Objects
                                        - Wrapper Classes: Integer, Double, etc.
                                        - Type Casting
                                        """))
                        .add(RoadmapNode.create("variables", "Variables", "ตัวแปร").withLevel("JUNIOR")
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
                        .add(RoadmapNode.create("conditionals", "Conditionals", "เงื่อนไข").withLevel("JUNIOR")
                                .withContent("""
                                        # Conditionals
                                        - if / else / else if
                                        - switch statements
                                        - switch expressions (Java 14+)
                                        - Ternary operator
                                        """))
                        .add(RoadmapNode.create("loops", "Loops", "การวนซ้ำ").withLevel("JUNIOR")
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
                        .add(RoadmapNode.create("functions", "Functions", "ฟังก์ชัน").withLevel("JUNIOR")
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
                        .add(RoadmapNode.create("exceptions", "Exception Handling", "การจัดการ Exceptions").withLevel("JUNIOR")
                                .withContent("""
                                        # Exception Handling
                                        - try / catch / finally
                                        - throw / throws
                                        - Checked vs Unchecked
                                        - Custom Exceptions
                                        """)))

                // ============ OOP ============
                .add(RoadmapNode.create("oop", "Object Oriented Programming", "OOP")
                        .withLevel("MID")
                        .add(RoadmapNode.create("classes", "Classes", "คลาส").withLevel("MID")
                                .withContent("""
                                        # Classes (คลาส)
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **Class คือ**: พิมพ์เขียว (blueprint) สำหรับสร้าง Objects
                                        - **ส่วนประกอบ**: Fields, Methods, Constructors
                                        - **Constructors**: method พิเศษสำหรับสร้าง object
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        public class Person {
                                            // Fields (Properties)
                                            private String name;
                                            private int age;
                                            
                                            // Constructor
                                            public Person(String name, int age) {
                                                this.name = name;
                                                this.age = age;
                                            }
                                            
                                            // Methods
                                            public void introduce() {
                                                System.out.println("Hi, I'm " + name);
                                            }
                                        }
                                        ```
                                        """))
                        .add(RoadmapNode.create("objects", "Objects", "อ็อบเจกต์").withLevel("MID")
                                .withContent("""
                                        # Objects (อ็อบเจกต์)
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **Object คือ**: Instance ที่สร้างจาก Class
                                        - **การสร้าง Object**: ใช้ keyword `new`
                                        - **เข้าถึง Properties/Methods**: ใช้ dot notation
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        // สร้าง Object จาก Class
                                        Person person1 = new Person("สมชาย", 25);
                                        Person person2 = new Person("สมศรี", 22);
                                        
                                        // เรียกใช้ method
                                        person1.introduce();
                                        
                                        // เข้าถึง property (ผ่าน getter)
                                        String name = person1.getName();
                                        ```
                                        
                                        ## 📌 Object Lifecycle
                                        - สร้าง → ใช้งาน → Garbage Collection
                                        """))
                        .add(RoadmapNode.create("interfaces", "Interfaces", "อินเทอร์เฟซ").withLevel("MID")
                                .withContent("""
                                        # Interfaces (อินเทอร์เฟซ)
                                        ## 🎯 Interfaces คืออะไร?
                                        - **สัญญา (Contract)** ที่ Class ต้องทำตาม
                                        - มีเฉพาะ method signatures (ไม่มี implementation)
                                        - Class สามารถ implement หลาย Interfaces ได้
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        // ประกาศ Interface
                                        public interface Animal {
                                            void makeSound();  // Abstract method
                                            void move();
                                        }
                                        
                                        // Implement Interface
                                        public class Dog implements Animal {
                                            @Override
                                            public void makeSound() {
                                                System.out.println("Woof!");
                                            }
                                            
                                            @Override
                                            public void move() {
                                                System.out.println("Running...");
                                            }
                                        }
                                        ```
                                        
                                        ## ⚡ Java 8+: Default Methods
                                        - Interface สามารถมี default implementation ได้
                                        """))
                        .add(RoadmapNode.create("inheritance", "Inheritance", "การสืบทอด").withLevel("MID")
                                .withContent("""
                                        # Inheritance (การสืบทอด)
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **extends**: ใช้สืบทอดจาก Parent class
                                        - **super**: เรียกใช้ของ Parent class
                                        - **Method Overriding**: เขียนทับ method ของ Parent
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        // Parent Class
                                        public class Animal {
                                            public void eat() {
                                                System.out.println("Eating...");
                                            }
                                        }
                                        
                                        // Child Class
                                        public class Dog extends Animal {
                                            @Override
                                            public void eat() {
                                                super.eat();  // เรียก parent method
                                                System.out.println("Dog is eating");
                                            }
                                            
                                            public void bark() {
                                                System.out.println("Woof!");
                                            }
                                        }
                                        ```
                                        
                                        ## 📌 หมายเหตุ
                                        - Java รองรับ Single Inheritance เท่านั้น
                                        """))
                        .add(RoadmapNode.create("polymorphism", "Polymorphism", "พหุสัณฐาน").withLevel("MID")
                                .withContent("""
                                        # Polymorphism (พหุสัณฐาน)
                                        ## 🎯 หมายถึง "หลายรูปแบบ"
                                        - Object เดียวสามารถมีพฤติกรรมต่างกันได้
                                        
                                        ## 📌 2 ประเภท
                                        ### 1. Compile-time (Method Overloading)
                                        ```java
                                        public int add(int a, int b) { return a + b; }
                                        public double add(double a, double b) { return a + b; }
                                        ```
                                        
                                        ### 2. Runtime (Method Overriding)
                                        ```java
                                        Animal animal = new Dog();  // Polymorphism!
                                        animal.makeSound();  // เรียก Dog's makeSound()
                                        
                                        Animal animal2 = new Cat();
                                        animal2.makeSound();  // เรียก Cat's makeSound()
                                        ```
                                        
                                        ## 💡 ประโยชน์
                                        - เขียน code ที่ยืดหยุ่น
                                        - รองรับการขยายระบบ
                                        - ลด code ซ้ำซ้อน
                                        """))
                        .add(RoadmapNode.create("abstraction", "Abstraction", "Abstraction").withLevel("MID")
                                .withContent("""
                                        # Abstraction (การนามธรรม)
                                        ## 🎯 แนวคิด
                                        - ซ่อนรายละเอียดที่ซับซ้อน แสดงเฉพาะสิ่งจำเป็น
                                        - ทำได้ผ่าน Abstract Class หรือ Interface
                                        
                                        ## 💡 ตัวอย่าง Abstract Class
                                        ```java
                                        // Abstract Class - ไม่สามารถสร้าง instance ได้โดยตรง
                                        public abstract class Shape {
                                            // Abstract method - ไม่มี body
                                            public abstract double getArea();
                                            
                                            // Concrete method - มี implementation
                                            public void display() {
                                                System.out.println("Area: " + getArea());
                                            }
                                        }
                                        
                                        // Concrete Class
                                        public class Circle extends Shape {
                                            private double radius;
                                            
                                            @Override
                                            public double getArea() {
                                                return Math.PI * radius * radius;
                                            }
                                        }
                                        ```
                                        
                                        ## 📌 Abstract vs Interface
                                        - Abstract: มี state (fields) และ partial implementation ได้
                                        - Interface: เน้น contract/behavior
                                        """))
                        .add(RoadmapNode.create("encapsulation", "Encapsulation", "Encapsulation").withLevel("MID")
                                .withContent("""
                                        # Encapsulation (การห่อหุ้ม)
                                        ## 🎯 แนวคิด
                                        - ซ่อน data จากภายนอก (data hiding)
                                        - เข้าถึงผ่าน getter/setter methods
                                        - ป้องกันการแก้ไข data โดยตรง
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        public class BankAccount {
                                            // Private field - ซ่อนจากภายนอก
                                            private double balance;
                                            
                                            // Getter - อ่านค่า
                                            public double getBalance() {
                                                return balance;
                                            }
                                            
                                            // Setter with validation - เขียนค่า
                                            public void deposit(double amount) {
                                                if (amount > 0) {
                                                    balance += amount;
                                                }
                                            }
                                            
                                            public boolean withdraw(double amount) {
                                                if (amount > 0 && amount <= balance) {
                                                    balance -= amount;
                                                    return true;
                                                }
                                                return false;
                                            }
                                        }
                                        ```
                                        
                                        ## 📌 ประโยชน์
                                        - ควบคุมการเข้าถึง data
                                        - Validation ก่อนแก้ไข
                                        - ลด coupling ระหว่าง classes
                                        """)))

                // ============ DATA STRUCTURES ============
                .add(RoadmapNode.create("data-structures", "Data Structures", "โครงสร้างข้อมูล")
                        .withLevel("MID")
                        .add(RoadmapNode.create("arrays", "Arrays", "อาร์เรย์").withLevel("MID")
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
                        .add(RoadmapNode.create("arraylist", "ArrayList", "ArrayList").withLevel("MID")
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
                        .add(RoadmapNode.create("linkedlist", "LinkedList", "LinkedList").withLevel("MID")
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
                        .add(RoadmapNode.create("hashmap", "HashMap", "HashMap").withLevel("MID")
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
                        .add(RoadmapNode.create("hashset", "HashSet", "HashSet").withLevel("MID")
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
                        .add(RoadmapNode.create("stack", "Stack", "Stack").withLevel("MID")
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
                        .add(RoadmapNode.create("queue", "Queue", "Queue").withLevel("MID")
                                .withContent("""
                                        # Queue (คิว)
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **FIFO**: First In, First Out (เข้าก่อนออกก่อน)
                                        - **offer/add**: เพิ่มท้ายคิว
                                        - **poll/remove**: ดึงออกหัวคิว
                                        
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
                        .add(RoadmapNode.create("tree", "Tree", "Tree").withLevel("SENIOR")
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
                        .add(RoadmapNode.create("graph", "Graph", "Graph").withLevel("SENIOR")
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
                                        """)))

                // ============ ALGORITHMS ============
                .add(RoadmapNode.create("algorithms", "Algorithms", "อัลกอริทึม")
                        .withLevel("MID")
                        .add(RoadmapNode.create("sorting", "Sorting", "การเรียงลำดับ").withLevel("MID")
                                .withContent("""
                                        # Sorting Algorithms
                                        - Bubble Sort
                                        - Selection Sort
                                        - Insertion Sort
                                        - Merge Sort
                                        - Quick Sort
                                        """))
                        .add(RoadmapNode.create("searching", "Searching", "การค้นหา").withLevel("MID")
                                .withContent("""
                                        # Searching Algorithms
                                        - Linear Search
                                        - Binary Search
                                        """))
                        .add(RoadmapNode.create("recursion", "Recursion", "การเรียกซ้ำ").withLevel("MID")
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
                                        """)))

                // ============ ADVANCED ============
                .add(RoadmapNode.create("advanced", "Advanced Java", "Java ขั้นสูง")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("generics", "Generics", "Generics").withLevel("SENIOR")
                                .withContent("""
                                        # Generics
                                        - Type Parameters
                                        - Bounded Types
                                        - Wildcards (?, extends, super)
                                        """))
                        .add(RoadmapNode.create("collections", "Collections Framework", "Collections").withLevel("SENIOR")
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
                        .add(RoadmapNode.create("streams", "Streams API", "Streams").withLevel("SENIOR")
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
                        .add(RoadmapNode.create("lambdas", "Lambda Expressions", "Lambdas").withLevel("SENIOR")
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
                        .add(RoadmapNode.create("optionals", "Optionals", "Optional").withLevel("SENIOR")
                                .withContent("""
                                        # Optional<T>
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **คืออะไร**: Container ที่อาจมีหรือไม่มีค่า
                                        - **ป้องกัน NullPointerException**: จัดการ null อย่างปลอดภัย
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        // สร้าง Optional
                                        Optional<String> name = Optional.of("สมชาย");
                                        Optional<String> empty = Optional.empty();
                                        Optional<String> nullable = Optional.ofNullable(null);
                                        
                                        // เช็คและดึงค่า
                                        if (name.isPresent()) {
                                            System.out.println(name.get());
                                        }
                                        
                                        // วิธี Functional
                                        name.ifPresent(n -> System.out.println(n));
                                        String result = name.orElse("ไม่มีชื่อ");
                                        String result2 = name.orElseGet(() -> "ค่า default");
                                        
                                        // Chain operations
                                        Optional<String> upper = name.map(String::toUpperCase);
                                        ```
                                        
                                        ## ⚠️ ข้อควรระวัง
                                        - ไม่ควรใช้เป็น field หรือ parameter
                                        - ใช้สำหรับ return type เท่านั้น
                                        """))
                        .add(RoadmapNode.create("annotations", "Annotations", "Annotations").withLevel("SENIOR")
                                .withContent("""
                                        # Annotations
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **คืออะไร**: Metadata ที่แนบกับ code
                                        - **ใช้ทำอะไร**: Compiler hints, Runtime processing, Code generation
                                        
                                        ## 📌 Built-in Annotations
                                        ```java
                                        @Override           // เขียนทับ method ของ parent
                                        @Deprecated         // เลิกใช้แล้ว
                                        @SuppressWarnings   // ปิด warning
                                        @FunctionalInterface // มี method เดียว
                                        ```
                                        
                                        ## 💡 สร้าง Custom Annotation
                                        ```java
                                        @Retention(RetentionPolicy.RUNTIME)
                                        @Target(ElementType.METHOD)
                                        public @interface MyAnnotation {
                                            String value() default "";
                                            int priority() default 0;
                                        }
                                        
                                        // ใช้งาน
                                        @MyAnnotation(value = "test", priority = 1)
                                        public void myMethod() { }
                                        ```
                                        
                                        ## 📌 ใช้บ่อยใน Frameworks
                                        - Spring: @Autowired, @Controller
                                        - JPA: @Entity, @Column
                                        - JUnit: @Test, @BeforeEach
                                        """))
                        .add(RoadmapNode.create("reflection", "Reflection", "Reflection").withLevel("EXPERT")
                                .withContent("""
                                        # Reflection API
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **คืออะไร**: ตรวจสอบ/แก้ไข class ใน runtime
                                        - **ใช้ทำอะไร**: ดู class info, เรียก methods, สร้าง objects
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        Class<?> clazz = Person.class;
                                        
                                        // ดูข้อมูล class
                                        System.out.println(clazz.getName());
                                        Field[] fields = clazz.getDeclaredFields();
                                        Method[] methods = clazz.getDeclaredMethods();
                                        
                                        // สร้าง instance
                                        Object obj = clazz.getDeclaredConstructor().newInstance();
                                        
                                        // เรียก method
                                        Method method = clazz.getMethod("setName", String.class);
                                        method.invoke(obj, "สมชาย");
                                        
                                        // เข้าถึง private field
                                        Field field = clazz.getDeclaredField("name");
                                        field.setAccessible(true);
                                        field.set(obj, "สมศรี");
                                        ```
                                        
                                        ## ⚠️ ข้อควรระวัง
                                        - Performance: ช้ากว่าการเรียกตรง
                                        - Security: เข้าถึง private members ได้
                                        - ใช้เมื่อจำเป็นจริงๆ (Frameworks)
                                        """)))

                // ============ CONCURRENCY ============
                .add(RoadmapNode.create("concurrency", "Concurrency", "การทำงานพร้อมกัน")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("threads", "Threads", "Threads").withLevel("SENIOR")
                                .withContent("""
                                        # Threads (เธรด)
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **คืออะไร**: หน่วยการทำงานเล็กที่สุดของ process
                                        - **Multithreading**: ทำหลายอย่างพร้อมกัน
                                        
                                        ## 💡 สร้าง Thread
                                        ```java
                                        // วิธี 1: extends Thread
                                        class MyThread extends Thread {
                                            @Override
                                            public void run() {
                                                System.out.println("ทำงานใน Thread");
                                            }
                                        }
                                        
                                        // วิธี 2: implements Runnable
                                        Runnable task = () -> System.out.println("ทำงาน!");
                                        Thread thread = new Thread(task);
                                        
                                        // เริ่มทำงาน
                                        thread.start();
                                        
                                        // รอ Thread จบ
                                        thread.join();
                                        ```
                                        
                                        ## 📌 Thread States
                                        NEW → RUNNABLE → BLOCKED/WAITING → TERMINATED
                                        """))
                        .add(RoadmapNode.create("runnable", "Runnable & Callable", "Runnable/Callable").withLevel("SENIOR")
                                .withContent("""
                                        # Runnable vs Callable
                                        ## 🎯 ความแตกต่าง
                                        | | Runnable | Callable |
                                        |---|---|---|
                                        | Return | void | V |
                                        | Exception | ไม่ได้ | ได้ |
                                        | Method | run() | call() |
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        // Runnable: ไม่ return ค่า
                                        Runnable runnable = () -> {
                                            System.out.println("ทำงาน...");
                                        };
                                        
                                        // Callable: return ค่าได้
                                        Callable<Integer> callable = () -> {
                                            return 42;
                                        };
                                        
                                        // เรียกใช้ Callable ผ่าน ExecutorService
                                        ExecutorService executor = Executors.newSingleThreadExecutor();
                                        Future<Integer> future = executor.submit(callable);
                                        Integer result = future.get(); // รอและรับค่า
                                        ```
                                        """))
                        .add(RoadmapNode.create("executors", "Executor Service", "Executors").withLevel("SENIOR")
                                .withContent("""
                                        # Executor Service
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **คืออะไร**: Framework จัดการ Thread Pool
                                        - **ทำไม**: ประหยัดทรัพยากร, ผลลัพธ์ดีกว่า
                                        
                                        ## 💡 ประเภท Executor
                                        ```java
                                        // Single Thread
                                        ExecutorService single = Executors.newSingleThreadExecutor();
                                        
                                        // Fixed Thread Pool
                                        ExecutorService fixed = Executors.newFixedThreadPool(4);
                                        
                                        // Cached Thread Pool (ขยายได้)
                                        ExecutorService cached = Executors.newCachedThreadPool();
                                        
                                        // Scheduled
                                        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(2);
                                        ```
                                        
                                        ## 💡 การใช้งาน
                                        ```java
                                        ExecutorService executor = Executors.newFixedThreadPool(4);
                                        
                                        // Submit tasks
                                        executor.submit(() -> System.out.println("งาน 1"));
                                        executor.submit(() -> System.out.println("งาน 2"));
                                        
                                        // ปิด executor เมื่อเสร็จ
                                        executor.shutdown();
                                        ```
                                        """))
                        .add(RoadmapNode.create("synchronization", "Synchronization", "Sync").withLevel("SENIOR")
                                .withContent("""
                                        # Synchronization
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **ทำไมต้อง**: ป้องกัน Race Condition
                                        - **Race Condition**: หลาย threads แก้ข้อมูลพร้อมกัน
                                        
                                        ## 💡 synchronized keyword
                                        ```java
                                        public class Counter {
                                            private int count = 0;
                                            
                                            // Synchronized method
                                            public synchronized void increment() {
                                                count++;
                                            }
                                            
                                            // Synchronized block
                                            public void incrementBlock() {
                                                synchronized (this) {
                                                    count++;
                                                }
                                            }
                                        }
                                        ```
                                        
                                        ## 📌 volatile keyword
                                        ```java
                                        // รับประกันว่าอ่านค่าล่าสุดจาก main memory
                                        private volatile boolean running = true;
                                        ```
                                        
                                        ## ⚠️ Deadlock
                                        - เกิดเมื่อ threads รอ lock ซึ่งกันและกัน
                                        """))
                        .add(RoadmapNode.create("locks", "Locks", "Locks").withLevel("SENIOR")
                                .withContent("""
                                        # Locks
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **ทำไมใช้**: ยืดหยุ่นกว่า synchronized
                                        - สามารถ try-lock, timeout, และอื่นๆ
                                        
                                        ## 💡 ReentrantLock
                                        ```java
                                        import java.util.concurrent.locks.ReentrantLock;
                                        
                                        ReentrantLock lock = new ReentrantLock();
                                        
                                        public void doSomething() {
                                            lock.lock();
                                            try {
                                                // Critical section
                                            } finally {
                                                lock.unlock(); // ต้อง unlock เสมอ!
                                            }
                                        }
                                        
                                        // Try lock with timeout
                                        if (lock.tryLock(1, TimeUnit.SECONDS)) {
                                            try {
                                                // ได้ lock
                                            } finally {
                                                lock.unlock();
                                            }
                                        }
                                        ```
                                        
                                        ## 📌 ReadWriteLock
                                        - หลาย readers อ่านพร้อมกันได้
                                        - เขียนได้ทีละคน
                                        """))
                        .add(RoadmapNode.create("completable-future", "CompletableFuture", "Async").withLevel("SENIOR")
                                .withContent("""
                                        # CompletableFuture
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **คืออะไร**: Async programming แบบ modern
                                        - **ทำไม**: เขียน async code ง่ายขึ้น
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        // ทำงานแบบ async
                                        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                                            return "ดึงข้อมูล..."; // ทำงานใน background
                                        });
                                        
                                        // นำผลลัพธ์ไปทำต่อ
                                        CompletableFuture<Integer> processed = future
                                            .thenApply(str -> str.length())    // แปลงข้อมูล
                                            .thenApply(len -> len * 2);         // คูณ 2
                                        
                                        // รวมหลาย futures
                                        CompletableFuture<Void> all = CompletableFuture.allOf(
                                            future1, future2, future3
                                        );
                                        
                                        // รับตัวที่เสร็จก่อน
                                        Object result = CompletableFuture.anyOf(f1, f2).get();
                                        ```
                                        
                                        ## 📌 จัดการ Exception
                                        ```java
                                        future.exceptionally(ex -> "fallback value");
                                        ```
                                        """))
                        .add(RoadmapNode.create("virtual-threads", "Virtual Threads", "Java 21+").withLevel("EXPERT")
                                .withContent("""
                                        # Virtual Threads (Java 21+)
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **คืออะไร**: Lightweight threads จัดการโดย JVM
                                        - **เบามาก**: สร้างได้เป็นล้านๆ threads
                                        - **เหมาะกับ**: I/O-bound tasks
                                        
                                        ## 💡 การสร้าง
                                        ```java
                                        // สร้าง Virtual Thread
                                        Thread.ofVirtual().start(() -> {
                                            System.out.println("Virtual Thread!");
                                        });
                                        
                                        // สร้างผ่าน Executor
                                        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
                                            executor.submit(() -> task1());
                                            executor.submit(() -> task2());
                                            // สร้าง virtual thread ใหม่ทุก task!
                                        }
                                        ```
                                        
                                        ## ✅ vs Platform Threads
                                        | Platform | Virtual |
                                        |---|---|
                                        | OS-managed | JVM-managed |
                                        | โหลด memory สูง | memory ต่ำ |
                                        | สร้างได้จำกัด | สร้างได้เยอะ |
                                        """)))

                // ============ JVM ============
                .add(RoadmapNode.create("jvm", "JVM Internals", "JVM")
                        .withLevel("EXPERT")
                        .add(RoadmapNode.create("memory", "Memory Management", "Memory").withLevel("EXPERT")
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
                        .add(RoadmapNode.create("gc", "Garbage Collection", "GC").withLevel("EXPERT")
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
                        .add(RoadmapNode.create("classloader", "ClassLoader", "ClassLoader").withLevel("EXPERT")
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
                        .add(RoadmapNode.create("jit", "JIT Compiler", "JIT").withLevel("EXPERT")
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
                                        """)))

                // ============ BUILD TOOLS ============
                .add(RoadmapNode.create("build-tools", "Build Tools", "Build Tools")
                        .withLevel("MID")
                        .add(RoadmapNode.create("maven", "Maven", "Maven").withLevel("MID")
                                .withContent("""
                                        # Maven
                                        - pom.xml structure
                                        - Dependencies
                                        - Lifecycle phases
                                        - Plugins
                                        """))
                        .add(RoadmapNode.create("gradle", "Gradle", "Gradle").withLevel("MID")
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
                                        """)))

                // ============ TESTING ============
                .add(RoadmapNode.create("testing", "Testing", "การทดสอบ")
                        .withLevel("MID")
                        .add(RoadmapNode.create("junit", "JUnit 5", "JUnit").withLevel("MID")
                                .withContent("""
                                        # JUnit 5
                                        ## 🎯 คืออะไร?
                                        - Testing framework มาตรฐานสำหรับ Java
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        import org.junit.jupiter.api.*;
                                        
                                        class CalculatorTest {
                                            @Test
                                            void testAdd() {
                                                assertEquals(4, calculator.add(2, 2));
                                            }
                                            
                                            @BeforeEach
                                            void setUp() { /* ก่อนแต่ละ test */ }
                                            
                                            @AfterEach
                                            void tearDown() { /* หลังแต่ละ test */ }
                                        }
                                        ```
                                        
                                        ## 📌 Annotations สำคัญ
                                        - @Test, @BeforeEach, @AfterEach
                                        - @BeforeAll, @AfterAll
                                        - @Disabled, @DisplayName
                                        """))
                        .add(RoadmapNode.create("mockito", "Mockito", "Mocking").withLevel("MID")
                                .withContent("""
                                        # Mockito
                                        ## 🎯 คืออะไร?
                                        - Library สำหรับสร้าง Mock objects
                                        - ทดสอบ class โดยไม่ต้องพึ่ง dependencies จริง
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        @ExtendWith(MockitoExtension.class)
                                        class UserServiceTest {
                                            @Mock
                                            private UserRepository userRepo;
                                            
                                            @InjectMocks
                                            private UserService userService;
                                            
                                            @Test
                                            void testGetUser() {
                                                // Arrange
                                                when(userRepo.findById(1L))
                                                    .thenReturn(new User("สมชาย"));
                                                
                                                // Act
                                                User user = userService.getUser(1L);
                                                
                                                // Assert
                                                assertEquals("สมชาย", user.getName());
                                                verify(userRepo).findById(1L);
                                            }
                                        }
                                        ```
                                        """))
                        .add(RoadmapNode.create("integration", "Integration Testing", "Integration").withLevel("SENIOR")
                                .withContent("""
                                        # Integration Testing
                                        ## 🎯 คืออะไร?
                                        - ทดสอบหลาย components ทำงานร่วมกัน
                                        
                                        ## 💡 Spring Boot Test
                                        ```java
                                        @SpringBootTest
                                        @AutoConfigureMockMvc
                                        class UserControllerIT {
                                            @Autowired
                                            private MockMvc mockMvc;
                                            
                                            @Test
                                            void testGetUsers() throws Exception {
                                                mockMvc.perform(get("/api/users"))
                                                    .andExpect(status().isOk())
                                                    .andExpect(jsonPath("$.[0].name")
                                                        .value("สมชาย"));
                                            }
                                        }
                                        ```
                                        
                                        ## 📌 แตกต่างจาก Unit Test
                                        - Unit: ทดสอบทีละ class
                                        - Integration: ทดสอบหลาย classes ร่วมกัน
                                        """))
                        .add(RoadmapNode.create("testcontainers", "Testcontainers", "Testcontainers").withLevel("SENIOR")
                                .withContent("""
                                        # Testcontainers
                                        ## 🎯 คืออะไร?
                                        - รัน Docker containers สำหรับ testing
                                        - ทดสอบกับ real database/services
                                        
                                        ## 💡 ตัวอย่าง
                                        ```java
                                        @Testcontainers
                                        class UserRepositoryIT {
                                            @Container
                                            static PostgreSQLContainer<?> postgres = 
                                                new PostgreSQLContainer<>("postgres:15");
                                            
                                            @DynamicPropertySource
                                            static void properties(DynamicPropertyRegistry r) {
                                                r.add("spring.datasource.url", 
                                                    postgres::getJdbcUrl);
                                                r.add("spring.datasource.username", 
                                                    postgres::getUsername);
                                                r.add("spring.datasource.password", 
                                                    postgres::getPassword);
                                            }
                                            
                                            @Test
                                            void testSaveUser() {
                                                // ทดสอบกับ PostgreSQL จริง!
                                            }
                                        }
                                        ```
                                        """)))

                // ============ FRAMEWORKS ============
                .add(RoadmapNode.create("frameworks", "Frameworks", "Frameworks")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("spring", "Spring Framework", "Spring")
                                .withLevel("SENIOR")
                                .add(RoadmapNode.create("spring-core", "Spring Core", "Core").withLevel("SENIOR")
                                        .withContent("""
                                                # Spring Core
                                                ## 🎯 สิ่งที่ต้องเรียนรู้
                                                - **IoC Container**: จัดการ object lifecycle
                                                - **Dependency Injection**: @Autowired
                                                - **Beans**: Objects ที่ Spring จัดการ
                                                - **Configuration**: @Configuration, @Bean
                                                """))
                                .add(RoadmapNode.create("spring-boot", "Spring Boot", "Boot").withLevel("SENIOR")
                                        .withContent("""
                                                # Spring Boot
                                                ## 🎯 คืออะไร?
                                                - สร้าง Spring app เร็วด้วย auto-configuration
                                                
                                                ## 💡 เริ่มต้น
                                                ```java
                                                @SpringBootApplication
                                                public class MyApp {
                                                    public static void main(String[] args) {
                                                        SpringApplication.run(MyApp.class, args);
                                                    }
                                                }
                                                ```
                                                
                                                ## 📌 Starters
                                                - spring-boot-starter-web
                                                - spring-boot-starter-data-jpa
                                                - spring-boot-starter-security
                                                """))
                                .add(RoadmapNode.create("spring-mvc", "Spring MVC", "MVC").withLevel("SENIOR")
                                        .withContent("""
                                                # Spring MVC
                                                ## 🎯 สร้าง REST API
                                                ```java
                                                @RestController
                                                @RequestMapping("/api/users")
                                                public class UserController {
                                                    @GetMapping
                                                    public List<User> getUsers() { }
                                                    
                                                    @PostMapping
                                                    public User createUser(@RequestBody User user) { }
                                                    
                                                    @GetMapping("/{id}")
                                                    public User getUser(@PathVariable Long id) { }
                                                }
                                                ```
                                                """))
                                .add(RoadmapNode.create("spring-data", "Spring Data JPA", "Data").withLevel("SENIOR")
                                        .withContent("""
                                                # Spring Data JPA
                                                ## 🎯 สร้าง Repository ง่ายๆ
                                                ```java
                                                public interface UserRepository 
                                                    extends JpaRepository<User, Long> {
                                                    
                                                    List<User> findByName(String name);
                                                    List<User> findByAgeGreaterThan(int age);
                                                }
                                                ```
                                                
                                                ## 📌 ได้อะไรฟรี?
                                                - CRUD operations
                                                - Query methods จากชื่อ method
                                                - Pagination, Sorting
                                                """))
                                .add(RoadmapNode.create("spring-security", "Spring Security", "Security").withLevel("SENIOR")
                                        .withContent("""
                                                # Spring Security
                                                ## 🎯 Authentication & Authorization
                                                - ยืนยันตัวตน (Login)
                                                - กำหนดสิทธิ์ (Roles/Permissions)
                                                
                                                ## 📌 ฟีเจอร์สำคัญ
                                                - JWT Authentication
                                                - OAuth2/OpenID Connect
                                                - CSRF Protection
                                                - CORS Configuration
                                                """))
                                .add(RoadmapNode.create("spring-cloud", "Spring Cloud", "Cloud").withLevel("EXPERT")
                                        .withContent("""
                                                # Spring Cloud
                                                ## 🎯 สำหรับ Microservices
                                                - **Config Server**: จัดการ configuration ศูนย์กลาง
                                                - **Eureka**: Service Discovery
                                                - **Gateway**: API Gateway
                                                - **Circuit Breaker**: Resilience4j
                                                """)))
                        .add(RoadmapNode.create("hibernate", "Hibernate / JPA", "ORM").withLevel("SENIOR")
                                .withContent("""
                                        # Hibernate / JPA
                                        ## 🎯 ORM คืออะไร?
                                        - แมพ Java Objects กับ Database Tables
                                        
                                        ## 💡 Entity
                                        ```java
                                        @Entity
                                        @Table(name = "users")
                                        public class User {
                                            @Id
                                            @GeneratedValue(strategy = GenerationType.IDENTITY)
                                            private Long id;
                                            
                                            @Column(nullable = false)
                                            private String name;
                                            
                                            @OneToMany(mappedBy = "user")
                                            private List<Order> orders;
                                        }
                                        ```
                                        
                                        ## 📌 Relationships
                                        @OneToOne, @OneToMany, @ManyToOne, @ManyToMany
                                        """))
                        .add(RoadmapNode.create("quarkus", "Quarkus", "Quarkus").withLevel("EXPERT")
                                .withContent("""
                                        # Quarkus
                                        ## 🎯 "Supersonic Subatomic Java"
                                        - เร็วมาก, memory ต่ำ
                                        - เหมาะกับ Containers/Serverless
                                        - GraalVM Native Image support
                                        """))
                        .add(RoadmapNode.create("micronaut", "Micronaut", "Micronaut").withLevel("EXPERT")
                                .withContent("""
                                        # Micronaut
                                        ## 🎯 คืออะไร?
                                        - Modern JVM framework
                                        - Compile-time DI (ไม่ใช้ reflection)
                                        - เหมาะกับ Microservices
                                        - GraalVM support
                                        """)))

                // ============ DATABASES ============
                .add(RoadmapNode.create("databases", "Databases", "ฐานข้อมูล")
                        .withLevel("MID")
                        .add(RoadmapNode.create("jdbc", "JDBC", "JDBC").withLevel("MID")
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
                        .add(RoadmapNode.create("postgres", "PostgreSQL", "PostgreSQL").withLevel("MID")
                                .withContent("""
                                        # PostgreSQL
                                        ## 🎯 ทำไมเลือก?
                                        - Open-source, แข็งแกร่ง, มาตรฐานสูง
                                        - ACID compliant
                                        - JSON support (JSONB)
                                        - Full-text search
                                        """))
                        .add(RoadmapNode.create("mysql", "MySQL", "MySQL").withLevel("MID")
                                .withContent("""
                                        # MySQL
                                        ## 🎯 ทำไมเลือก?
                                        - นิยมสูงที่สุด, ใช้ง่าย
                                        - เหมาะกับงาน read-heavy
                                        - Community ใหญ่
                                        """))
                        .add(RoadmapNode.create("mongodb", "MongoDB", "MongoDB").withLevel("SENIOR")
                                .withContent("""
                                        # MongoDB
                                        ## 🎯 NoSQL Document Database
                                        - เก็บเป็น JSON documents
                                        - Schema flexible
                                        - เหมาะกับข้อมูลที่โครงสร้างเปลี่ยนบ่อย
                                        """))
                        .add(RoadmapNode.create("redis", "Redis", "Redis").withLevel("SENIOR")
                                .withContent("""
                                        # Redis
                                        ## 🎯 In-Memory Data Store
                                        - เร็วมาก! (microseconds)
                                        
                                        ## 📌 ใช้ทำอะไร?
                                        - Caching
                                        - Session storage
                                        - Rate limiting
                                        - Pub/Sub messaging
                                        """)))

                // ============ TOOLS ============
                .add(RoadmapNode.create("tools", "Developer Tools", "เครื่องมือ")
                        .withLevel("MID")
                        .add(RoadmapNode.create("git", "Git", "Version Control").withLevel("JUNIOR")
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
                        .add(RoadmapNode.create("docker", "Docker", "Containers").withLevel("MID")
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
                                        
                                        ## 📌 Dockerfile
                                        ```dockerfile
                                        FROM openjdk:21-jdk
                                        COPY target/app.jar app.jar
                                        ENTRYPOINT ["java", "-jar", "app.jar"]
                                        ```
                                        """))
                        .add(RoadmapNode.create("kubernetes", "Kubernetes", "K8s").withLevel("EXPERT")
                                .withContent("""
                                        # Kubernetes
                                        ## 🎯 คืออะไร?
                                        - Container orchestration
                                        - จัดการ containers หลายตัว
                                        
                                        ## 📌 Concepts สำคัญ
                                        - **Pod**: หน่วยเล็กที่สุด (1+ containers)
                                        - **Deployment**: จัดการ pods
                                        - **Service**: Expose pods ให้เข้าถึงได้
                                        - **Ingress**: HTTP routing
                                        """))
                        .add(RoadmapNode.create("ci-cd", "CI/CD", "Automation").withLevel("SENIOR")
                                .withContent("""
                                        # CI/CD
                                        ## 🎯 Continuous Integration/Deployment
                                        - **CI**: Build + Test อัตโนมัติเมื่อ push code
                                        - **CD**: Deploy อัตโนมัติ
                                        
                                        ## 📌 Tools พื้นฐาน
                                        - GitHub Actions
                                        - GitLab CI
                                        - Jenkins
                                        - ArgoCD (GitOps)
                                        """)));
    }

    public RoadmapNode getBackendRoadmap() {
        return RoadmapNode.create("backend", "Backend Developer", "Complete Backend Developer Roadmap 2026")

                // ============ INTERNET ============
                .add(RoadmapNode.create("internet", "Internet", "พื้นฐาน Internet")
                        .withLevel("JUNIOR")
                        .add(RoadmapNode.create("how-internet-works", "How does the Internet work?", "Internet ทำงานยังไง").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("http", "HTTP", "HTTP Protocol").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("browsers", "What is a Browser?", "Browser").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("dns", "DNS", "DNS").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("domain", "Domain Name", "Domain").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("hosting", "Hosting", "Web Hosting").withLevel("JUNIOR")))

                // ============ FRONTEND BASICS ============
                .add(RoadmapNode.create("frontend-basics", "Frontend Knowledge", "ความรู้ Frontend เบื้องต้น")
                        .withLevel("JUNIOR")
                        .add(RoadmapNode.create("html", "HTML Basics", "HTML").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("css", "CSS Basics", "CSS").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("javascript", "JavaScript Basics", "JavaScript").withLevel("JUNIOR")))

                // ============ OS & CLI ============
                .add(RoadmapNode.create("os", "OS and General Knowledge", "ระบบปฏิบัติการ")
                        .withLevel("JUNIOR")
                        .add(RoadmapNode.create("terminal", "Terminal Usage", "Terminal").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("os-works", "How OSs work", "OS").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("process", "Process Management", "Process").withLevel("MID"))
                        .add(RoadmapNode.create("threads-os", "Threads & Concurrency", "Threads").withLevel("MID"))
                        .add(RoadmapNode.create("memory-os", "Memory Management", "Memory").withLevel("MID"))
                        .add(RoadmapNode.create("io", "I/O Management", "I/O").withLevel("MID"))
                        .add(RoadmapNode.create("posix", "POSIX Basics", "POSIX").withLevel("MID"))
                        .add(RoadmapNode.create("networking", "Networking Concepts", "Networking").withLevel("MID")))

                // ============ LANGUAGES ============
                .add(RoadmapNode.create("languages", "Programming Languages", "ภาษาโปรแกรม")
                        .withLevel("JUNIOR")
                        .add(RoadmapNode.create("java", "Java", "Java").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("python", "Python", "Python").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("javascript-be", "JavaScript / Node.js", "Node.js").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("go", "Go", "Golang").withLevel("MID"))
                        .add(RoadmapNode.create("rust", "Rust", "Rust").withLevel("SENIOR")))

                // ============ VERSION CONTROL ============
                .add(RoadmapNode.create("vcs", "Version Control", "Version Control")
                        .withLevel("JUNIOR")
                        .add(RoadmapNode.create("git", "Git", "Git").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("github", "GitHub", "GitHub").withLevel("JUNIOR"))
                        .add(RoadmapNode.create("gitlab", "GitLab", "GitLab").withLevel("JUNIOR")))

                // ============ DATABASES ============
                .add(RoadmapNode.create("databases", "Databases", "ฐานข้อมูล")
                        .withLevel("MID")
                        .add(RoadmapNode.create("relational", "Relational Databases", "SQL DBs")
                                .withLevel("MID")
                                .add(RoadmapNode.create("postgresql", "PostgreSQL", "PostgreSQL").withLevel("MID"))
                                .add(RoadmapNode.create("mysql", "MySQL", "MySQL").withLevel("MID")))
                        .add(RoadmapNode.create("nosql", "NoSQL Databases", "NoSQL")
                                .withLevel("MID")
                                .add(RoadmapNode.create("mongodb", "MongoDB", "MongoDB").withLevel("MID"))
                                .add(RoadmapNode.create("redis", "Redis", "Redis").withLevel("MID"))
                                .add(RoadmapNode.create("elasticsearch", "Elasticsearch", "Search").withLevel("SENIOR")))
                        .add(RoadmapNode.create("orm", "ORMs", "ORM").withLevel("MID"))
                        .add(RoadmapNode.create("acid", "ACID", "ACID").withLevel("MID"))
                        .add(RoadmapNode.create("transactions", "Transactions", "Transactions").withLevel("MID"))
                        .add(RoadmapNode.create("n+1", "N+1 Problem", "N+1").withLevel("MID"))
                        .add(RoadmapNode.create("normalization", "Normalization", "Normalization").withLevel("MID"))
                        .add(RoadmapNode.create("indexes", "Indexes", "Indexes").withLevel("MID"))
                        .add(RoadmapNode.create("replication", "Replication", "Replication").withLevel("SENIOR"))
                        .add(RoadmapNode.create("sharding", "Sharding", "Sharding").withLevel("EXPERT")))

                // ============ APIS ============
                .add(RoadmapNode.create("apis", "APIs", "การออกแบบ APIs")
                        .withLevel("MID")
                        .add(RoadmapNode.create("rest", "REST", "REST APIs").withLevel("MID"))
                        .add(RoadmapNode.create("json", "JSON APIs", "JSON").withLevel("MID"))
                        .add(RoadmapNode.create("graphql", "GraphQL", "GraphQL").withLevel("SENIOR"))
                        .add(RoadmapNode.create("grpc", "gRPC", "gRPC").withLevel("SENIOR"))
                        .add(RoadmapNode.create("soap", "SOAP", "SOAP").withLevel("MID"))
                        .add(RoadmapNode.create("hateoas", "HATEOAS", "HATEOAS").withLevel("SENIOR"))
                        .add(RoadmapNode.create("openapi", "OpenAPI Spec", "Swagger").withLevel("MID")))

                // ============ CACHING ============
                .add(RoadmapNode.create("caching", "Caching", "การ Cache")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("cdn", "CDN", "CDN").withLevel("SENIOR"))
                        .add(RoadmapNode.create("server-side", "Server-side Caching", "Server Cache").withLevel("SENIOR"))
                        .add(RoadmapNode.create("redis-cache", "Redis", "Redis").withLevel("SENIOR"))
                        .add(RoadmapNode.create("memcached", "Memcached", "Memcached").withLevel("SENIOR")))

                // ============ SECURITY ============
                .add(RoadmapNode.create("security", "Web Security", "ความปลอดภัย")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("https", "HTTPS", "HTTPS").withLevel("MID"))
                        .add(RoadmapNode.create("cors", "CORS", "CORS").withLevel("MID"))
                        .add(RoadmapNode.create("csp", "Content Security Policy", "CSP").withLevel("SENIOR"))
                        .add(RoadmapNode.create("owasp", "OWASP Risks", "OWASP").withLevel("SENIOR"))
                        .add(RoadmapNode.create("hashing", "Hashing (bcrypt, scrypt)", "Hashing").withLevel("SENIOR"))
                        .add(RoadmapNode.create("ssl-tls", "SSL/TLS", "SSL/TLS").withLevel("SENIOR")))

                // ============ AUTHENTICATION ============
                .add(RoadmapNode.create("auth", "Authentication", "การยืนยันตัวตน")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("basic-auth", "Basic Auth", "Basic").withLevel("MID"))
                        .add(RoadmapNode.create("token-auth", "Token Auth", "Token").withLevel("SENIOR"))
                        .add(RoadmapNode.create("oauth", "OAuth", "OAuth").withLevel("SENIOR"))
                        .add(RoadmapNode.create("jwt", "JWT", "JWT").withLevel("SENIOR"))
                        .add(RoadmapNode.create("sso", "SSO", "SSO").withLevel("SENIOR"))
                        .add(RoadmapNode.create("saml", "SAML", "SAML").withLevel("EXPERT")))

                // ============ TESTING ============
                .add(RoadmapNode.create("testing", "Testing", "การทดสอบ")
                        .withLevel("MID")
                        .add(RoadmapNode.create("unit", "Unit Testing", "Unit").withLevel("MID"))
                        .add(RoadmapNode.create("integration", "Integration Testing", "Integration").withLevel("MID"))
                        .add(RoadmapNode.create("functional", "Functional Testing", "Functional").withLevel("SENIOR"))
                        .add(RoadmapNode.create("e2e", "E2E Testing", "E2E").withLevel("SENIOR")))

                // ============ CI/CD ============
                .add(RoadmapNode.create("cicd", "CI/CD", "Continuous Integration/Deployment")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("github-actions", "GitHub Actions", "GitHub Actions").withLevel("MID"))
                        .add(RoadmapNode.create("jenkins", "Jenkins", "Jenkins").withLevel("SENIOR"))
                        .add(RoadmapNode.create("gitlab-ci", "GitLab CI", "GitLab CI").withLevel("SENIOR"))
                        .add(RoadmapNode.create("circle-ci", "CircleCI", "CircleCI").withLevel("SENIOR")))

                // ============ DESIGN PATTERNS ============
                .add(RoadmapNode.create("patterns", "Design & Development Principles", "หลักการออกแบบ")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("solid", "SOLID", "SOLID").withLevel("SENIOR"))
                        .add(RoadmapNode.create("kiss", "KISS", "Keep It Simple").withLevel("MID"))
                        .add(RoadmapNode.create("yagni", "YAGNI", "You Aren't Gonna Need It").withLevel("MID"))
                        .add(RoadmapNode.create("dry", "DRY", "Don't Repeat Yourself").withLevel("MID"))
                        .add(RoadmapNode.create("gof", "GoF Design Patterns", "Design Patterns").withLevel("SENIOR"))
                        .add(RoadmapNode.create("ddd", "Domain-Driven Design", "DDD").withLevel("EXPERT"))
                        .add(RoadmapNode.create("tdd", "Test-Driven Development", "TDD").withLevel("SENIOR")))

                // ============ ARCHITECTURAL PATTERNS ============
                .add(RoadmapNode.create("architecture", "Architectural Patterns", "สถาปัตยกรรม")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("monolithic", "Monolithic Apps", "Monolith").withLevel("MID"))
                        .add(RoadmapNode.create("microservices", "Microservices", "Microservices").withLevel("SENIOR"))
                        .add(RoadmapNode.create("soa", "SOA", "SOA").withLevel("SENIOR"))
                        .add(RoadmapNode.create("serverless", "Serverless", "Serverless").withLevel("SENIOR"))
                        .add(RoadmapNode.create("service-mesh", "Service Mesh", "Istio/Linkerd").withLevel("EXPERT")))

                // ============ MESSAGE BROKERS ============
                .add(RoadmapNode.create("message-brokers", "Message Brokers", "Message Queue")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("rabbitmq", "RabbitMQ", "RabbitMQ").withLevel("SENIOR"))
                        .add(RoadmapNode.create("kafka", "Kafka", "Kafka").withLevel("SENIOR"))
                        .add(RoadmapNode.create("sqs", "AWS SQS", "SQS").withLevel("SENIOR")))

                // ============ CONTAINERIZATION ============
                .add(RoadmapNode.create("containerization", "Containerization", "Containers")
                        .withLevel("SENIOR")
                        .add(RoadmapNode.create("docker", "Docker", "Docker").withLevel("MID"))
                        .add(RoadmapNode.create("kubernetes", "Kubernetes", "K8s").withLevel("SENIOR"))
                        .add(RoadmapNode.create("lxc", "LXC", "LXC").withLevel("EXPERT")))

                // ============ WEB SERVERS ============
                .add(RoadmapNode.create("webservers", "Web Servers", "Web Server")
                        .withLevel("MID")
                        .add(RoadmapNode.create("nginx", "Nginx", "Nginx").withLevel("MID"))
                        .add(RoadmapNode.create("apache", "Apache", "Apache").withLevel("MID"))
                        .add(RoadmapNode.create("caddy", "Caddy", "Caddy").withLevel("MID")))

                // ============ SCALING ============
                .add(RoadmapNode.create("scaling", "Building for Scale", "การ Scale")
                        .withLevel("EXPERT")
                        .add(RoadmapNode.create("mitigation", "Mitigation Strategies", "Mitigation").withLevel("SENIOR"))
                        .add(RoadmapNode.create("horizontal", "Horizontal Scaling", "Horizontal").withLevel("SENIOR"))
                        .add(RoadmapNode.create("vertical", "Vertical Scaling", "Vertical").withLevel("SENIOR"))
                        .add(RoadmapNode.create("observability", "Observability", "Monitoring").withLevel("SENIOR")
                                .add(RoadmapNode.create("logging", "Logging", "Logs").withLevel("SENIOR"))
                                .add(RoadmapNode.create("monitoring", "Monitoring", "Metrics").withLevel("SENIOR"))
                                .add(RoadmapNode.create("tracing", "Tracing", "Tracing").withLevel("SENIOR"))));
    }
}
