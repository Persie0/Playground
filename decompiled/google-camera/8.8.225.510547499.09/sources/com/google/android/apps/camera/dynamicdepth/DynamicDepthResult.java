package com.google.android.apps.camera.dynamicdepth;

import android.hardware.camera2.CaptureResult;
import p000.dnr;
import p000.kba;
import p000.kbc;
import p000.kpp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DynamicDepthResult implements kba {

    /* JADX INFO: renamed from: a */
    public long f6629a;

    public DynamicDepthResult(int i, int i2, boolean z) {
        dnr.m6442a();
        this.f6629a = alloc(i, i2, 0, false, z, null, null);
    }

    private static native long alloc(int i, int i2, int i3, boolean z, boolean z2, float[] fArr, float[] fArr2);

    private static native void dealloc(long j);

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        dealloc(this.f6629a);
        this.f6629a = 0L;
    }

    public DynamicDepthResult(kbc kbcVar, int i, boolean z, boolean z2, kpp kppVar) {
        float[] fArr;
        float[] fArr2;
        if (kppVar != null) {
            float[] fArr3 = (float[]) kppVar.mo9517d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
            fArr2 = (float[]) kppVar.mo9517d(CaptureResult.LENS_DISTORTION);
            fArr = fArr3;
        } else {
            fArr = null;
            fArr2 = null;
        }
        this.f6629a = alloc(kbcVar.f35517a, kbcVar.f35518b, i, z, z2, fArr, fArr2);
    }
}
