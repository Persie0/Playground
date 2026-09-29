package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new y3a(26);

    /* JADX INFO: renamed from: a */
    public final long f12373a;

    /* JADX INFO: renamed from: b */
    public final int f12374b;

    /* JADX INFO: renamed from: c */
    public final long f12375c;

    public zzaf(int i, long j, long j2) {
        this.f12373a = j;
        this.f12374b = i;
        this.f12375c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 8);
        parcel.writeLong(this.f12373a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f12374b);
        l70.m15935Z(parcel, 3, 8);
        parcel.writeLong(this.f12375c);
        l70.m15939b0(parcel, iM15937a0);
    }
}
