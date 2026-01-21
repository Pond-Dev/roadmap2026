package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaConcurrency {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("concurrency", "Concurrency", "การทำงานพร้อมกัน")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("threads", "Threads", "Threads").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("runnable", "Runnable & Callable", "Runnable/Callable").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("executors", "Executor Service", "Executors").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("synchronization", "Synchronization", "Sync").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("locks", "Locks", "Locks").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("completable-future", "CompletableFuture", "Async").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("virtual-threads", "Virtual Threads", "Java 21+").withLevel("EXPERT")
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
                                """));
    }
}
