package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import cc.C1928s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C1928s();

    /* JADX INFO: renamed from: a */
    public final String f14613a;

    /* JADX INFO: renamed from: b */
    public final zzau f14614b;

    /* JADX INFO: renamed from: c */
    public final String f14615c;

    /* JADX INFO: renamed from: d */
    public final long f14616d;

    public zzaw(zzaw zzawVar, long j10) {
        C6272i.m12915i(zzawVar);
        this.f14613a = zzawVar.f14613a;
        this.f14614b = zzawVar.f14614b;
        this.f14615c = zzawVar.f14615c;
        this.f14616d = j10;
    }

    public zzaw(String str, zzau zzauVar, String str2, long j10) {
        this.f14613a = str;
        this.f14614b = zzauVar;
        this.f14615c = str2;
        this.f14616d = j10;
    }

    public final String toString() {
        return "origin=" + this.f14615c + ",name=" + this.f14613a + ",params=" + String.valueOf(this.f14614b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C1928s.m5856a(this, parcel, i10);
    }
}
