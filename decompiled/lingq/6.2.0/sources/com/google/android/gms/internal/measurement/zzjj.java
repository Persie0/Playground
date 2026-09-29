package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjj> CREATOR = new qmb(14);

    /* JADX INFO: renamed from: a */
    public final byte[] f11893a;

    public zzjj(byte[] bArr) {
        this.f11893a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15925P(parcel, 2, this.f11893a);
        l70.m15939b0(parcel, iM15937a0);
    }
}
