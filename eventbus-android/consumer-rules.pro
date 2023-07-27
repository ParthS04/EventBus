-keepattributes *Annotation*
-keepclassmembers class * {
    @org.greenrobot.eventbusp.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbusp.ThreadMode { *; }

# If using AsyncExecutord, keep required constructor of default event used.
# Adjust the class name if a custom failure event type is used.
-keepclassmembers class org.greenrobot.eventbusp.util.ThrowableFailureEvent {
    <init>(java.lang.Throwable);
}

# Accessed via reflection, avoid renaming or removal
-keep class org.greenrobot.eventbusp.android.AndroidComponentsImpl
