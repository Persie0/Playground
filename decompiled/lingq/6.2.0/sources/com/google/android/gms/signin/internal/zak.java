package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new y3a(16);

    /* JADX INFO: renamed from: a */
    public final int f12460a;

    /* JADX INFO: renamed from: b */
    public final ConnectionResult f12461b;

    /* JADX INFO: renamed from: c */
    public final zay f12462c;

    public zak(int i, ConnectionResult connectionResult, zay zayVar) {
        this.f12460a = i;
        this.f12461b = connectionResult;
        this.f12462c = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f12460a);
        l70.m15929T(parcel, 2, this.f12461b, i);
        l70.m15929T(parcel, 3, this.f12462c, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
