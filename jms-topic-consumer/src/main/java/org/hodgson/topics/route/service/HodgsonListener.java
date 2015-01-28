package org.hodgson.topics.route.service;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 23/01/2015 13:53
 * Description :
 * ****************************************************************************************
 */
@Service
public class HodgsonListener {
  protected static final Logger LOG = LoggerFactory.getLogger(HodgsonListener.class);

  public void recv(Exchange exchange)
          throws JMSException {
    LOG.info("RECV: {}", exchange.getIn().getBody(TextMessage.class).getText());
  }
}
