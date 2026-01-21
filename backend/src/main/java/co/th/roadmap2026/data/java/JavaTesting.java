package co.th.roadmap2026.data.java;

import co.th.roadmap2026.model.RoadmapTopic;

public class JavaTesting {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("testing", "Testing", "การทดสอบ")
                .withLevel("MID")
                .add(RoadmapTopic.create("junit", "JUnit 5", "JUnit").withLevel("MID")
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
                .add(RoadmapTopic.create("mockito", "Mockito", "Mocking").withLevel("MID")
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
                .add(RoadmapTopic.create("integration", "Integration Testing", "Integration").withLevel("SENIOR")
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
                .add(RoadmapTopic.create("testcontainers", "Testcontainers", "Testcontainers").withLevel("SENIOR")
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
                                """));
    }
}
