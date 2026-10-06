package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.geo.lightfield.processing.ProgressCallback;
import p000.ekj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NativePoseEstimatorImpl implements ekj {
    static {
        System.loadLibrary("cyclops");
    }

    @Override // p000.ekj
    public native boolean computePose(String str, ProgressCallback progressCallback);
}
