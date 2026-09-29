package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new y3a(27);

    /* JADX INFO: renamed from: a */
    public final Rect f12284a;

    public zzaj(Rect rect) {
        this.f12284a = rect;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15929T(parcel, 2, this.f12284a, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
