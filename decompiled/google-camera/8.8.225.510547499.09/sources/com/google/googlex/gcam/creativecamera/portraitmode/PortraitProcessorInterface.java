package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class PortraitProcessorInterface implements AutoCloseable {

    /* JADX INFO: renamed from: b */
    private static final AtomicBoolean f8396b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public long f8397a;

    public PortraitProcessorInterface(long j, long j2, boolean z) {
        this.f8397a = 0L;
        if (f8396b.compareAndSet(false, true)) {
            init();
        }
        this.f8397a = create(j, j2, z);
    }

    private native long create(long j, long j2, boolean z);

    private native long createWithLevels(long j, long j2, int i, int i2, boolean z, boolean z2);

    private native void delete(long j);

    private static native void init();

    @Override // java.lang.AutoCloseable
    public final void close() {
        delete(this.f8397a);
        this.f8397a = 0L;
    }

    public native boolean processImpl(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z);
}
