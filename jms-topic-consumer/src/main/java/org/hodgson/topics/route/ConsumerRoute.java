package org.hodgson.topics.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 23/01/2015 13:47
 * Description :
 * ****************************************************************************************
 */
@Component
public class ConsumerRoute extends RouteBuilder {
  @Override
  public void configure()
          throws Exception {
    from("activemq:topic:hodgson-publish-test")
            .to("bean:hodgsonListener?method=recv")
            .log(LoggingLevel.INFO, "Received: ${body}");
  }
}
