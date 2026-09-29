package com.google.android.gms.internal.measurement;

import android.support.v4.media.C0141b;

/* JADX INFO: loaded from: classes.dex */
final class zzik extends zzii {

    /* JADX INFO: renamed from: a */
    public final Object f14538a;

    public zzik(Object obj) {
        this.f14538a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    /* JADX INFO: renamed from: a */
    public final Object mo8476a() {
        return this.f14538a;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    /* JADX INFO: renamed from: b */
    public final boolean mo8477b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzik) {
            return this.f14538a.equals(((zzik) obj).f14538a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14538a.hashCode() + 1502476572;
    }

    public final String toString() {
        return C0141b.m611g("Optional.of(", this.f14538a.toString(), ")");
    }
}
