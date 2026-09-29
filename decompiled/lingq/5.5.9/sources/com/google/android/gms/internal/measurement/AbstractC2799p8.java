package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2799p8 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f14391a;

    public AbstractC2799p8(Unsafe unsafe) {
        this.f14391a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo8127a(long j10, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract float mo8128b(long j10, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract void mo8129c(Object obj, long j10, boolean z10);

    /* JADX INFO: renamed from: d */
    public abstract void mo8130d(Object obj, long j10, byte b10);

    /* JADX INFO: renamed from: e */
    public abstract void mo8131e(Object obj, long j10, double d10);

    /* JADX INFO: renamed from: f */
    public abstract void mo8132f(Object obj, long j10, float f3);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo8133g(long j10, Object obj);
}
