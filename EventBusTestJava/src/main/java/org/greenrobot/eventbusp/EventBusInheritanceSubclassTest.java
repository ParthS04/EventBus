package org.greenrobot.eventbusp;

import org.junit.Ignore;

// Need to use upper class or Android test runner does not pick it up
public class EventBusInheritanceSubclassTest extends EventBusInheritanceTest {
    int countMyEventOverwritten;

    @Subscribe
    public void onEvent(MyEvent event) {
        countMyEventOverwritten++;
    }

    @Override
    @Ignore
    public void testEventClassHierarchy() {
        // TODO fix test in super, then remove this
    }
}
