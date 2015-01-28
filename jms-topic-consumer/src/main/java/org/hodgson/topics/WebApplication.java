package org.hodgson.topics;

import com.pressassociation.commons.camel.annotation.EnableActiveMQ;
import com.pressassociation.commons.camel.annotation.EnableRestCamel;
import com.pressassociation.microservice.server.annotation.EnableStandaloneMicroserviceServer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 23/01/2015 11:50
 * Description :
 * ****************************************************************************************
 */
@EnableAutoConfiguration
@EnableStandaloneMicroserviceServer
@EnableRestCamel
@EnableActiveMQ
@ComponentScan
@Configuration
public class WebApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(WebApplication.class).web(true).run(args);
  }
}
