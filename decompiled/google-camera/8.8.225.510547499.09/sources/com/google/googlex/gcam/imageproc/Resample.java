package com.google.googlex.gcam.imageproc;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import p000.lku;
import p000.nrn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Resample {
    private Resample() {
    }

    /* JADX INFO: renamed from: a */
    public static void m5157a(InterleavedReadViewU8 interleavedReadViewU8, nrn nrnVar, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long j = interleavedReadViewU8.f8300a;
        long jM5019a = InterleavedWriteViewU8.m5019a(interleavedWriteViewU8);
        lku.m15670x(j != 0, "src is null");
        lku.m15670x(jM5019a != 0, "dst is null");
        rotateInterleavedU8Impl(j, nrnVar.f44260j, jM5019a);
    }

    /* JADX INFO: renamed from: b */
    public static void m5158b(YuvReadView yuvReadView, nrn nrnVar, YuvWriteView yuvWriteView) {
        long j = yuvReadView.f8391a;
        long jM5150c = YuvWriteView.m5150c(yuvWriteView);
        lku.m15670x(j != 0, "src is null");
        lku.m15670x(jM5150c != 0, "dst is null");
        rotateYuvImpl(j, nrnVar.f44260j, jM5150c);
    }

    public static native boolean downsampleImpl(long j, int i, long j2);

    public static native boolean resampleLanczosYuvImpl(long j, float f, long j2);

    private static native boolean rotateInterleavedU8Impl(long j, int i, long j2);

    private static native boolean rotateYuvImpl(long j, int i, long j2);

    private static native int[] rotatedSizeImpl(int i, int i2, int i3);
}
