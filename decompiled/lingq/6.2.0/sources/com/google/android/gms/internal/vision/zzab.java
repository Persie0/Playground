package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new y3a(23);

    /* JADX INFO: renamed from: a */
    public final int f12268a;

    /* JADX INFO: renamed from: b */
    public final int f12269b;

    /* JADX INFO: renamed from: c */
    public final int f12270c;

    /* JADX INFO: renamed from: d */
    public final int f12271d;

    /* JADX INFO: renamed from: e */
    public final float f12272e;

    public zzab(int i, int i2, int i3, int i4, float f) {
        this.f12268a = i;
        this.f12269b = i2;
        this.f12270c = i3;
        this.f12271d = i4;
        this.f12272e = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f12268a);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f12269b);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f12270c);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f12271d);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeFloat(this.f12272e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
