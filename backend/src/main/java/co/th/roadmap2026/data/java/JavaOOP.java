package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaOOP {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("oop", "Object Oriented Programming", "OOP")
                .withLevel("MID")
                .add(RoadmapTopic.create("classes", "Classes", "คลาส").withLevel("MID")
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
                .add(RoadmapTopic.create("objects", "Objects", "อ็อบเจกต์").withLevel("MID")
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
                .add(RoadmapTopic.create("interfaces", "Interfaces", "อินเทอร์เฟซ").withLevel("MID")
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
                .add(RoadmapTopic.create("inheritance", "Inheritance", "การสืบทอด").withLevel("MID")
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
                .add(RoadmapTopic.create("polymorphism", "Polymorphism", "พหุสัณฐาน").withLevel("MID")
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
                .add(RoadmapTopic.create("abstraction", "Abstraction", "Abstraction").withLevel("MID")
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
                .add(RoadmapTopic.create("encapsulation", "Encapsulation", "Encapsulation").withLevel("MID")
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
                                """));
    }
}
