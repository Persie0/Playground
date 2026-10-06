package com.google.android.apps.camera.autotimer.analysis.jni;

import p000.kbi;
import p000.kpw;
import p000.nxf;
import p000.nxq;
import p000.nyb;
import p000.odh;
import p000.odq;
import p000.oef;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class Curator implements BaseCurator {
    private long pointer;

    public Curator(odq odqVar) {
        kbi.m13939b(Curator.class, "smartcapture_native");
        nativeAllocate();
        nativeInitialize(odqVar.mo17760J());
    }

    private native void nativeAllocate();

    private native void nativeDispose();

    private native void nativeInitialize(byte[] bArr);

    private native byte[] nativeProcessImage(AnalysisImage analysisImage, byte[] bArr);

    private native void nativeReset();

    private native void nativeSetSaveAllowed(boolean z);

    private native void nativeTriggerCapture();

    private native void nativeUpdateCaptureTriggers(byte[] bArr);

    private native void nativeUpdateIndividualCaptureTrigger(int i);

    @Override // com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator
    /* JADX INFO: renamed from: a */
    public final oef mo4036a(kpw kpwVar, odh odhVar) throws nyb {
        byte[] bArrNativeProcessImage = nativeProcessImage(new AnalysisImage(kpwVar), odhVar.mo17760J());
        nxq nxqVarM18123Q = nxq.m18123Q(oef.f45720e, bArrNativeProcessImage, 0, bArrNativeProcessImage.length, nxf.f44904a);
        nxq.m18132ae(nxqVarM18123Q);
        return (oef) nxqVarM18123Q;
    }

    @Override // com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator
    /* JADX INFO: renamed from: b */
    public final void mo4037b(boolean z) {
        nativeSetSaveAllowed(z);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        nativeDispose();
    }

    public native void nativeSetCaptureEnabled(boolean z);
}
