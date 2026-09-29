package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new nbd(9);

    /* JADX INFO: renamed from: a */
    public int f12301a;

    /* JADX INFO: renamed from: b */
    public int f12302b;

    /* JADX INFO: renamed from: c */
    public int f12303c;

    /* JADX INFO: renamed from: d */
    public long f12304d;

    /* JADX INFO: renamed from: e */
    public int f12305e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        int i2 = this.f12301a;
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.f12302b;
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.f12303c;
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.f12304d;
        l70.m15935Z(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.f12305e;
        l70.m15935Z(parcel, 6, 4);
        parcel.writeInt(i5);
        l70.m15939b0(parcel, iM15937a0);
    }
}
