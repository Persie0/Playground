package com.google.mediapipe.framework;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class GraphGlSyncToken implements GlSyncToken {

    /* JADX INFO: renamed from: a */
    private long f8422a;

    public GraphGlSyncToken(long j) {
        this.f8422a = j;
    }

    private static native void nativeRelease(long j);

    private static native void nativeWaitOnCpu(long j);

    private static native void nativeWaitOnGpu(long j);

    @Override // com.google.mediapipe.framework.GlSyncToken
    public final long nativeToken() {
        return this.f8422a;
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public final void release() {
        long j = this.f8422a;
        if (j != 0) {
            nativeRelease(j);
            this.f8422a = 0L;
        }
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public final void waitOnCpu() {
        long j = this.f8422a;
        if (j != 0) {
            nativeWaitOnCpu(j);
        }
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public final void waitOnGpu() {
        long j = this.f8422a;
        if (j != 0) {
            nativeWaitOnGpu(j);
        }
    }
}
