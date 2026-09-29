package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new qmb(26);

    /* JADX INFO: renamed from: a */
    public final String f12394a;

    /* JADX INFO: renamed from: b */
    public final long f12395b;

    /* JADX INFO: renamed from: c */
    public final int f12396c;

    public zzoh(String str, int i, long j) {
        this.f12394a = str;
        this.f12395b = j;
        this.f12396c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f12394a);
        l70.m15935Z(parcel, 2, 8);
        parcel.writeLong(this.f12395b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f12396c);
        l70.m15939b0(parcel, iM15937a0);
    }
}
