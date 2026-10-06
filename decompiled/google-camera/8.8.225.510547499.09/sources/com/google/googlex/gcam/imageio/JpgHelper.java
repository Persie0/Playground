package com.google.googlex.gcam.imageio;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import p000.mrm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class JpgHelper {
    private JpgHelper() {
    }

    /* JADX INFO: renamed from: a */
    public static mrm m5156a(InterleavedReadViewU8 interleavedReadViewU8, JpgEncodeOptions jpgEncodeOptions, int i) {
        return mrm.m16828h(encodeRgbToJpegAsByteArrayImpl(interleavedReadViewU8.f8300a, jpgEncodeOptions.f8308a, i, -1.0f, -1.0f, -1.0f, 0));
    }

    public static native byte[] encodeRgbToJpegAsByteArrayImpl(long j, long j2, int i, float f, float f2, float f3, int i2);

    public static native byte[] encodeYuvToJpegAsByteArrayImpl(long j, long j2, int i, float f, float f2, float f3, int i2);
}
