package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zaw;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new y3a(15);

    /* JADX INFO: renamed from: a */
    public final int f12458a;

    /* JADX INFO: renamed from: b */
    public final zaw f12459b;

    public zai(int i, zaw zawVar) {
        this.f12458a = i;
        this.f12459b = zawVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f12458a);
        l70.m15929T(parcel, 2, this.f12459b, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
