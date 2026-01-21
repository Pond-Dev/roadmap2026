package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendSecurity {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("security", "Web Security", "ความปลอดภัย")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("https", "HTTPS", "HTTPS").withLevel("MID"))
                .add(RoadmapTopic.create("cors", "CORS", "CORS").withLevel("MID"))
                .add(RoadmapTopic.create("csp", "Content Security Policy", "CSP").withLevel("SENIOR"))
                .add(RoadmapTopic.create("owasp", "OWASP Risks", "OWASP").withLevel("SENIOR"))
                .add(RoadmapTopic.create("hashing", "Hashing (bcrypt, scrypt)", "Hashing").withLevel("SENIOR"))
                .add(RoadmapTopic.create("ssl-tls", "SSL/TLS", "SSL/TLS").withLevel("SENIOR"));
    }
}
