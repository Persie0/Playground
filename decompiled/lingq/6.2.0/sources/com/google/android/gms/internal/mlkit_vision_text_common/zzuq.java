package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuq> CREATOR = new nbd(8);

    /* JADX INFO: renamed from: a */
    public final int f12138a;

    /* JADX INFO: renamed from: b */
    public final int f12139b;

    /* JADX INFO: renamed from: c */
    public final int f12140c;

    /* JADX INFO: renamed from: d */
    public final int f12141d;

    /* JADX INFO: renamed from: e */
    public final long f12142e;

    public zzuq(int i, int i2, int i3, int i4, long j) {
        this.f12138a = i;
        this.f12139b = i2;
        this.f12140c = i3;
        this.f12141d = i4;
        this.f12142e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f12138a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f12139b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f12140c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f12141d);
        l70.m15935Z(parcel, 5, 8);
        parcel.writeLong(this.f12142e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
