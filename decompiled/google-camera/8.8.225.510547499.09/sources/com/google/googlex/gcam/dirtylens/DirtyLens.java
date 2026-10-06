package com.google.googlex.gcam.dirtylens;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DirtyLens {

    /* JADX INFO: renamed from: a */
    private static final AtomicBoolean f8400a = new AtomicBoolean();

    public DirtyLens() {
        if (f8400a.compareAndSet(false, true)) {
            init();
        }
    }

    public static native boolean getDirtyLensRawScore(long j, float[] fArr);

    private static native void init();
}
