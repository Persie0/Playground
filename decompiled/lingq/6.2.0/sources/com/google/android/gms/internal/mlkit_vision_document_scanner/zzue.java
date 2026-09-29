package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzue> CREATOR = new nbd(7);

    /* JADX INFO: renamed from: a */
    public final List f12010a;

    public zzue(ArrayList arrayList) {
        this.f12010a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15934Y(parcel, 1, this.f12010a);
        l70.m15939b0(parcel, iM15937a0);
    }
}
