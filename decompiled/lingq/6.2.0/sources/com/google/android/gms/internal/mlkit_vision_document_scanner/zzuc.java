package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuc> CREATOR = new nbd(6);

    /* JADX INFO: renamed from: a */
    public final BitmapTeleporter f12009a;

    public zzuc(BitmapTeleporter bitmapTeleporter) {
        this.f12009a = bitmapTeleporter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15929T(parcel, 1, this.f12009a, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
