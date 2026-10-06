package com.google.android.apps.camera.rectiface.jni;

import p000.gug;
import p000.guh;
import p000.kba;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RectifaceWarpfieldImpl implements gug, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f6893a = nbh.m17259h("com/google/android/apps/camera/rectiface/jni/RectifaceWarpfieldImpl");

    /* JADX INFO: renamed from: b */
    public long f6894b = 0;

    static {
        guh.m9772a();
    }

    public static native long initializeImpl();

    private static native void releaseImpl(long j);

    @Override // p000.gug
    /* JADX INFO: renamed from: a */
    public final long mo4280a() {
        return this.f6894b;
    }

    @Override // p000.gug, java.lang.AutoCloseable, p000.kba
    public final void close() {
        long j = this.f6894b;
        if (j != 0) {
            releaseImpl(j);
            this.f6894b = 0L;
        }
    }
}
