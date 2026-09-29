package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2773n8 extends AbstractC2799p8 {
    public C2773n8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2799p8
    /* JADX INFO: renamed from: a */
    public final double mo8127a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f14391a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2799p8
    /* JADX INFO: renamed from: b */
    public final float mo8128b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f14391a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2799p8
    /* JADX INFO: renamed from: c */
    public final void mo8129c(Object obj, long j10, boolean z10) {
        if (C2812q8.f14405g) {
            C2812q8.m8215c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            C2812q8.m8216d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2799p8
    /* JADX INFO: renamed from: d */
    public final void mo8130d(Object obj, long j10, byte b10) {
        if (C2812q8.f14405g) {
            C2812q8.m8215c(obj, j10, b10);
        } else {
            C2812q8.m8216d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2799p8
    /* JADX INFO: renamed from: e */
    public final void mo8131e(Object obj, long j10, double d10) {
        this.f14391a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2799p8
    /* JADX INFO: renamed from: f */
    public final void mo8132f(Object obj, long j10, float f3) {
        this.f14391a.putInt(obj, j10, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2799p8
    /* JADX INFO: renamed from: g */
    public final boolean mo8133g(long j10, Object obj) {
        return C2812q8.f14405g ? C2812q8.m8231s(j10, obj) : C2812q8.m8232t(j10, obj);
    }
}
