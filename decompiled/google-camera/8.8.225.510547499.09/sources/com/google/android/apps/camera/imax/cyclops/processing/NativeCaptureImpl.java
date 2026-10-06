package com.google.android.apps.camera.imax.cyclops.processing;

import android.graphics.Bitmap;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import p000.ekf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NativeCaptureImpl implements ekf {

    /* JADX INFO: renamed from: a */
    public final int f6742a;

    /* JADX INFO: renamed from: b */
    public final float f6743b;
    private long nativeRef;

    static {
        System.loadLibrary("cyclops");
    }

    public NativeCaptureImpl() {
        this(512, 60.0f);
    }

    public NativeCaptureImpl(int i, float f) {
        this.nativeRef = 0L;
        this.f6742a = i;
        this.f6743b = f;
    }

    @Override // p000.ekf
    public native float getCaptureProgress();

    @Override // p000.ekf
    public native Bitmap getPreview(int i);

    @Override // p000.ekf
    public native Texture getPreviewAsTexture();

    @Override // p000.ekf
    public native void getTrackerStats(TrackerStats trackerStats);

    public native void initialize(int i, int i2, int i3, int i4, int i5, float f);

    @Override // p000.ekf
    public native void release();

    @Override // p000.ekf
    public native void setMetaData(float f, int i, boolean z, int i2, boolean z2);

    @Override // p000.ekf
    public native void startCapture();

    @Override // p000.ekf
    public native int stopCapture(String str);

    @Override // p000.ekf
    public native boolean trackTexture(float[] fArr, float[] fArr2);
}
