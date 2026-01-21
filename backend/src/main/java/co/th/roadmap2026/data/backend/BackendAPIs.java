package co.th.roadmap2026.data.backend;

import co.th.roadmap2026.model.RoadmapTopic;

public class BackendAPIs {
    public static RoadmapTopic get() {
        return RoadmapTopic.create("apis", "APIs", "การออกแบบ APIs")
                .withLevel("MID")
                .add(RoadmapTopic.create("rest", "REST", "REST APIs").withLevel("MID"))
                .add(RoadmapTopic.create("json", "JSON APIs", "JSON").withLevel("MID"))
                .add(RoadmapTopic.create("graphql", "GraphQL", "GraphQL").withLevel("SENIOR"))
                .add(RoadmapTopic.create("grpc", "gRPC", "gRPC").withLevel("SENIOR"))
                .add(RoadmapTopic.create("soap", "SOAP", "SOAP").withLevel("MID"))
                .add(RoadmapTopic.create("hateoas", "HATEOAS", "HATEOAS").withLevel("SENIOR"))
                .add(RoadmapTopic.create("openapi", "OpenAPI Spec", "Swagger").withLevel("MID"));
    }
}
