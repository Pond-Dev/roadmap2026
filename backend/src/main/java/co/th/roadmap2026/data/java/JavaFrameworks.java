package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaFrameworks {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("frameworks", "Frameworks", "Frameworks")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("spring", "Spring Framework", "Spring")
                        .withLevel("SENIOR")
                        .add(RoadmapTopic.create("spring-core", "Spring Core", "Core").withLevel("SENIOR")
                                .withContent("""
                                        # Spring Core
                                        ## 🎯 สิ่งที่ต้องเรียนรู้
                                        - **IoC Container**: จัดการ object lifecycle
                                        - **Dependency Injection**: @Autowired
                                        - **Beans**: Objects ที่ Spring จัดการ
                                        - **Configuration**: @Configuration, @Bean
                                        """))
                        .add(RoadmapTopic.create("spring-boot", "Spring Boot", "Boot").withLevel("SENIOR")
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
                        .add(RoadmapTopic.create("spring-mvc", "Spring MVC", "MVC").withLevel("SENIOR")
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
                        .add(RoadmapTopic.create("spring-data", "Spring Data JPA", "Data").withLevel("SENIOR")
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
                        .add(RoadmapTopic.create("spring-security", "Spring Security", "Security").withLevel("SENIOR")
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
                        .add(RoadmapTopic.create("spring-cloud", "Spring Cloud", "Cloud").withLevel("EXPERT")
                                .withContent("""
                                        # Spring Cloud
                                        ## 🎯 สำหรับ Microservices
                                        - **Config Server**: จัดการ configuration ศูนย์กลาง
                                        - **Eureka**: Service Discovery
                                        - **Gateway**: API Gateway
                                        - **Circuit Breaker**: Resilience4j
                                        """)))
                .add(RoadmapTopic.create("hibernate", "Hibernate / JPA", "ORM").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("quarkus", "Quarkus", "Quarkus").withLevel("EXPERT")
                        .withContent("""
                                # Quarkus
                                ## 🎯 "Supersonic Subatomic Java"
                                - เร็วมาก, memory ต่ำ
                                - เหมาะกับ Containers/Serverless
                                - GraalVM Native Image support
                                """))
                .add(RoadmapTopic.create("micronaut", "Micronaut", "Micronaut").withLevel("EXPERT")
                        .withContent("""
                                # Micronaut
                                ## 🎯 คืออะไร?
                                - Modern JVM framework
                                - Compile-time DI (ไม่ใช้ reflection)
                                - เหมาะกับ Microservices
                                - GraalVM support
                                """));
    }
}
