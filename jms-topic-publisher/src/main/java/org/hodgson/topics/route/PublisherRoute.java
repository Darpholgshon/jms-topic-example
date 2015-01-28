package org.hodgson.topics.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 12/11/2014 16:13
 * <p>
 * ****************************************************************************************
 */
@Component
public class PublisherRoute extends RouteBuilder {
  @Override
  public void configure()
          throws Exception {
    rest("/publish")
            .post("/")
            .to("direct:publish.process");

    from("direct:publish.process")
            .log(LoggingLevel.INFO, "Content-Type :: ${headers.Content-Type}")
            .log(LoggingLevel.INFO, "Received: ${body}")
            .inOnly("activemq:topic:hodgson-publish-test")
            .setBody(constant(null));
  }
}
