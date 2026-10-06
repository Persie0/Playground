package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mes implements mer {
    @Override // p000.mer
    /* JADX INFO: renamed from: a */
    public final void mo4733a() {
    }

    @Override // p000.mer
    public final void close(long j, long j2, long j3, long j4) {
    }

    @Override // p000.mer
    public final boolean disableSubpipeline(long j, String str) {
        return true;
    }

    @Override // p000.mer
    public final boolean enableSubpipeline(long j, String str) {
        return true;
    }

    @Override // p000.mer
    public final long initialize(byte[] bArr, long j, long j2, long j3, long j4) {
        return 1L;
    }

    @Override // p000.mer
    public final long initializeFrameBufferReleaseCallback(long j) {
        return 1L;
    }

    @Override // p000.mer
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // p000.mer
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // p000.mer
    public final boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        return true;
    }

    @Override // p000.mer
    public final void resetSchedulingOptimizerOptions(long j, byte[] bArr) {
    }

    @Override // p000.mer
    public final void start(long j) {
    }

    @Override // p000.mer
    public final boolean stop(long j) {
        return true;
    }

    @Override // p000.mer
    public final void waitUntilIdle(long j) {
    }
}
