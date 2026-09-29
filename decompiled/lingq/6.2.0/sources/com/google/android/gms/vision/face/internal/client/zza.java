package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new qmb(4);

    /* JADX INFO: renamed from: a */
    public final PointF[] f12482a;

    /* JADX INFO: renamed from: b */
    public final int f12483b;

    public zza(PointF[] pointFArr, int i) {
        this.f12482a = pointFArr;
        this.f12483b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15933X(parcel, 2, this.f12482a, i);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f12483b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
