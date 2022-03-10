package com.smartstream.matching.control.initiation.jms;

import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

public class TestMessageListener implements SessionAwareMessageListener<Message> {
    @Override
    public void onMessage(Message message, Session session) throws JMSException {
        //Do something with message
    }
}
