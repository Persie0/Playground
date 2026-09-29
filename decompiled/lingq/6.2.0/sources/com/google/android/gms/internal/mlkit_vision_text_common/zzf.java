package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new qmb(10);

    /* JADX INFO: renamed from: a */
    public final int f12114a;

    /* JADX INFO: renamed from: b */
    public final int f12115b;

    /* JADX INFO: renamed from: c */
    public final int f12116c;

    /* JADX INFO: renamed from: d */
    public final int f12117d;

    /* JADX INFO: renamed from: e */
    public final float f12118e;

    public zzf(int i, int i2, int i3, int i4, float f) {
        this.f12114a = i;
        this.f12115b = i2;
        this.f12116c = i3;
        this.f12117d = i4;
        this.f12118e = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f12114a);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f12115b);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f12116c);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f12117d);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeFloat(this.f12118e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
