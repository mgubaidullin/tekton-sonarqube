package org.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class DemoRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
                .contextPath("/camel");

        rest()
                .get("/test")
                .produces(MediaType.TEXT_PLAIN_VALUE)
                .route().setBody(constant("OK"));

        from("timer:kafka?period=5s")
                .routeId("timerRoute")
                .log("Timer ${headers}");
    }
}
