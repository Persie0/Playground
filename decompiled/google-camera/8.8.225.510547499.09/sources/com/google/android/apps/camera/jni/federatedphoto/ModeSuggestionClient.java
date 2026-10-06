package com.google.android.apps.camera.jni.federatedphoto;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import p000.kba;
import p000.kbi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ModeSuggestionClient implements kba {

    /* JADX INFO: renamed from: a */
    public final long f6751a;

    /* JADX INFO: renamed from: b */
    public boolean f6752b;

    public ModeSuggestionClient() {
        kbi.m13939b(ModeSuggestionClient.class, BEeWZPor.SYkWRnMqNEPaTm);
        long jNativeCreateClient = nativeCreateClient("ICALabelSensorDenseV1");
        this.f6751a = jNativeCreateClient;
        if (jNativeCreateClient == 0) {
            throw new IllegalStateException("Could not initialize ModeSuggestionClient.");
        }
        this.f6752b = false;
    }

    private native void nativeClose(long j);

    private static native long nativeCreateClient(String str);

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f6752b) {
            nativeClose(this.f6751a);
            this.f6752b = true;
        }
    }
}
