package com.google.android.apps.camera.rectiface.jni;

import p000.guh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RectifaceOutput {

    /* JADX INFO: renamed from: a */
    public final long f6892a = initializeImpl();

    static {
        guh.m9772a();
    }

    public static native int getAnglerfishFallbackStatusImpl(long j, int i);

    private static native int getAnglerfishFallbackStatusSizeImpl(long j);

    private static native int getCameraFovInDegreeImpl(long j);

    private static native float getFaceConformalityAfterShapeCorrectionImpl(long j, int i);

    private static native int getFaceConformalityAfterShapeCorrectionSizeImpl(long j);

    private static native float getFaceConformalityBeforeShapeCorrectionImpl(long j, int i);

    private static native int getFaceConformalityBeforeShapeCorrectionSizeImpl(long j);

    private static native int getFaceDistortionCorrectionProcessingTimeMsImpl(long j);

    public static native boolean getIsAnglerfishAppliedImpl(long j);

    private static native int getPortraitRelightingTimeMsImpl(long j);

    private static native int getSegmentationTimeMsImpl(long j);

    private static native int getShapeCorrectionModeImpl(long j);

    private static native long initializeImpl();

    private static native void releaseImpl(long j);

    /* JADX INFO: renamed from: a */
    public final float m4269a(int i) {
        return getFaceConformalityAfterShapeCorrectionImpl(this.f6892a, i);
    }

    /* JADX INFO: renamed from: b */
    public final float m4270b(int i) {
        return getFaceConformalityBeforeShapeCorrectionImpl(this.f6892a, i);
    }

    /* JADX INFO: renamed from: c */
    public final int m4271c() {
        return getAnglerfishFallbackStatusSizeImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: d */
    public final int m4272d() {
        return getCameraFovInDegreeImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: e */
    public final int m4273e() {
        return getFaceConformalityAfterShapeCorrectionSizeImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: f */
    public final int m4274f() {
        return getFaceConformalityBeforeShapeCorrectionSizeImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: g */
    public final int m4275g() {
        return getFaceDistortionCorrectionProcessingTimeMsImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: h */
    public final int m4276h() {
        return getPortraitRelightingTimeMsImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: i */
    public final int m4277i() {
        return getSegmentationTimeMsImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: j */
    public final int m4278j() {
        return getShapeCorrectionModeImpl(this.f6892a);
    }

    /* JADX INFO: renamed from: k */
    public final void m4279k() {
        releaseImpl(this.f6892a);
    }
}
