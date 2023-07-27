package org.greenrobot.eventbusp.android;

import android.os.Looper;
import org.greenrobot.eventbusp.EventBus;
import org.greenrobot.eventbusp.HandlerPoster;
import org.greenrobot.eventbusp.MainThreadSupport;
import org.greenrobot.eventbusp.Poster;

public class DefaultAndroidMainThreadSupport implements MainThreadSupport {

    @Override
    public boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    @Override
    public Poster createPoster(EventBus eventBus) {
        return new HandlerPoster(eventBus, Looper.getMainLooper(), 10);
    }
}
