package org.greenrobot.eventbusp.indexed;

import org.greenrobot.eventbusp.EventBusAndroidOrderTest;

public class EventBusAndroidOrderTestWithIndex extends EventBusAndroidOrderTest {

    @Override
    public void setUp() throws Exception {
        eventBus = Indexed.build();
        super.setUp();
    }

}
