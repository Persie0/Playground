package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.AbstractC3393o1;
import p000.C3670v2;
import p000.lda;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new C3670v2(18);

    /* JADX INFO: renamed from: a */
    public final String f12389a;

    /* JADX INFO: renamed from: b */
    public final zzbf f12390b;

    /* JADX INFO: renamed from: c */
    public final String f12391c;

    /* JADX INFO: renamed from: d */
    public final long f12392d;

    /* JADX INFO: renamed from: e */
    public final long f12393e;

    public zzbh(zzbh zzbhVar, long j, long j2) {
        lda.m16130p(zzbhVar);
        this.f12389a = zzbhVar.f12389a;
        this.f12390b = zzbhVar.f12390b;
        this.f12391c = zzbhVar.f12391c;
        this.f12392d = j;
        this.f12393e = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12390b);
        String str = this.f12391c;
        int length = String.valueOf(str).length();
        String str2 = this.f12389a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        AbstractC3393o1.m17725C(sb, "origin=", str, ",name=", str2);
        return AbstractC3393o1.m17738m(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C3670v2.m23048a(this, parcel, i);
    }

    public zzbh(String str, zzbf zzbfVar, String str2, long j, long j2) {
        this.f12389a = str;
        this.f12390b = zzbfVar;
        this.f12391c = str2;
        this.f12392d = j;
        this.f12393e = j2;
    }
}
