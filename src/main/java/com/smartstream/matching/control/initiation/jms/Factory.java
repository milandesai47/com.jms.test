package com.smartstream.matching.control.initiation.jms;

import org.springframework.jms.listener.DefaultMessageListenerContainer;

public class Factory {
    private DefaultMessageListenerContainer testListnerService;

    public void start() {

        final TestMessageListener testMessageListener = new TestMessageListener();
        testListnerService = new DefaultMessageListenerContainer();
        testListnerService.setMessageListener(testMessageListener);
        testListnerService.setSessionTransacted(true);
        testListnerService.afterPropertiesSet();
    }

    public void stop() {

        if (testListnerService != null) {
            testListnerService.destroy();
            testListnerService = null;
        }

    }

}
