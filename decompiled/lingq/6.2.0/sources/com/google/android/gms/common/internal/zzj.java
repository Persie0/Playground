package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new qmb(20);

    /* JADX INFO: renamed from: a */
    public Bundle f11743a;

    /* JADX INFO: renamed from: b */
    public Feature[] f11744b;

    /* JADX INFO: renamed from: c */
    public int f11745c;

    /* JADX INFO: renamed from: d */
    public ConnectionTelemetryConfiguration f11746d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15924O(parcel, 1, this.f11743a);
        l70.m15933X(parcel, 2, this.f11744b, i);
        int i2 = this.f11745c;
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(i2);
        l70.m15929T(parcel, 4, this.f11746d, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
