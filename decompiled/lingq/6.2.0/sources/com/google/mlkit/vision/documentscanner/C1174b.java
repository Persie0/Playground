package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.mlkit.vision.documentscanner.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1174b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new zzg((Uri) parcel.readParcelable(GmsDocumentScanningResult.Page.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }
}
