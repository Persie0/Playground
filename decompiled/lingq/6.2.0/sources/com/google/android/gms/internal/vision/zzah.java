package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new y3a(25);

    /* JADX INFO: renamed from: a */
    public final zzao[] f12273a;

    /* JADX INFO: renamed from: b */
    public final zzab f12274b;

    /* JADX INFO: renamed from: c */
    public final zzab f12275c;

    /* JADX INFO: renamed from: d */
    public final zzab f12276d;

    /* JADX INFO: renamed from: e */
    public final String f12277e;

    /* JADX INFO: renamed from: f */
    public final float f12278f;

    /* JADX INFO: renamed from: g */
    public final String f12279g;

    /* JADX INFO: renamed from: h */
    public final int f12280h;

    /* JADX INFO: renamed from: i */
    public final boolean f12281i;

    /* JADX INFO: renamed from: j */
    public final int f12282j;

    /* JADX INFO: renamed from: k */
    public final int f12283k;

    public zzah(zzao[] zzaoVarArr, zzab zzabVar, zzab zzabVar2, zzab zzabVar3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.f12273a = zzaoVarArr;
        this.f12274b = zzabVar;
        this.f12275c = zzabVar2;
        this.f12276d = zzabVar3;
        this.f12277e = str;
        this.f12278f = f;
        this.f12279g = str2;
        this.f12280h = i;
        this.f12281i = z;
        this.f12282j = i2;
        this.f12283k = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15933X(parcel, 2, this.f12273a, i);
        l70.m15929T(parcel, 3, this.f12274b, i);
        l70.m15929T(parcel, 4, this.f12275c, i);
        l70.m15929T(parcel, 5, this.f12276d, i);
        l70.m15930U(parcel, 6, this.f12277e);
        l70.m15935Z(parcel, 7, 4);
        parcel.writeFloat(this.f12278f);
        l70.m15930U(parcel, 8, this.f12279g);
        l70.m15935Z(parcel, 9, 4);
        parcel.writeInt(this.f12280h);
        l70.m15935Z(parcel, 10, 4);
        parcel.writeInt(this.f12281i ? 1 : 0);
        l70.m15935Z(parcel, 11, 4);
        parcel.writeInt(this.f12282j);
        l70.m15935Z(parcel, 12, 4);
        parcel.writeInt(this.f12283k);
        l70.m15939b0(parcel, iM15937a0);
    }
}
