package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.dfd;
import p000.l70;
import p000.nbd;
import p000.ycd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new nbd(2);

    /* JADX INFO: renamed from: a */
    public final boolean f11765a;

    /* JADX INFO: renamed from: b */
    public final String f11766b;

    /* JADX INFO: renamed from: c */
    public final int f11767c;

    /* JADX INFO: renamed from: d */
    public final int f11768d;

    /* JADX INFO: renamed from: e */
    public final long f11769e;

    public zzr(int i, int i2, long j, String str, boolean z) {
        this.f11765a = z;
        this.f11766b = str;
        this.f11767c = dfd.m10325b(i) - 1;
        this.f11768d = ycd.m25072b(i2) - 1;
        this.f11769e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11765a ? 1 : 0);
        l70.m15930U(parcel, 2, this.f11766b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11767c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11768d);
        l70.m15935Z(parcel, 5, 8);
        parcel.writeLong(this.f11769e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
