package com.google.android.apps.camera.hdrplus.fusion.jni;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FusionZoomControllerNative {
    public static native long clone(long j, long j2);

    public static native boolean initialize(String str, String str2);

    public static native boolean loadModelIntoCache(int i, long j, long j2);

    public static native long process(long j, long j2, long j3, long j4, long j5, InterleavedU8ClientAllocator interleavedU8ClientAllocator, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, float f3, FusionProgressCallback fusionProgressCallback, String str, long[] jArr, long j6, boolean z5);

    public static native long processLumaOnly(long j, long j2, long j3, long j4, long j5, InterleavedU8ClientAllocator interleavedU8ClientAllocator, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, float f3, FusionProgressCallback fusionProgressCallback, String str, long[] jArr, long j6, boolean z5);

    public static native long retrieveMoreDebugImage(long j, long j2);

    public static native int retrieveResultStatus(long j);
}
