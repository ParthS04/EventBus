package org.greenrobot.eventbusp;

import org.greenrobot.eventbusp.android.AndroidComponents;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AndroidComponentsAvailabilityTest {

    @Test
    public void shouldBeAvailable() {
        assertTrue(AndroidComponents.areAvailable());
        assertNotNull(AndroidComponents.get());
    }
}
