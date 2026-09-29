package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new qmb(24);

    /* JADX INFO: renamed from: a */
    public final int f12478a;

    /* JADX INFO: renamed from: b */
    public final float f12479b;

    /* JADX INFO: renamed from: c */
    public final float f12480c;

    /* JADX INFO: renamed from: d */
    public final int f12481d;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.f12478a = i;
        this.f12479b = f;
        this.f12480c = f2;
        this.f12481d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f12478a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeFloat(this.f12479b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeFloat(this.f12480c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f12481d);
        l70.m15939b0(parcel, iM15937a0);
    }
}
