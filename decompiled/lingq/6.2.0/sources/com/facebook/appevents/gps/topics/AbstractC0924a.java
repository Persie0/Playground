package com.facebook.appevents.gps.topics;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3192a;
import p000.lp1;

/* JADX INFO: renamed from: com.facebook.appevents.gps.topics.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0924a {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f11401a;

    static {
        AbstractC0924a.class.toString().getClass();
        AbstractC3192a.m15356a(GpsTopicsManager$executor$2.f11400b);
        f11401a = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m5190a() {
        if (lp1.f49971a.contains(AbstractC0924a.class)) {
            return;
        }
        try {
            f11401a.set(true);
        } catch (Throwable th) {
            lp1.m16420a(AbstractC0924a.class, th);
        }
    }
}
