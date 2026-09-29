package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new y3a(9);

    /* JADX INFO: renamed from: a */
    public final int f11728a;

    /* JADX INFO: renamed from: b */
    public final String f11729b;

    /* JADX INFO: renamed from: c */
    public final long f11730c;

    /* JADX INFO: renamed from: d */
    public final int f11731d;

    /* JADX INFO: renamed from: e */
    public final boolean f11732e;

    public zab(int i, int i2, long j, String str, boolean z) {
        this.f11728a = i;
        this.f11729b = str;
        this.f11730c = j;
        this.f11731d = i2;
        this.f11732e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11728a);
        l70.m15930U(parcel, 2, this.f11729b);
        l70.m15935Z(parcel, 3, 8);
        parcel.writeLong(this.f11730c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11731d);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11732e ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
