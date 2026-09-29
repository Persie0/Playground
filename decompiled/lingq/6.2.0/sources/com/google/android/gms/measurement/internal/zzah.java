package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.lda;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new y3a(28);

    /* JADX INFO: renamed from: a */
    public String f12376a;

    /* JADX INFO: renamed from: b */
    public String f12377b;

    /* JADX INFO: renamed from: c */
    public zzpl f12378c;

    /* JADX INFO: renamed from: d */
    public long f12379d;

    /* JADX INFO: renamed from: e */
    public boolean f12380e;

    /* JADX INFO: renamed from: f */
    public String f12381f;

    /* JADX INFO: renamed from: g */
    public final zzbh f12382g;

    /* JADX INFO: renamed from: h */
    public long f12383h;

    /* JADX INFO: renamed from: i */
    public zzbh f12384i;

    /* JADX INFO: renamed from: j */
    public final long f12385j;

    /* JADX INFO: renamed from: k */
    public final zzbh f12386k;

    public zzah(zzah zzahVar) {
        lda.m16130p(zzahVar);
        this.f12376a = zzahVar.f12376a;
        this.f12377b = zzahVar.f12377b;
        this.f12378c = zzahVar.f12378c;
        this.f12379d = zzahVar.f12379d;
        this.f12380e = zzahVar.f12380e;
        this.f12381f = zzahVar.f12381f;
        this.f12382g = zzahVar.f12382g;
        this.f12383h = zzahVar.f12383h;
        this.f12384i = zzahVar.f12384i;
        this.f12385j = zzahVar.f12385j;
        this.f12386k = zzahVar.f12386k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f12376a);
        l70.m15930U(parcel, 3, this.f12377b);
        l70.m15929T(parcel, 4, this.f12378c, i);
        long j = this.f12379d;
        l70.m15935Z(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f12380e;
        l70.m15935Z(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        l70.m15930U(parcel, 7, this.f12381f);
        l70.m15929T(parcel, 8, this.f12382g, i);
        long j2 = this.f12383h;
        l70.m15935Z(parcel, 9, 8);
        parcel.writeLong(j2);
        l70.m15929T(parcel, 10, this.f12384i, i);
        l70.m15935Z(parcel, 11, 8);
        parcel.writeLong(this.f12385j);
        l70.m15929T(parcel, 12, this.f12386k, i);
        l70.m15939b0(parcel, iM15937a0);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbh zzbhVar, long j2, zzbh zzbhVar2, long j3, zzbh zzbhVar3) {
        this.f12376a = str;
        this.f12377b = str2;
        this.f12378c = zzplVar;
        this.f12379d = j;
        this.f12380e = z;
        this.f12381f = str3;
        this.f12382g = zzbhVar;
        this.f12383h = j2;
        this.f12384i = zzbhVar2;
        this.f12385j = j3;
        this.f12386k = zzbhVar3;
    }
}
