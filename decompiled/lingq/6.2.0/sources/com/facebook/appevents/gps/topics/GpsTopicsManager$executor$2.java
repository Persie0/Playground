package com.facebook.appevents.gps.topics;

import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;
import p000.ui3;

/* JADX INFO: loaded from: classes2.dex */
final class GpsTopicsManager$executor$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final GpsTopicsManager$executor$2 f11400b = new GpsTopicsManager$executor$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        return Executors.newCachedThreadPool();
    }
}
