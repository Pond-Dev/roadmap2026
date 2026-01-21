package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendAuth {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("auth", "Authentication", "การยืนยันตัวตน")
                .withLevel("SENIOR")
                .add(RoadmapTopic.create("basic-auth", "Basic Auth", "Basic").withLevel("MID"))
                .add(RoadmapTopic.create("token-auth", "Token Auth", "Token").withLevel("SENIOR"))
                .add(RoadmapTopic.create("oauth", "OAuth", "OAuth").withLevel("SENIOR"))
                .add(RoadmapTopic.create("jwt", "JWT", "JWT").withLevel("SENIOR"))
                .add(RoadmapTopic.create("sso", "SSO", "SSO").withLevel("SENIOR"))
                .add(RoadmapTopic.create("saml", "SAML", "SAML").withLevel("EXPERT"));
    }
}
