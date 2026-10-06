package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import p000.lku;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ImageUtils {
    private ImageUtils() {
    }

    /* JADX INFO: renamed from: a */
    public static void m5154a(InterleavedReadViewU8 interleavedReadViewU8, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long j = interleavedReadViewU8.f8300a;
        long jM5019a = InterleavedWriteViewU8.m5019a(interleavedWriteViewU8);
        lku.m15670x(j != 0, "src is null");
        lku.m15670x(jM5019a != 0, "dst is null");
        copyContentsImpl(j, jM5019a);
    }

    private static native void copyContentsImpl(long j, long j2);

    public static native boolean simpleRgbToAnyRgbImpl(long j, int i, long j2);
}
