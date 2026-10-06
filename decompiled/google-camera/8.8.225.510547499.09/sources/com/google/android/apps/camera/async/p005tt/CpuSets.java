package com.google.android.apps.camera.async.p005tt;

import p000.jay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class CpuSets {
    private CpuSets() {
    }

    /* JADX INFO: renamed from: a */
    public static jay m4035a(int i) {
        long jNativeDropCpuFromSet = nativeDropCpuFromSet(i, 2);
        if (jNativeDropCpuFromSet == 0) {
            return null;
        }
        return new jay(jNativeDropCpuFromSet);
    }

    private static native long nativeDropCpuFromSet(int i, int i2);

    public static native void nativeRestoreCpuSet(int i, long j);
}
