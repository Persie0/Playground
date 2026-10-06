package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import p000.lku;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class YuvUtils {
    /* JADX INFO: renamed from: a */
    public static boolean m5155a(YuvReadView yuvReadView, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long j = yuvReadView.f8391a;
        long jM5019a = InterleavedWriteViewU8.m5019a(interleavedWriteViewU8);
        lku.m15670x(j != 0, "src view is null");
        lku.m15670x(jM5019a != 0, "dst view is null");
        return yuvToRgbImpl(j, jM5019a);
    }

    public static native boolean rgbToYuvImpl(long j, long j2);

    private static native boolean yuvToRgbImpl(long j, long j2);
}
